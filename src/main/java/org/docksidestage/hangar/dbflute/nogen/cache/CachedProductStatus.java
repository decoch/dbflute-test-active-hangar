package org.docksidestage.hangar.dbflute.nogen.cache;

import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.helper.StringKeyMap;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.ProductStatusDbm;
import org.docksidestage.hangar.dbflute.exbhv.ProductStatusBhv;
import org.docksidestage.hangar.dbflute.exentity.ProductStatus;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/06 Thursday)
 */
public class CachedProductStatus {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final Map<String, ProductStatus> _cacheMap = StringKeyMap.createAsCaseInsensitiveConcurrent();

    protected static final CachedProductStatus _instance = new CachedProductStatus();

    public static CachedProductStatus getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BehaviorSelector _selector; // should be set at initialization

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    protected CachedProductStatus() {
    }

    // ===================================================================================
    //                                                                        Column Cache
    //                                                                        ============
    public <PROP> PROP getColumn(Entity entity, String columnName, String productStatusCode) {
        if (productStatusCode == null) { // basically no way, just in case
            return null;
        }
        final ProductStatus cached = _cacheMap.get(productStatusCode);
        if (cached != null) {
            return read(columnName, cached);
        } else {
            return read(columnName, loadCache(entity, columnName, productStatusCode));
        }
    }

    protected <PROP> PROP read(String columnName, ProductStatus cached) {
        return findColumnInfo(columnName).read(cached);
    }

    protected ColumnInfo findColumnInfo(String columnName) {
        return ProductStatusDbm.getInstance().findColumnInfo(columnName);
    }

    protected ProductStatus loadCache(Entity entity, String propertyName, String productStatusCode) {
        final ProductStatusBhv statusBhv = _selector.select(ProductStatusBhv.class);
        return statusBhv.selectEntity(cb -> {
            cb.disableColumnNullObject(); /* don't forget it or stack over flow */
            cb.acceptPK(CDef.ProductStatus.codeOf(productStatusCode));
        }).map(status -> {
            _cacheMap.put(productStatusCode, status);
            return status;
        }).get();
    }

    // ===================================================================================
    //                                                                    Relational Cache
    //                                                                    ================
    public OptionalEntity<ProductStatus> getRelational(Entity entity, String foreignPropertyName, String memberStatusCode) {
        final ProductStatus status = _cacheMap.get(memberStatusCode);
        if (status != null) {
            return OptionalEntity.of(status);
        } else {
            return OptionalEntity.relationEmpty(entity, foreignPropertyName);
        }
    }

    // ===================================================================================
    //                                                                      Cache Handling
    //                                                                      ==============
    public void put(ProductStatus status) {
        _cacheMap.put(status.getProductStatusCode(), status);
    }

    public void clear() {
        _cacheMap.clear();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public BehaviorSelector getSelector() {
        return _selector;
    }

    public void setSelector(BehaviorSelector selector) {
        _selector = selector;
    }
}

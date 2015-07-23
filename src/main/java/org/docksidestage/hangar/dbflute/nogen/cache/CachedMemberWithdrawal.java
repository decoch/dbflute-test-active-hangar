package org.docksidestage.hangar.dbflute.nogen.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.dbflute.Entity;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberWithdrawalDbm;
import org.docksidestage.hangar.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.hangar.dbflute.exentity.MemberWithdrawal;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/06 Thursday)
 */
public class CachedMemberWithdrawal {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final Map<Integer, MemberWithdrawal> _cacheMap = new ConcurrentHashMap<Integer, MemberWithdrawal>();

    protected static final CachedMemberWithdrawal _instance = new CachedMemberWithdrawal();

    public static CachedMemberWithdrawal getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BehaviorSelector _selector; // should be set at initialization

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    private CachedMemberWithdrawal() {
    }

    // ===================================================================================
    //                                                                        Column Cache
    //                                                                        ============
    public <PROP> PROP getColumn(Entity entity, String columnName, Integer memberId) {
        if (memberId == null) { // basically no way, just in case
            return null;
        }
        final MemberWithdrawal cached = _cacheMap.get(memberId);
        if (cached != null) {
            return read(columnName, cached);
        } else {
            return read(columnName, loadCache(entity, columnName, memberId));
        }
    }

    protected <PROP> PROP read(String columnName, MemberWithdrawal cached) {
        return findColumnInfo(columnName).read(cached);
    }

    protected ColumnInfo findColumnInfo(String columnName) {
        return MemberWithdrawalDbm.getInstance().findColumnInfo(columnName);
    }

    protected MemberWithdrawal loadCache(Entity entity, String propertyName, Integer memberId) {
        final MemberWithdrawalBhv withdrawalBhv = _selector.select(MemberWithdrawalBhv.class);
        return withdrawalBhv.selectEntity(cb -> {
            cb.disableColumnNullObject(); /* don't forget it or stack over flow */
            cb.acceptPK(memberId);
        }).map(withdrawal -> {
            _cacheMap.put(memberId, withdrawal);
            return withdrawal;
        }).get();
    }

    // ===================================================================================
    //                                                                      Cache Handling
    //                                                                      ==============
    public void put(MemberWithdrawal withdrawal) {
        _cacheMap.put(withdrawal.getMemberId(), withdrawal);
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

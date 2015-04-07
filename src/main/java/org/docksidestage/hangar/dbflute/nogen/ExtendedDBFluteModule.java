package org.docksidestage.hangar.dbflute.nogen;

import javax.sql.DataSource;

import org.docksidestage.hangar.dbflute.allcommon.DBFluteModule;
import org.docksidestage.hangar.dbflute.allcommon.ImplementedBehaviorSelector;
import org.docksidestage.hangar.dbflute.nogen.cache.CachedMemberWithdrawal;
import org.docksidestage.hangar.dbflute.nogen.cache.CachedProductStatus;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/18 Tuesday)
 */
public class ExtendedDBFluteModule extends DBFluteModule {

    public ExtendedDBFluteModule(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    protected ImplementedBehaviorSelector createImplementedBehaviorSelector() {
        final ImplementedBehaviorSelector selector = super.createImplementedBehaviorSelector();
        setupSelectorToCacheObject(selector);
        return selector;
    }

    protected void setupSelectorToCacheObject(final ImplementedBehaviorSelector selector) {
        CachedMemberWithdrawal.getInstance().setSelector(selector);
        CachedProductStatus.getInstance().setSelector(selector);
    }
}

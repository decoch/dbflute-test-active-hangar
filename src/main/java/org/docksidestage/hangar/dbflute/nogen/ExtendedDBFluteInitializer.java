package org.docksidestage.hangar.dbflute.nogen;

import org.dbflute.bhv.core.BehaviorCommandInvoker;
import org.dbflute.dbway.DBDef;
import org.dbflute.outsidesql.OutsideSqlOption;
import org.dbflute.outsidesql.executor.OutsideSqlBasicExecutor;
import org.dbflute.outsidesql.factory.DefaultOutsideSqlExecutorFactory;
import org.docksidestage.hangar.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.hangar.dbflute.allcommon.DBFluteInitializer;

/**
 * @author jflute
 */
public class ExtendedDBFluteInitializer extends DBFluteInitializer {

    public ExtendedDBFluteInitializer() {
    }

    @Override
    protected void prologue() { // the example for fixed DBFluteConfig settings
        super.prologue(); // you need to call this

        final DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();

        config.setOutsideSqlExecutorFactory(new DefaultOutsideSqlExecutorFactory() {
            @Override
            public <BEHAVIOR> OutsideSqlBasicExecutor<BEHAVIOR> createBasic(BehaviorCommandInvoker behaviorCommandInvoker,
                    String tableDbName, DBDef currentDBDef, OutsideSqlOption outsideSqlOption) {
                final OutsideSqlBasicExecutor<BEHAVIOR> executor =
                        super.createBasic(behaviorCommandInvoker, tableDbName, currentDBDef, outsideSqlOption);
                return executor.removeLineComment().removeBlockComment(); // the test of removing
            }
        });

        config.lock();
    }
}

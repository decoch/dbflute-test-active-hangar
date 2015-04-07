package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.pmbean.PmCommentHintPmb;
import org.docksidestage.hanger.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4A (2013/03/21 Thursday)
 */
public class WxOutsideSqlDefaultRemoveTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                                Hint
    //                                                                                ====
    public void test_Hint_basic() throws Exception {
        // ## Arrange ##
        PmCommentHintPmb pmb = new PmCommentHintPmb();
        final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                infoList.add(info);
            }
        });

        // ## Act ##
        try {
            memberBhv.outsideSql().selectList(pmb);

            // ## Assert ##
            assertEquals(1, infoList.size());
            String executedSql = infoList.get(0).getExecutedSql();
            assertFalse(executedSql.contains("/*! MySQL*/"));
            assertFalse(executedSql.contains("/*+ Oracle*/"));
            assertFalse(executedSql.contains("--+ OracleLine"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }
}

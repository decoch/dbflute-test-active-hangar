package org.docksidestage.hangar.dbflute.whitebox.dfprop;

import org.dbflute.bhv.BehaviorSelector;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5B (2014/02/19 Wednesday)
 */
public class WxClassificationSuppressBehaviorTest extends UnitContainerTestCase {

    private BehaviorSelector behaviorSelector;

    public void test_initializeConditionBeanMetaData() throws Exception {
        behaviorSelector.initializeConditionBeanMetaData();
    }

    public void test_notGenerated() throws Exception {
        String pkg = MemberBhv.class.getPackage().getName();
        Class.forName(pkg + ".ProductStatusBhv");
        try {
            Class.forName(pkg + ".WithdrawalReasonBhv");
            fail();
        } catch (ClassNotFoundException e) {
            log(e.getMessage());
        }
    }
}

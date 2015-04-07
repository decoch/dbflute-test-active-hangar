package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.hangar.dbflute.allcommon.CDef;

/**
 * @author jflute
 * @since 1.1.0-sp1 (2015/01/26 Monday)
 */
public class WxClassificationSisterCodeTableClsTest extends PlainTestCase {

    public void test_codeOf_sisterCode() throws Exception {
        assertEquals(CDef.WithdrawalReason.Sit, CDef.WithdrawalReason.codeOf("SIT"));
        assertEquals(CDef.WithdrawalReason.Sit, CDef.WithdrawalReason.codeOf(1));
        assertEquals(CDef.WithdrawalReason.Prd, CDef.WithdrawalReason.codeOf("PRD"));
        assertEquals(CDef.WithdrawalReason.Prd, CDef.WithdrawalReason.codeOf(2));
    }
}

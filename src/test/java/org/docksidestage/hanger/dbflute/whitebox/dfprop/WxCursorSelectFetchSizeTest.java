package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.hangar.dbflute.allcommon.DBFluteConfig;

/**
 * @author jflute
 * @since 0.9.9.4A (2012/04/07 Saturday)
 */
public class WxCursorSelectFetchSizeTest extends PlainTestCase {

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_dbmeta() {
        assertEquals(17, DBFluteConfig.getInstance().getCursorSelectFetchSize());
    }
}

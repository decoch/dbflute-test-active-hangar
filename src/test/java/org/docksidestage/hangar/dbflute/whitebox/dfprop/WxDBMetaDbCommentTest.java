package org.docksidestage.hangar.dbflute.whitebox.dfprop;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.VendorCheckDbm;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/09 Sunday)
 */
public class WxDBMetaDbCommentTest extends PlainTestCase {

    public void test_tableInfo_tableComment() {
        // ## Arrange ##
        MemberDbm dbm = MemberDbm.getInstance();

        // ## Act & Assert ##
        log("comment=" + dbm.getTableComment());
        assertNotNull(dbm.getTableComment());
        assertNull(VendorCheckDbm.getInstance().getTableComment());
    }

    public void test_columnInfo_commonComment() {
        // ## Arrange & Act & Assert ##
        log("memberId=" + MemberDbm.getInstance().columnMemberId().getColumnComment());
        log("memberName=" + MemberDbm.getInstance().columnMemberName().getColumnComment());
        assertNotNull(MemberDbm.getInstance().columnMemberId().getColumnComment());
        assertNotNull(MemberDbm.getInstance().columnMemberName().getColumnComment());
        assertNull(VendorCheckDbm.getInstance().columnTypeOfVarchar().getColumnComment());
    }
}

package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberWithdrawalDbm;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.ProductStatusDbm;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.ProductStatusBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hanger.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/17 Monday)
 */
public class WxColumnNullObjectTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private ProductStatusBhv productStatusBhv;

    public void test_basePoint() {
        // ## Arrange ##
        ColumnInfo columnInfo = ProductStatusDbm.getInstance().columnDisplayOrder();
        assertTrue(columnInfo.canBeNullObject());

        // ## Act ##
        productStatusBhv.selectEntity(cb -> {
            cb.query().setProductStatusCode_Equal_生産中止();
            pushCB(cb);
        }).alwaysPresent(status -> {
            /* ## Assert ## */
            log(status.getProductStatusName(), status.getDisplayOrder());
            String sql = popCB().toDisplaySql();
            assertNotContainsIgnoreCase(sql, columnInfo.getColumnDbName());
        });
    }

    public void test_referrerAsOne() {
        // ## Arrange ##
        ColumnInfo columnInfo = MemberWithdrawalDbm.getInstance().columnWithdrawalReasonInputText();
        assertTrue(columnInfo.canBeNullObject());

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.setupSelect_MemberWithdrawalAsOne();
            pushCB(cb);
        });

        // ## Assert ##
        assertHasAnyElement(memberList);
        memberList.forEach(member -> {
            member.getMemberWithdrawalAsOne().ifPresent(withdrawal -> {
                log(withdrawal.getMemberId(), withdrawal.getWithdrawalReasonInputText());
                markHere("existsWithdrawal");
            });
        });
        assertMarked("existsWithdrawal");
        String sql = popCB().toDisplaySql();
        assertNotContainsIgnoreCase(sql, columnInfo.getColumnDbName());
    }
}

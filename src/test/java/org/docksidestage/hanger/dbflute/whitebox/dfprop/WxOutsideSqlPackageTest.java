package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exbhv.pmbean.SimpleMemberPmb;
import org.docksidestage.hangar.dbflute.exbhv.pmbean.SubDirectoryCheckPmb;
import org.docksidestage.hangar.dbflute.exentity.customize.SimpleMember;
import org.docksidestage.hangar.dbflute.exentity.customize.SubDirectoryCheck;
import org.docksidestage.hanger.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4A (2013/03/21 Thursday)
 */
public class WxOutsideSqlPackageTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    public void test_BehaviorSql_selectList() {
        // ## Arrange ##
        SimpleMemberPmb pmb = new SimpleMemberPmb();
        pmb.setMemberName_PrefixSearch("S");

        // ## Act ##
        List<SimpleMember> memberList = memberBhv.outsideSql().selectList(pmb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (SimpleMember member : memberList) {
            Integer memberId = member.getMemberId();
            String memberName = member.getMemberName();
            String memberStatusName = member.getMemberStatusName();
            log(memberId, memberName, memberStatusName);
            assertNotNull(memberId);
            assertNotNull(memberName);
            assertNotNull(memberStatusName);
            assertTrue(memberName.startsWith("S"));
        }
    }

    public void test_BehaviorSql_subDirectory() {
        // ## Arrange ##
        SubDirectoryCheckPmb pmb = new SubDirectoryCheckPmb();

        // ## Act ##
        ListResultBean<SubDirectoryCheck> checkList = memberBhv.outsideSql().selectList(pmb); // expects call-able

        // ## Assert ##
        assertHasAnyElement(checkList);
        for (SubDirectoryCheck check : checkList) {
            log(check);
        }
    }
}

package org.docksidestage.hangar.dbflute.whitebox.dfprop;

import java.lang.reflect.Field;

import org.dbflute.exception.SQLFailureException;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.9 (2010/05/13 Thursday)
 */
public class WxEntityConvertEmptyStringToNullTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    public void test_getter_filtered() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("");
        member.setMemberAccount(null);
        member.setRegisterUser(" ");

        // ## Act & Assert ##
        assertNull(member.getMemberName());
        assertNull(member.getMemberAccount());
        assertEquals(" ", member.getRegisterUser());
        assertNull(member.getUpdateUser());
        Field field = DfReflectionUtil.getAccessibleField(Member.class, "_memberName");
        field.setAccessible(true);
        assertEquals("", DfReflectionUtil.getValue(field, member));
    }

    public void test_update_filtered_emptyString() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName("");

        // ## Act ##
        try {
            memberBhv.updateNonstrict(member);

            // ## Assert ##
            fail("should not allowed to update by null value");
        } catch (SQLFailureException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_update_filtered_spaceString() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberId(3);
        member.setMemberName(" ");

        // ## Act ##
        memberBhv.updateNonstrict(member);

        // ## Assert ##
        Member actual = memberBhv.selectByPK(3).get();
        assertEquals(" ", actual.getMemberName());
    }
}

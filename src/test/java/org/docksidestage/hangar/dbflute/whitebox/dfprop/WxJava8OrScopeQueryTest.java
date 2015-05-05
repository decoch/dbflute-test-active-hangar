package org.docksidestage.hangar.dbflute.whitebox.dfprop;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.exception.OrderByIllegalPurposeException;
import org.dbflute.exception.SetupSelectIllegalPurposeException;
import org.dbflute.exception.SpecifyIllegalPurposeException;
import org.docksidestage.hangar.dbflute.cbean.MemberCB;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5G (2014/05/27 Tuesday)
 */
public class WxJava8OrScopeQueryTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;

    public void test_orScopeQuery_normalUse() {
        // ## Arrange ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            /* ## Act ## */
            cb.orScopeQuery(new OrQuery<MemberCB>() {
                public void query(MemberCB orCB) {
                    orCB.query().setMemberName_LikeSearch("S", op -> op.likePrefix());
                    orCB.query().setMemberStatusCode_Equal_Formalized();
                }
            });
        });


        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            log(member);
        }
    }

    public void test_orScopeQuery_illegalPurpose() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        try {
            cb.orScopeQuery(new OrQuery<MemberCB>() {
                public void query(MemberCB orCB) {
                    orCB.setupSelect_MemberStatus();
                }
            });
            // ## Assert ##
            fail();
        } catch (SetupSelectIllegalPurposeException e) {
            log(e.getMessage());
        }
        try {
            cb.orScopeQuery(new OrQuery<MemberCB>() {
                public void query(MemberCB orCB) {
                    orCB.specify();
                }
            });
            // ## Assert ##
            fail();
        } catch (SpecifyIllegalPurposeException e) {
            log(e.getMessage());
        }
        try {
            cb.orScopeQuery(new OrQuery<MemberCB>() {
                public void query(MemberCB orCB) {
                    orCB.query().addOrderBy_Birthdate_Asc();
                }
            });
            // ## Assert ##
            fail();
        } catch (OrderByIllegalPurposeException e) {
            log(e.getMessage());
        }
    }
}

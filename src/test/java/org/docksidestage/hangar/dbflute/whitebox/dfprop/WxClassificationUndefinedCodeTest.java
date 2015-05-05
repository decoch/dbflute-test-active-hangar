package org.docksidestage.hangar.dbflute.whitebox.dfprop;

import org.dbflute.exception.UndefinedClassificationCodeException;
import org.dbflute.optional.OptionalThingConsumer;
import org.docksidestage.hangar.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.hangar.dbflute.exbhv.PurchasePaymentBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.dbflute.exentity.Purchase;
import org.docksidestage.hangar.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.0-sp2 (2015/03/22 Sunday)
 */
public class WxClassificationUndefinedCodeTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;
    private PurchasePaymentBhv purchasePaymentBhv;

    // ===================================================================================
    //                                                                             Correct
    //                                                                             =======
    public void test_select_correct_classification() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPaymentCompleteFlg_True();
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        Purchase actual = purchaseBhv.selectByPK(3L).get();

        // ## Assert ##
        assertNotNull(actual.getPaymentCompleteFlg());
        assertTrue(actual.isPaymentCompleteFlgTrue());
    }

    public void test_select_correct_classification_relation() throws Exception {
        // ## Arrange ##
        Purchase actual = purchaseBhv.selectEntityWithDeletedCheck(cb -> {
            /* ## Act ## */
            cb.setupSelect_Member();
            cb.query().setPurchaseId_Equal(3L);
        });

        // ## Assert ##
        assertNotNull(actual.getPaymentCompleteFlg());
        assertTrue(actual.isPaymentCompleteFlgTrue());
        actual.getMember().alwaysPresent(new OptionalThingConsumer<Member>() {
            public void accept(Member obj) {
                assertNotNull(obj.getMemberStatusCode());
                assertNotNull(obj.getMemberStatusCodeAsMemberStatus());
            }
        });
    }

    // ===================================================================================
    //                                                                             Checked
    //                                                                             =======
    public void test_select_illegal_classification_checked_basePoint() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.xznocheckSetPaymentCompleteFlg(99999);
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        try {
            purchaseBhv.selectByPK(3L);

            // ## Assert ##
            fail();
        } catch (UndefinedClassificationCodeException e) {
            log(e.getMessage());
        }
    }

    public void test_select_illegal_classification_checked_relation() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.xznocheckSetPaymentCompleteFlg(99999);
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        try {
            purchasePaymentBhv.selectList(cb -> {
                cb.setupSelect_Purchase();
                cb.query().setPurchaseId_Equal(3L);
            });

            // ## Assert ##
            fail();
        } catch (UndefinedClassificationCodeException e) {
            log(e.getMessage());
        }
    }

    // ===================================================================================
    //                                                                              Unlock
    //                                                                              ======
    public void test_select_illegal_classification_unlock_basePoint() throws Exception {
        // ## Arrange ##
        {
            Purchase purchase = new Purchase();
            purchase.setPurchaseId(3L);
            purchase.xznocheckSetPaymentCompleteFlg(99999);
            purchaseBhv.updateNonstrict(purchase);
        }

        // ## Act ##
        purchaseBhv.selectEntity(cb -> {
            cb.enableUndefinedClassificationSelect();
            cb.acceptPK(3L);
        }).alwaysPresent(purchase -> {
            /* ## Assert ## */
            Integer completeFlg = purchase.getPaymentCompleteFlg();
            assertEquals(99999, completeFlg);
        });
    }

    public void test_select_illegal_classification_unlocked_relation() throws Exception {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.xznocheckSetPaymentCompleteFlg(99999);
        purchaseBhv.updateNonstrict(purchase);

        // ## Act ##
        purchasePaymentBhv.selectList(cb -> {
            cb.enableUndefinedClassificationSelect();
            cb.setupSelect_Purchase();
            cb.query().setPurchaseId_Equal(3L);
        }).stream().forEach(payment -> {
            payment.getPurchase().alwaysPresent(purchaes -> {
                /* ## Assert ## */
                Integer completeFlg = purchase.getPaymentCompleteFlg();
                assertEquals(99999, completeFlg);
                markHere("exists");
            });
        });
        assertMarked("exists");
    }
}

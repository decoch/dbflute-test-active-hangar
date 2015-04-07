package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.hangar.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.hangar.dbflute.exbhv.WhiteDateTermBhv;
import org.docksidestage.hangar.dbflute.exentity.Purchase;
import org.docksidestage.hangar.dbflute.exentity.WhiteDateTerm;
import org.docksidestage.hanger.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.0 (2014/10/22 Wednesday)
 */
public class WxAdditionalForeignKeyFixedOnlyJoinTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;
    private WhiteDateTermBhv whiteDateTermBhv;

    public void test_fixedOnlyJoin_SetupSelect_basic() throws Exception {
        // ## Arrange ##
        registerDateTerm();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb -> {
            cb.setupSelect_WhiteDateTermAsValid();
            pushCB(cb);
        });

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        for (Purchase purchase : purchaseList) {
            purchase.getWhiteDateTermAsValid().alwaysPresent(term -> {
                log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), term);
            }); // expects no exception
        }
        String sql = popCB().toDisplaySql();
        assertContainsAll(sql, "  on dfrel", ".BEGIN_DATE <= dfloc.PURCHASE_DATETIME");
        assertContainsAll(sql, " and dfrel", ".END_DATE >= dfloc.PURCHASE_DATETIME");
    }

    public void test_fixedOnlyJoin_QueryRelation_basic() throws Exception {
        // ## Arrange ##
        registerDateTerm();

        // ## Act ##
        purchaseBhv.selectList(cb -> {
            cb.setupSelect_WhiteDateTermAsValid();
            cb.query().queryWhiteDateTermAsValid().setDateTermValue_Equal("sea");
        }).forEach(purchase -> {
            /* ## Assert ## */
            markHere("exists");
            purchase.getWhiteDateTermAsValid().alwaysPresent(term -> {
                log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), term);
            });
        }); // expects no exception
        assertMarked("exists");
    }

    protected void registerDateTerm() {
        doRegisterDateTerm(1001L, "sea", "1900/09/26", "2006/09/25");
        doRegisterDateTerm(1002L, "land", "2006/09/26", "2007/10/31");
        doRegisterDateTerm(1003L, "iks", "2007/11/01", "2007/12/31");
        doRegisterDateTerm(1004L, "amphi", "2008/01/01", "2099/08/20");
    }

    protected void doRegisterDateTerm(Long id, String value, String begin, String end) {
        WhiteDateTerm term = new WhiteDateTerm();
        term.setDateTermId(id);
        term.setDateTermValue(value);
        term.setBeginDate(toLocalDate(begin));
        term.setEndDate(toLocalDate(end));
        whiteDateTermBhv.insert(term);
    }
}

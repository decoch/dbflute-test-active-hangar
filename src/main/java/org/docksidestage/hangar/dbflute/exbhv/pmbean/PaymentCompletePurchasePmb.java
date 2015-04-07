package org.docksidestage.hangar.dbflute.exbhv.pmbean;

import org.docksidestage.hangar.dbflute.bsbhv.pmbean.BsPaymentCompletePurchasePmb;

/**
 * <!-- df:beginClassDescription -->
 * The typed parameter-bean of PaymentCompletePurchase. <span style="color: #AD4747">(typed to manual-paging, cursor)</span><br>
 * This is related to "<span style="color: #AD4747">selectPaymentCompletePurchase</span>" on PurchaseBhv, <br>
 * described as "Example for Cursor and Paging select". <br>
 * <!-- df:endClassDescription -->
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class PaymentCompletePurchasePmb extends BsPaymentCompletePurchasePmb {

    protected boolean _cursor;

    public PaymentCompletePurchasePmb(boolean cursor) {
        _cursor = cursor;
    }

    @Override
    public boolean isCursor() {
        return _cursor;
    }
}

package org.docksidestage.hangar.freeflute.basic.onetofree.bsentity;

import java.io.Serializable;
import org.docksidestage.hangar.freeflute.basic.onetofree.exentity.*;

/**
 * purchase table
 * @author FreeGen
 */
public class BsSeaPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PURCHASE_ID: ${column.comment} */
    protected Integer purchaseId;

    /** MEMBER_ID: ${column.comment} */
    protected Integer memberId;

    /** PURCHASE_DATETIME: ${column.comment} */
    protected java.time.LocalDateTime purchaseDatetime;

    /** PURCHASE_PRICE: ${column.comment} */
    protected Integer purchasePrice;

    /** SEA_MEMBER: ${column.comment} */
    protected SeaMember seaMember;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Integer value) {
        purchaseId = value;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer value) {
        memberId = value;
    }

    public java.time.LocalDateTime getPurchaseDatetime() {
        return purchaseDatetime;
    }

    public void setPurchaseDatetime(java.time.LocalDateTime value) {
        purchaseDatetime = value;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer value) {
        purchasePrice = value;
    }

    public SeaMember getSeaMember() {
        return seaMember;
    }

    public void setSeaMember(SeaMember value) {
        seaMember = value;
    }

}

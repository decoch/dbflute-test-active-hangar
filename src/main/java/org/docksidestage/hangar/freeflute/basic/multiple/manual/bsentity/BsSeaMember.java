package org.docksidestage.hangar.freeflute.basic.multiple.manual.bsentity;

import java.io.Serializable;
import org.docksidestage.hangar.freeflute.basic.multiple.manual.exentity.*;

/**
 * member table
 * @author FreeGen
 */
public class BsSeaMember implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MEMBER_ID: identity */
    protected Integer memberId;

    /** MEMBER_NAME: ${column.comment} */
    protected String memberName;

    /** MEMBER_ACCOUNT: ${column.comment} */
    protected String memberAccount;

    /** BIRTHDATE: ${column.comment} */
    protected java.time.LocalDate birthdate;

    /** FORMALIZED_DATETIME: ${column.comment} */
    protected java.time.LocalDateTime formalizedDatetime;

    /** MEMBER_STATUS_CODE: ${column.comment} */
    protected String memberStatusCode;

    /** SEA_MEMBER_STATUS: ${column.comment} */
    protected SeaMemberStatus seaMemberStatus;

    // [Referrers] *comment only
    // o SEA_PURCHASE

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer value) {
        memberId = value;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String value) {
        memberName = value;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String value) {
        memberAccount = value;
    }

    public java.time.LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(java.time.LocalDate value) {
        birthdate = value;
    }

    public java.time.LocalDateTime getFormalizedDatetime() {
        return formalizedDatetime;
    }

    public void setFormalizedDatetime(java.time.LocalDateTime value) {
        formalizedDatetime = value;
    }

    public String getMemberStatusCode() {
        return memberStatusCode;
    }

    public void setMemberStatusCode(String value) {
        memberStatusCode = value;
    }

    public SeaMemberStatus getSeaMemberStatus() {
        return seaMemberStatus;
    }

    public void setSeaMemberStatus(SeaMemberStatus value) {
        seaMemberStatus = value;
    }

}

package org.docksidestage.hangar.simpleflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.docksidestage.hangar.simpleflute.AppCDef;

/**
 * The simple DTO of OptionMember. <br>
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     MEMBER_ID, MEMBER_NAME, BIRTHDATE, FORMALIZED_DATETIME, MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, STATUS_DISPLAY_ORDER, DUMMY_FLG, DUMMY_NOFLG
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsOptionMemberDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} */
    @JsonKey
    protected Integer _memberId;

    /** MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    @JsonKey
    protected String _memberName;

    /** BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} */
    @JsonKey
    protected java.time.LocalDate _birthdate;

    /** FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} */
    @JsonKey
    protected java.time.LocalDateTime _formalizedDatetime;

    /** MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} */
    @JsonKey
    protected String _memberStatusCode;

    /** MEMBER_STATUS_NAME: {NotNull, VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    @JsonKey
    protected String _memberStatusName;

    /** STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} */
    @JsonKey
    protected Integer _statusDisplayOrder;

    /** DUMMY_FLG: {INTEGER(10), classification=Flg} */
    @JsonKey
    protected Integer _dummyFlg;

    /** DUMMY_NOFLG: {INTEGER(10)} */
    @JsonKey
    protected Integer _dummyNoflg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsOptionMemberDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Set the value of memberStatusCode as the classification of MemberStatus. <br>
     * status of member from entry to withdrawal
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus cdef) {
        setMemberStatusCode(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of memberStatusCode as the classification of MemberStatus. <br>
     * status of member from entry to withdrawal
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.MemberStatus getMemberStatusCodeAsMemberStatus() {
        return AppCDef.MemberStatus.codeOf(getMemberStatusCode());
    }

    /**
     * Set the value of dummyFlg as the classification of Flg. <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setDummyFlgAsFlg(AppCDef.Flg cdef) {
        setDummyFlg(cdef != null ? Integer.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of dummyFlg as the classification of Flg. <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.Flg getDummyFlgAsFlg() {
        return AppCDef.Flg.codeOf(getDummyFlg());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of memberStatusCode as Formalized. <br>
     * Formalized: as formal member, allowed to use all service
     */
    public void setMemberStatusCode_Formalized() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Formalized);
    }

    /**
     * Set the value of memberStatusCode as Withdrawal. <br>
     * Withdrawal: withdrawal is fixed, not allowed to use service
     */
    public void setMemberStatusCode_Withdrawal() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Withdrawal);
    }

    /**
     * Set the value of memberStatusCode as Provisional. <br>
     * Provisional: first status after entry, allowed to use only part of service
     */
    public void setMemberStatusCode_Provisional() {
        setMemberStatusCodeAsMemberStatus(AppCDef.MemberStatus.Provisional);
    }

    /**
     * Set the value of dummyFlg as True. <br>
     * Yes: means valid
     */
    public void setDummyFlg_True() {
        setDummyFlgAsFlg(AppCDef.Flg.True);
    }

    /**
     * Set the value of dummyFlg as False. <br>
     * No: means invalid
     */
    public void setDummyFlg_False() {
        setDummyFlgAsFlg(AppCDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of memberStatusCode 'Formalized'? <br>
     * Formalized: as formal member, allowed to use all service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeFormalized() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Formalized) : false;
    }

    /**
     * Is the value of memberStatusCode 'Withdrawal'? <br>
     * Withdrawal: withdrawal is fixed, not allowed to use service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeWithdrawal() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Withdrawal) : false;
    }

    /**
     * Is the value of memberStatusCode 'Provisional'? <br>
     * Provisional: first status after entry, allowed to use only part of service
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isMemberStatusCodeProvisional() {
        AppCDef.MemberStatus cdef = getMemberStatusCodeAsMemberStatus();
        return cdef != null ? cdef.equals(AppCDef.MemberStatus.Provisional) : false;
    }

    /**
     * Is the value of dummyFlg 'True'? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDummyFlgTrue() {
        AppCDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.True) : false;
    }

    /**
     * Is the value of dummyFlg 'False'? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDummyFlgFalse() {
        AppCDef.Flg cdef = getDummyFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsOptionMemberDto)) { return false; }
        final BsOptionMemberDto otherEntity = (BsOptionMemberDto)other;
        if (!helpComparingValue(getMemberId(), otherEntity.getMemberId())) { return false; }
        if (!helpComparingValue(getMemberName(), otherEntity.getMemberName())) { return false; }
        if (!helpComparingValue(getBirthdate(), otherEntity.getBirthdate())) { return false; }
        if (!helpComparingValue(getFormalizedDatetime(), otherEntity.getFormalizedDatetime())) { return false; }
        if (!helpComparingValue(getMemberStatusCode(), otherEntity.getMemberStatusCode())) { return false; }
        if (!helpComparingValue(getMemberStatusName(), otherEntity.getMemberStatusName())) { return false; }
        if (!helpComparingValue(getStatusDisplayOrder(), otherEntity.getStatusDisplayOrder())) { return false; }
        if (!helpComparingValue(getDummyFlg(), otherEntity.getDummyFlg())) { return false; }
        if (!helpComparingValue(getDummyNoflg(), otherEntity.getDummyNoflg())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "OptionMember");
        result = xCH(result, getMemberId());
        result = xCH(result, getMemberName());
        result = xCH(result, getBirthdate());
        result = xCH(result, getFormalizedDatetime());
        result = xCH(result, getMemberStatusCode());
        result = xCH(result, getMemberStatusName());
        result = xCH(result, getStatusDisplayOrder());
        result = xCH(result, getDummyFlg());
        result = xCH(result, getDummyNoflg());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getMemberId());
        sb.append(c).append(getMemberName());
        sb.append(c).append(getBirthdate());
        sb.append(c).append(getFormalizedDatetime());
        sb.append(c).append(getMemberStatusCode());
        sb.append(c).append(getMemberStatusName());
        sb.append(c).append(getStatusDisplayOrder());
        sb.append(c).append(getDummyFlg());
        sb.append(c).append(getDummyNoflg());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * @return The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public Integer getMemberId() {
        return _memberId;
    }

    /**
     * [set] MEMBER_ID: {INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * @param memberId The value of the column 'MEMBER_ID'. (NullAllowed)
     */
    public void setMemberId(Integer memberId) {
        __modifiedProperties.add("memberId");
        this._memberId = memberId;
    }

    /**
     * [get] MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * @return The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public String getMemberName() {
        return _memberName;
    }

    /**
     * [set] MEMBER_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * @param memberName The value of the column 'MEMBER_NAME'. (NullAllowed)
     */
    public void setMemberName(String memberName) {
        __modifiedProperties.add("memberName");
        this._memberName = memberName;
    }

    /**
     * [get] BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br>
     * @return The value of the column 'BIRTHDATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getBirthdate() {
        return _birthdate;
    }

    /**
     * [set] BIRTHDATE: {DATE(8), refers to MEMBER.BIRTHDATE} <br>
     * @param birthdate The value of the column 'BIRTHDATE'. (NullAllowed)
     */
    public void setBirthdate(java.time.LocalDate birthdate) {
        __modifiedProperties.add("birthdate");
        this._birthdate = birthdate;
    }

    /**
     * [get] FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br>
     * @return The value of the column 'FORMALIZED_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getFormalizedDatetime() {
        return _formalizedDatetime;
    }

    /**
     * [set] FORMALIZED_DATETIME: {TIMESTAMP(23, 10), refers to MEMBER.FORMALIZED_DATETIME} <br>
     * @param formalizedDatetime The value of the column 'FORMALIZED_DATETIME'. (NullAllowed)
     */
    public void setFormalizedDatetime(java.time.LocalDateTime formalizedDatetime) {
        __modifiedProperties.add("formalizedDatetime");
        this._formalizedDatetime = formalizedDatetime;
    }

    /**
     * [get] MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * @return The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public String getMemberStatusCode() {
        return _memberStatusCode;
    }

    /**
     * [set] MEMBER_STATUS_CODE: {CHAR(3), refers to MEMBER.MEMBER_STATUS_CODE, classification=MemberStatus} <br>
     * @param memberStatusCode The value of the column 'MEMBER_STATUS_CODE'. (NullAllowed)
     */
    public void setMemberStatusCode(String memberStatusCode) {
        __modifiedProperties.add("memberStatusCode");
        this._memberStatusCode = memberStatusCode;
    }

    /**
     * [get] MEMBER_STATUS_NAME: {NotNull, VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * @return The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public String getMemberStatusName() {
        return _memberStatusName;
    }

    /**
     * [set] MEMBER_STATUS_NAME: {NotNull, VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * @param memberStatusName The value of the column 'MEMBER_STATUS_NAME'. (NullAllowed)
     */
    public void setMemberStatusName(String memberStatusName) {
        __modifiedProperties.add("memberStatusName");
        this._memberStatusName = memberStatusName;
    }

    /**
     * [get] STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br>
     * @return The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed)
     */
    public Integer getStatusDisplayOrder() {
        return _statusDisplayOrder;
    }

    /**
     * [set] STATUS_DISPLAY_ORDER: {INTEGER(10), refers to MEMBER_STATUS.DISPLAY_ORDER} <br>
     * @param statusDisplayOrder The value of the column 'STATUS_DISPLAY_ORDER'. (NullAllowed)
     */
    public void setStatusDisplayOrder(Integer statusDisplayOrder) {
        __modifiedProperties.add("statusDisplayOrder");
        this._statusDisplayOrder = statusDisplayOrder;
    }

    /**
     * [get] DUMMY_FLG: {INTEGER(10), classification=Flg} <br>
     * @return The value of the column 'DUMMY_FLG'. (NullAllowed)
     */
    public Integer getDummyFlg() {
        return _dummyFlg;
    }

    /**
     * [set] DUMMY_FLG: {INTEGER(10), classification=Flg} <br>
     * @param dummyFlg The value of the column 'DUMMY_FLG'. (NullAllowed)
     */
    public void setDummyFlg(Integer dummyFlg) {
        __modifiedProperties.add("dummyFlg");
        this._dummyFlg = dummyFlg;
    }

    /**
     * [get] DUMMY_NOFLG: {INTEGER(10)} <br>
     * @return The value of the column 'DUMMY_NOFLG'. (NullAllowed)
     */
    public Integer getDummyNoflg() {
        return _dummyNoflg;
    }

    /**
     * [set] DUMMY_NOFLG: {INTEGER(10)} <br>
     * @param dummyNoflg The value of the column 'DUMMY_NOFLG'. (NullAllowed)
     */
    public void setDummyNoflg(Integer dummyNoflg) {
        __modifiedProperties.add("dummyNoflg");
        this._dummyNoflg = dummyNoflg;
    }

}

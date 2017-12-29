package org.docksidestage.hangar.simpleflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of UnpaidSummaryMember. <br>
 * <pre>
 * [primary-key]
 *     UNPAID_MAN_ID
 * 
 * [column]
 *     UNPAID_MAN_ID, UNPAID_MAN_NAME, UNPAID_PRICE_SUMMARY, STATUS_NAME
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
public abstract class BsUnpaidSummaryMemberDto implements Serializable {

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
    /** UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} */
    @JsonKey
    protected Integer _unpaidManId;

    /** UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} */
    @JsonKey
    protected String _unpaidManName;

    /** UNPAID_PRICE_SUMMARY: {BIGINT(10)} */
    @JsonKey
    protected Long _unpaidPriceSummary;

    /** STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} */
    @JsonKey
    protected String _statusName;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUnpaidSummaryMemberDto() {
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
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsUnpaidSummaryMemberDto)) { return false; }
        final BsUnpaidSummaryMemberDto otherEntity = (BsUnpaidSummaryMemberDto)other;
        if (!helpComparingValue(getUnpaidManId(), otherEntity.getUnpaidManId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "UnpaidSummaryMember");
        result = xCH(result, getUnpaidManId());
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
        sb.append(c).append(getUnpaidManId());
        sb.append(c).append(getUnpaidManName());
        sb.append(c).append(getUnpaidPriceSummary());
        sb.append(c).append(getStatusName());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * @return The value of the column 'UNPAID_MAN_ID'. (NullAllowed)
     */
    public Integer getUnpaidManId() {
        return _unpaidManId;
    }

    /**
     * [set] UNPAID_MAN_ID: {PK, INTEGER(10), refers to MEMBER.MEMBER_ID} <br>
     * @param unpaidManId The value of the column 'UNPAID_MAN_ID'. (NullAllowed)
     */
    public void setUnpaidManId(Integer unpaidManId) {
        __modifiedProperties.add("unpaidManId");
        this._unpaidManId = unpaidManId;
    }

    /**
     * [get] UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * @return The value of the column 'UNPAID_MAN_NAME'. (NullAllowed)
     */
    public String getUnpaidManName() {
        return _unpaidManName;
    }

    /**
     * [set] UNPAID_MAN_NAME: {VARCHAR(200), refers to MEMBER.MEMBER_NAME} <br>
     * @param unpaidManName The value of the column 'UNPAID_MAN_NAME'. (NullAllowed)
     */
    public void setUnpaidManName(String unpaidManName) {
        __modifiedProperties.add("unpaidManName");
        this._unpaidManName = unpaidManName;
    }

    /**
     * [get] UNPAID_PRICE_SUMMARY: {BIGINT(10)} <br>
     * @return The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed)
     */
    public Long getUnpaidPriceSummary() {
        return _unpaidPriceSummary;
    }

    /**
     * [set] UNPAID_PRICE_SUMMARY: {BIGINT(10)} <br>
     * @param unpaidPriceSummary The value of the column 'UNPAID_PRICE_SUMMARY'. (NullAllowed)
     */
    public void setUnpaidPriceSummary(Long unpaidPriceSummary) {
        __modifiedProperties.add("unpaidPriceSummary");
        this._unpaidPriceSummary = unpaidPriceSummary;
    }

    /**
     * [get] STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * @return The value of the column 'STATUS_NAME'. (NullAllowed)
     */
    public String getStatusName() {
        return _statusName;
    }

    /**
     * [set] STATUS_NAME: {VARCHAR(50), refers to MEMBER_STATUS.MEMBER_STATUS_NAME} <br>
     * @param statusName The value of the column 'STATUS_NAME'. (NullAllowed)
     */
    public void setStatusName(String statusName) {
        __modifiedProperties.add("statusName");
        this._statusName = statusName;
    }

}

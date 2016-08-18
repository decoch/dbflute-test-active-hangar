package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_DATE_TERM as TABLE. <br>
 * <pre>
 * [primary-key]
 *     DATE_TERM_ID
 *
 * [column]
 *     DATE_TERM_ID, DATE_TERM_VALUE, BEGIN_DATE, END_DATE
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long dateTermId = entity.getDateTermId();
 * String dateTermValue = entity.getDateTermValue();
 * java.time.LocalDate beginDate = entity.getBeginDate();
 * java.time.LocalDate endDate = entity.getEndDate();
 * entity.setDateTermId(dateTermId);
 * entity.setDateTermValue(dateTermValue);
 * entity.setBeginDate(beginDate);
 * entity.setEndDate(endDate);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteDateTerm extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** DATE_TERM_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _dateTermId;

    /** DATE_TERM_VALUE: {NotNull, VARCHAR(200)} */
    protected String _dateTermValue;

    /** BEGIN_DATE: {NotNull, DATE(8)} */
    protected java.time.LocalDate _beginDate;

    /** END_DATE: {NotNull, DATE(8)} */
    protected java.time.LocalDate _endDate;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_DATE_TERM";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_dateTermId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhiteDateTerm) {
            BsWhiteDateTerm other = (BsWhiteDateTerm)obj;
            if (!xSV(_dateTermId, other._dateTermId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _dateTermId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_dateTermId));
        sb.append(dm).append(xfND(_dateTermValue));
        sb.append(dm).append(xfND(_beginDate));
        sb.append(dm).append(xfND(_endDate));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public WhiteDateTerm clone() {
        return (WhiteDateTerm)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] DATE_TERM_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'DATE_TERM_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getDateTermId() {
        checkSpecifiedProperty("dateTermId");
        return _dateTermId;
    }

    /**
     * [set] DATE_TERM_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param dateTermId The value of the column 'DATE_TERM_ID'. (basically NotNull if update: for the constraint)
     */
    public void setDateTermId(Long dateTermId) {
        registerModifiedProperty("dateTermId");
        _dateTermId = dateTermId;
    }

    /**
     * [get] DATE_TERM_VALUE: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'DATE_TERM_VALUE'. (basically NotNull if selected: for the constraint)
     */
    public String getDateTermValue() {
        checkSpecifiedProperty("dateTermValue");
        return convertEmptyToNull(_dateTermValue);
    }

    /**
     * [set] DATE_TERM_VALUE: {NotNull, VARCHAR(200)} <br>
     * @param dateTermValue The value of the column 'DATE_TERM_VALUE'. (basically NotNull if update: for the constraint)
     */
    public void setDateTermValue(String dateTermValue) {
        registerModifiedProperty("dateTermValue");
        _dateTermValue = dateTermValue;
    }

    /**
     * [get] BEGIN_DATE: {NotNull, DATE(8)} <br>
     * @return The value of the column 'BEGIN_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getBeginDate() {
        checkSpecifiedProperty("beginDate");
        return _beginDate;
    }

    /**
     * [set] BEGIN_DATE: {NotNull, DATE(8)} <br>
     * @param beginDate The value of the column 'BEGIN_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setBeginDate(java.time.LocalDate beginDate) {
        registerModifiedProperty("beginDate");
        _beginDate = beginDate;
    }

    /**
     * [get] END_DATE: {NotNull, DATE(8)} <br>
     * @return The value of the column 'END_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getEndDate() {
        checkSpecifiedProperty("endDate");
        return _endDate;
    }

    /**
     * [set] END_DATE: {NotNull, DATE(8)} <br>
     * @param endDate The value of the column 'END_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setEndDate(java.time.LocalDate endDate) {
        registerModifiedProperty("endDate");
        _endDate = endDate;
    }
}

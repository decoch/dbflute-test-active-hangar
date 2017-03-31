package org.docksidestage.hangar.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.docksidestage.hangar.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.hangar.dbflute.allcommon.CDef;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The entity of WHITE_TSV_LOADING as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TSV_LOADING_ID
 *
 * [column]
 *     TSV_LOADING_ID, TSV_LOADING_NAME, LOADING_COUNT, LOADING_DATE, BEGIN_DATETIME, END_DATETIME, LARGE_FROM_FILE, DONE_FLG
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
 * Long tsvLoadingId = entity.getTsvLoadingId();
 * String tsvLoadingName = entity.getTsvLoadingName();
 * Integer loadingCount = entity.getLoadingCount();
 * java.time.LocalDate loadingDate = entity.getLoadingDate();
 * java.time.LocalDateTime beginDatetime = entity.getBeginDatetime();
 * java.time.LocalDateTime endDatetime = entity.getEndDatetime();
 * String largeFromFile = entity.getLargeFromFile();
 * Boolean doneFlg = entity.getDoneFlg();
 * entity.setTsvLoadingId(tsvLoadingId);
 * entity.setTsvLoadingName(tsvLoadingName);
 * entity.setLoadingCount(loadingCount);
 * entity.setLoadingDate(loadingDate);
 * entity.setBeginDatetime(beginDatetime);
 * entity.setEndDatetime(endDatetime);
 * entity.setLargeFromFile(largeFromFile);
 * entity.setDoneFlg(doneFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteTsvLoading extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)} */
    protected Long _tsvLoadingId;

    /** TSV_LOADING_NAME: {NotNull, VARCHAR(200)} */
    protected String _tsvLoadingName;

    /** LOADING_COUNT: {INTEGER(10)} */
    protected Integer _loadingCount;

    /** LOADING_DATE: {NotNull, DATE(8)} */
    protected java.time.LocalDate _loadingDate;

    /** BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _beginDatetime;

    /** END_DATETIME: {TIMESTAMP(23, 10)} */
    protected java.time.LocalDateTime _endDatetime;

    /** LARGE_FROM_FILE: {VARCHAR(500)} */
    protected String _largeFromFile;

    /** DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} */
    protected Boolean _doneFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "WHITE_TSV_LOADING";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_tsvLoadingId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of doneFlg as the classification of Flg. <br>
     * DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.Flg getDoneFlgAsFlg() {
        return CDef.Flg.codeOf(getDoneFlg());
    }

    /**
     * Set the value of doneFlg as the classification of Flg. <br>
     * DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDoneFlgAsFlg(CDef.Flg cdef) {
        setDoneFlg(cdef != null ? toBoolean(cdef.code()) : null);
    }

    /**
     * Set the value of doneFlg as boolean. <br>
     * DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param determination The determination, true or false. (NullAllowed: if null, null value is set to the column)
     */
    public void setDoneFlgAsBoolean(Boolean determination) {
        setDoneFlgAsFlg(CDef.Flg.codeOf(determination));
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of doneFlg as True (1). <br>
     * Yes: means valid
     */
    public void setDoneFlg_True() {
        setDoneFlgAsFlg(CDef.Flg.True);
    }

    /**
     * Set the value of doneFlg as False (0). <br>
     * No: means invalid
     */
    public void setDoneFlg_False() {
        setDoneFlgAsFlg(CDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of doneFlg True? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoneFlgTrue() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.True) : false;
    }

    /**
     * Is the value of doneFlg False? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoneFlgFalse() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.equals(CDef.Flg.False) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'doneFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDoneFlgName() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'doneFlg' as classification alias.
     * @return The string of classification alias. (NullAllowed: when the column value is null)
     */
    public String getDoneFlgAlias() {
        CDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.alias() : null;
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
        if (obj instanceof BsWhiteTsvLoading) {
            BsWhiteTsvLoading other = (BsWhiteTsvLoading)obj;
            if (!xSV(_tsvLoadingId, other._tsvLoadingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tsvLoadingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tsvLoadingId));
        sb.append(dm).append(xfND(_tsvLoadingName));
        sb.append(dm).append(xfND(_loadingCount));
        sb.append(dm).append(xfND(_loadingDate));
        sb.append(dm).append(xfND(_beginDatetime));
        sb.append(dm).append(xfND(_endDatetime));
        sb.append(dm).append(xfND(_largeFromFile));
        sb.append(dm).append(xfND(_doneFlg));
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
    public WhiteTsvLoading clone() {
        return (WhiteTsvLoading)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'TSV_LOADING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTsvLoadingId() {
        checkSpecifiedProperty("tsvLoadingId");
        return _tsvLoadingId;
    }

    /**
     * [set] TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param tsvLoadingId The value of the column 'TSV_LOADING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTsvLoadingId(Long tsvLoadingId) {
        registerModifiedProperty("tsvLoadingId");
        _tsvLoadingId = tsvLoadingId;
    }

    /**
     * [get] TSV_LOADING_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'TSV_LOADING_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getTsvLoadingName() {
        checkSpecifiedProperty("tsvLoadingName");
        return convertEmptyToNull(_tsvLoadingName);
    }

    /**
     * [set] TSV_LOADING_NAME: {NotNull, VARCHAR(200)} <br>
     * @param tsvLoadingName The value of the column 'TSV_LOADING_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setTsvLoadingName(String tsvLoadingName) {
        registerModifiedProperty("tsvLoadingName");
        _tsvLoadingName = tsvLoadingName;
    }

    /**
     * [get] LOADING_COUNT: {INTEGER(10)} <br>
     * @return The value of the column 'LOADING_COUNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getLoadingCount() {
        checkSpecifiedProperty("loadingCount");
        return _loadingCount;
    }

    /**
     * [set] LOADING_COUNT: {INTEGER(10)} <br>
     * @param loadingCount The value of the column 'LOADING_COUNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoadingCount(Integer loadingCount) {
        registerModifiedProperty("loadingCount");
        _loadingCount = loadingCount;
    }

    /**
     * [get] LOADING_DATE: {NotNull, DATE(8)} <br>
     * @return The value of the column 'LOADING_DATE'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDate getLoadingDate() {
        checkSpecifiedProperty("loadingDate");
        return _loadingDate;
    }

    /**
     * [set] LOADING_DATE: {NotNull, DATE(8)} <br>
     * @param loadingDate The value of the column 'LOADING_DATE'. (basically NotNull if update: for the constraint)
     */
    public void setLoadingDate(java.time.LocalDate loadingDate) {
        registerModifiedProperty("loadingDate");
        _loadingDate = loadingDate;
    }

    /**
     * [get] BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'BEGIN_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getBeginDatetime() {
        checkSpecifiedProperty("beginDatetime");
        return _beginDatetime;
    }

    /**
     * [set] BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param beginDatetime The value of the column 'BEGIN_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setBeginDatetime(java.time.LocalDateTime beginDatetime) {
        registerModifiedProperty("beginDatetime");
        _beginDatetime = beginDatetime;
    }

    /**
     * [get] END_DATETIME: {TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'END_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getEndDatetime() {
        checkSpecifiedProperty("endDatetime");
        return _endDatetime;
    }

    /**
     * [set] END_DATETIME: {TIMESTAMP(23, 10)} <br>
     * @param endDatetime The value of the column 'END_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEndDatetime(java.time.LocalDateTime endDatetime) {
        registerModifiedProperty("endDatetime");
        _endDatetime = endDatetime;
    }

    /**
     * [get] LARGE_FROM_FILE: {VARCHAR(500)} <br>
     * @return The value of the column 'LARGE_FROM_FILE'. (NullAllowed even if selected: for no constraint)
     */
    public String getLargeFromFile() {
        checkSpecifiedProperty("largeFromFile");
        return convertEmptyToNull(_largeFromFile);
    }

    /**
     * [set] LARGE_FROM_FILE: {VARCHAR(500)} <br>
     * @param largeFromFile The value of the column 'LARGE_FROM_FILE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLargeFromFile(String largeFromFile) {
        registerModifiedProperty("largeFromFile");
        _largeFromFile = largeFromFile;
    }

    /**
     * [get] DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} <br>
     * @return The value of the column 'DONE_FLG'. (basically NotNull if selected: for the constraint)
     */
    public Boolean getDoneFlg() {
        checkSpecifiedProperty("doneFlg");
        return _doneFlg;
    }

    /**
     * [set] DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} <br>
     * @param doneFlg The value of the column 'DONE_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDoneFlg(Boolean doneFlg) {
        checkClassificationCode("DONE_FLG", CDef.DefMeta.Flg, doneFlg);
        registerModifiedProperty("doneFlg");
        _doneFlg = doneFlg;
    }
}

package org.docksidestage.hangar.simpleflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.docksidestage.hangar.simpleflute.AppCDef;

/**
 * The simple DTO of WHITE_TSV_LOADING as TABLE. <br>
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
public abstract class BsWhiteTsvLoadingDto implements Serializable {

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
    /** TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)} */
    @JsonKey
    protected Long _tsvLoadingId;

    /** TSV_LOADING_NAME: {NotNull, VARCHAR(200)} */
    @JsonKey
    protected String _tsvLoadingName;

    /** LOADING_COUNT: {INTEGER(10)} */
    @JsonKey
    protected Integer _loadingCount;

    /** LOADING_DATE: {NotNull, DATE(8)} */
    @JsonKey
    protected java.time.LocalDate _loadingDate;

    /** BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)} */
    @JsonKey
    protected java.time.LocalDateTime _beginDatetime;

    /** END_DATETIME: {TIMESTAMP(23, 10)} */
    @JsonKey
    protected java.time.LocalDateTime _endDatetime;

    /** LARGE_FROM_FILE: {VARCHAR(500)} */
    @JsonKey
    protected String _largeFromFile;

    /** DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} */
    @JsonKey
    protected Boolean _doneFlg;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteTsvLoadingDto() {
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
     * Set the value of doneFlg as the classification of Flg. <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public void setDoneFlgAsFlg(AppCDef.Flg cdef) {
        setDoneFlg(cdef != null ? Boolean.valueOf(cdef.code()) : null);
    }

    /**
     * Get the value of doneFlg as the classification of Flg. <br>
     * general boolean classification for every flg-column
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed)
     */
    public AppCDef.Flg getDoneFlgAsFlg() {
        return AppCDef.Flg.codeOf(getDoneFlg());
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of doneFlg as True. <br>
     * Yes: means valid
     */
    public void setDoneFlg_True() {
        setDoneFlgAsFlg(AppCDef.Flg.True);
    }

    /**
     * Set the value of doneFlg as False. <br>
     * No: means invalid
     */
    public void setDoneFlg_False() {
        setDoneFlgAsFlg(AppCDef.Flg.False);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of doneFlg 'True'? <br>
     * Yes: means valid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoneFlgTrue() {
        AppCDef.Flg cdef = getDoneFlgAsFlg();
        return cdef != null ? cdef.equals(AppCDef.Flg.True) : false;
    }

    /**
     * Is the value of doneFlg 'False'? <br>
     * No: means invalid
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDoneFlgFalse() {
        AppCDef.Flg cdef = getDoneFlgAsFlg();
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
        if (other == null || !(other instanceof BsWhiteTsvLoadingDto)) { return false; }
        final BsWhiteTsvLoadingDto otherEntity = (BsWhiteTsvLoadingDto)other;
        if (!helpComparingValue(getTsvLoadingId(), otherEntity.getTsvLoadingId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "WHITE_TSV_LOADING");
        result = xCH(result, getTsvLoadingId());
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
        sb.append(c).append(getTsvLoadingId());
        sb.append(c).append(getTsvLoadingName());
        sb.append(c).append(getLoadingCount());
        sb.append(c).append(getLoadingDate());
        sb.append(c).append(getBeginDatetime());
        sb.append(c).append(getEndDatetime());
        sb.append(c).append(getLargeFromFile());
        sb.append(c).append(getDoneFlg());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @return The value of the column 'TSV_LOADING_ID'. (NullAllowed)
     */
    public Long getTsvLoadingId() {
        return _tsvLoadingId;
    }

    /**
     * [set] TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)} <br>
     * @param tsvLoadingId The value of the column 'TSV_LOADING_ID'. (NullAllowed)
     */
    public void setTsvLoadingId(Long tsvLoadingId) {
        __modifiedProperties.add("tsvLoadingId");
        this._tsvLoadingId = tsvLoadingId;
    }

    /**
     * [get] TSV_LOADING_NAME: {NotNull, VARCHAR(200)} <br>
     * @return The value of the column 'TSV_LOADING_NAME'. (NullAllowed)
     */
    public String getTsvLoadingName() {
        return _tsvLoadingName;
    }

    /**
     * [set] TSV_LOADING_NAME: {NotNull, VARCHAR(200)} <br>
     * @param tsvLoadingName The value of the column 'TSV_LOADING_NAME'. (NullAllowed)
     */
    public void setTsvLoadingName(String tsvLoadingName) {
        __modifiedProperties.add("tsvLoadingName");
        this._tsvLoadingName = tsvLoadingName;
    }

    /**
     * [get] LOADING_COUNT: {INTEGER(10)} <br>
     * @return The value of the column 'LOADING_COUNT'. (NullAllowed)
     */
    public Integer getLoadingCount() {
        return _loadingCount;
    }

    /**
     * [set] LOADING_COUNT: {INTEGER(10)} <br>
     * @param loadingCount The value of the column 'LOADING_COUNT'. (NullAllowed)
     */
    public void setLoadingCount(Integer loadingCount) {
        __modifiedProperties.add("loadingCount");
        this._loadingCount = loadingCount;
    }

    /**
     * [get] LOADING_DATE: {NotNull, DATE(8)} <br>
     * @return The value of the column 'LOADING_DATE'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd")
    public java.time.LocalDate getLoadingDate() {
        return _loadingDate;
    }

    /**
     * [set] LOADING_DATE: {NotNull, DATE(8)} <br>
     * @param loadingDate The value of the column 'LOADING_DATE'. (NullAllowed)
     */
    public void setLoadingDate(java.time.LocalDate loadingDate) {
        __modifiedProperties.add("loadingDate");
        this._loadingDate = loadingDate;
    }

    /**
     * [get] BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'BEGIN_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getBeginDatetime() {
        return _beginDatetime;
    }

    /**
     * [set] BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)} <br>
     * @param beginDatetime The value of the column 'BEGIN_DATETIME'. (NullAllowed)
     */
    public void setBeginDatetime(java.time.LocalDateTime beginDatetime) {
        __modifiedProperties.add("beginDatetime");
        this._beginDatetime = beginDatetime;
    }

    /**
     * [get] END_DATETIME: {TIMESTAMP(23, 10)} <br>
     * @return The value of the column 'END_DATETIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
    public java.time.LocalDateTime getEndDatetime() {
        return _endDatetime;
    }

    /**
     * [set] END_DATETIME: {TIMESTAMP(23, 10)} <br>
     * @param endDatetime The value of the column 'END_DATETIME'. (NullAllowed)
     */
    public void setEndDatetime(java.time.LocalDateTime endDatetime) {
        __modifiedProperties.add("endDatetime");
        this._endDatetime = endDatetime;
    }

    /**
     * [get] LARGE_FROM_FILE: {VARCHAR(500)} <br>
     * @return The value of the column 'LARGE_FROM_FILE'. (NullAllowed)
     */
    public String getLargeFromFile() {
        return _largeFromFile;
    }

    /**
     * [set] LARGE_FROM_FILE: {VARCHAR(500)} <br>
     * @param largeFromFile The value of the column 'LARGE_FROM_FILE'. (NullAllowed)
     */
    public void setLargeFromFile(String largeFromFile) {
        __modifiedProperties.add("largeFromFile");
        this._largeFromFile = largeFromFile;
    }

    /**
     * [get] DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} <br>
     * @return The value of the column 'DONE_FLG'. (NullAllowed)
     */
    public Boolean getDoneFlg() {
        return _doneFlg;
    }

    /**
     * [set] DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} <br>
     * @param doneFlg The value of the column 'DONE_FLG'. (NullAllowed)
     */
    public void setDoneFlg(Boolean doneFlg) {
        __modifiedProperties.add("doneFlg");
        this._doneFlg = doneFlg;
    }

}

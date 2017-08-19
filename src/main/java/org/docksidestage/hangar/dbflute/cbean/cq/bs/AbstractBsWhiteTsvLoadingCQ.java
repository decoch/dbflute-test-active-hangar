package org.docksidestage.hangar.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of WHITE_TSV_LOADING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteTsvLoadingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteTsvLoadingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "WHITE_TSV_LOADING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param tsvLoadingId The value of tsvLoadingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsvLoadingId_Equal(Long tsvLoadingId) {
        doSetTsvLoadingId_Equal(tsvLoadingId);
    }

    protected void doSetTsvLoadingId_Equal(Long tsvLoadingId) {
        regTsvLoadingId(CK_EQ, tsvLoadingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param tsvLoadingId The value of tsvLoadingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsvLoadingId_NotEqual(Long tsvLoadingId) {
        doSetTsvLoadingId_NotEqual(tsvLoadingId);
    }

    protected void doSetTsvLoadingId_NotEqual(Long tsvLoadingId) {
        regTsvLoadingId(CK_NES, tsvLoadingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param tsvLoadingId The value of tsvLoadingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsvLoadingId_GreaterThan(Long tsvLoadingId) {
        regTsvLoadingId(CK_GT, tsvLoadingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param tsvLoadingId The value of tsvLoadingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsvLoadingId_LessThan(Long tsvLoadingId) {
        regTsvLoadingId(CK_LT, tsvLoadingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param tsvLoadingId The value of tsvLoadingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsvLoadingId_GreaterEqual(Long tsvLoadingId) {
        regTsvLoadingId(CK_GE, tsvLoadingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param tsvLoadingId The value of tsvLoadingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTsvLoadingId_LessEqual(Long tsvLoadingId) {
        regTsvLoadingId(CK_LE, tsvLoadingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of tsvLoadingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsvLoadingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTsvLoadingId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTsvLoadingId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of tsvLoadingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tsvLoadingId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setTsvLoadingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTsvLoadingId(), "TSV_LOADING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param tsvLoadingIdList The collection of tsvLoadingId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsvLoadingId_InScope(Collection<Long> tsvLoadingIdList) {
        doSetTsvLoadingId_InScope(tsvLoadingIdList);
    }

    protected void doSetTsvLoadingId_InScope(Collection<Long> tsvLoadingIdList) {
        regINS(CK_INS, cTL(tsvLoadingIdList), xgetCValueTsvLoadingId(), "TSV_LOADING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @param tsvLoadingIdList The collection of tsvLoadingId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsvLoadingId_NotInScope(Collection<Long> tsvLoadingIdList) {
        doSetTsvLoadingId_NotInScope(tsvLoadingIdList);
    }

    protected void doSetTsvLoadingId_NotInScope(Collection<Long> tsvLoadingIdList) {
        regINS(CK_NINS, cTL(tsvLoadingIdList), xgetCValueTsvLoadingId(), "TSV_LOADING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setTsvLoadingId_IsNull() { regTsvLoadingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setTsvLoadingId_IsNotNull() { regTsvLoadingId(CK_ISNN, DOBJ); }

    protected void regTsvLoadingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsvLoadingId(), "TSV_LOADING_ID"); }
    protected abstract ConditionValue xgetCValueTsvLoadingId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSV_LOADING_NAME: {NotNull, VARCHAR(200)}
     * @param tsvLoadingName The value of tsvLoadingName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsvLoadingName_Equal(String tsvLoadingName) {
        doSetTsvLoadingName_Equal(fRES(tsvLoadingName));
    }

    protected void doSetTsvLoadingName_Equal(String tsvLoadingName) {
        regTsvLoadingName(CK_EQ, tsvLoadingName);
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSV_LOADING_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setTsvLoadingName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param tsvLoadingName The value of tsvLoadingName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTsvLoadingName_LikeSearch(String tsvLoadingName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTsvLoadingName_LikeSearch(tsvLoadingName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSV_LOADING_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setTsvLoadingName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tsvLoadingName The value of tsvLoadingName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setTsvLoadingName_LikeSearch(String tsvLoadingName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tsvLoadingName), xgetCValueTsvLoadingName(), "TSV_LOADING_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSV_LOADING_NAME: {NotNull, VARCHAR(200)}
     * @param tsvLoadingName The value of tsvLoadingName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTsvLoadingName_NotLikeSearch(String tsvLoadingName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTsvLoadingName_NotLikeSearch(tsvLoadingName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSV_LOADING_NAME: {NotNull, VARCHAR(200)}
     * @param tsvLoadingName The value of tsvLoadingName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setTsvLoadingName_NotLikeSearch(String tsvLoadingName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tsvLoadingName), xgetCValueTsvLoadingName(), "TSV_LOADING_NAME", likeSearchOption);
    }

    protected void regTsvLoadingName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsvLoadingName(), "TSV_LOADING_NAME"); }
    protected abstract ConditionValue xgetCValueTsvLoadingName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param loadingCount The value of loadingCount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingCount_Equal(Integer loadingCount) {
        doSetLoadingCount_Equal(loadingCount);
    }

    protected void doSetLoadingCount_Equal(Integer loadingCount) {
        regLoadingCount(CK_EQ, loadingCount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param loadingCount The value of loadingCount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingCount_NotEqual(Integer loadingCount) {
        doSetLoadingCount_NotEqual(loadingCount);
    }

    protected void doSetLoadingCount_NotEqual(Integer loadingCount) {
        regLoadingCount(CK_NES, loadingCount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param loadingCount The value of loadingCount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingCount_GreaterThan(Integer loadingCount) {
        regLoadingCount(CK_GT, loadingCount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param loadingCount The value of loadingCount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingCount_LessThan(Integer loadingCount) {
        regLoadingCount(CK_LT, loadingCount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param loadingCount The value of loadingCount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingCount_GreaterEqual(Integer loadingCount) {
        regLoadingCount(CK_GE, loadingCount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param loadingCount The value of loadingCount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingCount_LessEqual(Integer loadingCount) {
        regLoadingCount(CK_LE, loadingCount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param minNumber The min number of loadingCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loadingCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setLoadingCount_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setLoadingCount_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param minNumber The min number of loadingCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of loadingCount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setLoadingCount_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLoadingCount(), "LOADING_COUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param loadingCountList The collection of loadingCount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadingCount_InScope(Collection<Integer> loadingCountList) {
        doSetLoadingCount_InScope(loadingCountList);
    }

    protected void doSetLoadingCount_InScope(Collection<Integer> loadingCountList) {
        regINS(CK_INS, cTL(loadingCountList), xgetCValueLoadingCount(), "LOADING_COUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @param loadingCountList The collection of loadingCount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadingCount_NotInScope(Collection<Integer> loadingCountList) {
        doSetLoadingCount_NotInScope(loadingCountList);
    }

    protected void doSetLoadingCount_NotInScope(Collection<Integer> loadingCountList) {
        regINS(CK_NINS, cTL(loadingCountList), xgetCValueLoadingCount(), "LOADING_COUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     */
    public void setLoadingCount_IsNull() { regLoadingCount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOADING_COUNT: {INTEGER(10)}
     */
    public void setLoadingCount_IsNotNull() { regLoadingCount(CK_ISNN, DOBJ); }

    protected void regLoadingCount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoadingCount(), "LOADING_COUNT"); }
    protected abstract ConditionValue xgetCValueLoadingCount();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * @param loadingDate The value of loadingDate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingDate_Equal(java.time.LocalDate loadingDate) {
        regLoadingDate(CK_EQ,  loadingDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * @param loadingDate The value of loadingDate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingDate_GreaterThan(java.time.LocalDate loadingDate) {
        regLoadingDate(CK_GT,  loadingDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * @param loadingDate The value of loadingDate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingDate_LessThan(java.time.LocalDate loadingDate) {
        regLoadingDate(CK_LT,  loadingDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * @param loadingDate The value of loadingDate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingDate_GreaterEqual(java.time.LocalDate loadingDate) {
        regLoadingDate(CK_GE,  loadingDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * @param loadingDate The value of loadingDate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingDate_LessEqual(java.time.LocalDate loadingDate) {
        regLoadingDate(CK_LE, loadingDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setLoadingDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loadingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loadingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setLoadingDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setLoadingDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setLoadingDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loadingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of loadingDate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setLoadingDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "LOADING_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueLoadingDate(), nm, op);
    }

    protected void regLoadingDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoadingDate(), "LOADING_DATE"); }
    protected abstract ConditionValue xgetCValueLoadingDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param beginDatetime The value of beginDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDatetime_Equal(java.time.LocalDateTime beginDatetime) {
        regBeginDatetime(CK_EQ,  beginDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param beginDatetime The value of beginDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDatetime_GreaterThan(java.time.LocalDateTime beginDatetime) {
        regBeginDatetime(CK_GT,  beginDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param beginDatetime The value of beginDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDatetime_LessThan(java.time.LocalDateTime beginDatetime) {
        regBeginDatetime(CK_LT,  beginDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param beginDatetime The value of beginDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDatetime_GreaterEqual(java.time.LocalDateTime beginDatetime) {
        regBeginDatetime(CK_GE,  beginDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @param beginDatetime The value of beginDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBeginDatetime_LessEqual(java.time.LocalDateTime beginDatetime) {
        regBeginDatetime(CK_LE, beginDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setBeginDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBeginDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBeginDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * <pre>e.g. setBeginDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setBeginDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "BEGIN_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBeginDatetime(), nm, op);
    }

    protected void regBeginDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBeginDatetime(), "BEGIN_DATETIME"); }
    protected abstract ConditionValue xgetCValueBeginDatetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * @param endDatetime The value of endDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDatetime_Equal(java.time.LocalDateTime endDatetime) {
        regEndDatetime(CK_EQ,  endDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * @param endDatetime The value of endDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDatetime_GreaterThan(java.time.LocalDateTime endDatetime) {
        regEndDatetime(CK_GT,  endDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * @param endDatetime The value of endDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDatetime_LessThan(java.time.LocalDateTime endDatetime) {
        regEndDatetime(CK_LT,  endDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * @param endDatetime The value of endDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDatetime_GreaterEqual(java.time.LocalDateTime endDatetime) {
        regEndDatetime(CK_GE,  endDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * @param endDatetime The value of endDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setEndDatetime_LessEqual(java.time.LocalDateTime endDatetime) {
        regEndDatetime(CK_LE, endDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * <pre>e.g. setEndDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEndDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEndDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * <pre>e.g. setEndDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setEndDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "END_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEndDatetime(), nm, op);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     */
    public void setEndDatetime_IsNull() { regEndDatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     */
    public void setEndDatetime_IsNotNull() { regEndDatetime(CK_ISNN, DOBJ); }

    protected void regEndDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndDatetime(), "END_DATETIME"); }
    protected abstract ConditionValue xgetCValueEndDatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @param largeFromFile The value of largeFromFile as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeFromFile_Equal(String largeFromFile) {
        doSetLargeFromFile_Equal(fRES(largeFromFile));
    }

    protected void doSetLargeFromFile_Equal(String largeFromFile) {
        regLargeFromFile(CK_EQ, largeFromFile);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @param largeFromFile The value of largeFromFile as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeFromFile_NotEqual(String largeFromFile) {
        doSetLargeFromFile_NotEqual(fRES(largeFromFile));
    }

    protected void doSetLargeFromFile_NotEqual(String largeFromFile) {
        regLargeFromFile(CK_NES, largeFromFile);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @param largeFromFileList The collection of largeFromFile as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeFromFile_InScope(Collection<String> largeFromFileList) {
        doSetLargeFromFile_InScope(largeFromFileList);
    }

    protected void doSetLargeFromFile_InScope(Collection<String> largeFromFileList) {
        regINS(CK_INS, cTL(largeFromFileList), xgetCValueLargeFromFile(), "LARGE_FROM_FILE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @param largeFromFileList The collection of largeFromFile as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLargeFromFile_NotInScope(Collection<String> largeFromFileList) {
        doSetLargeFromFile_NotInScope(largeFromFileList);
    }

    protected void doSetLargeFromFile_NotInScope(Collection<String> largeFromFileList) {
        regINS(CK_NINS, cTL(largeFromFileList), xgetCValueLargeFromFile(), "LARGE_FROM_FILE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)} <br>
     * <pre>e.g. setLargeFromFile_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param largeFromFile The value of largeFromFile as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLargeFromFile_LikeSearch(String largeFromFile, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLargeFromFile_LikeSearch(largeFromFile, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)} <br>
     * <pre>e.g. setLargeFromFile_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param largeFromFile The value of largeFromFile as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setLargeFromFile_LikeSearch(String largeFromFile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(largeFromFile), xgetCValueLargeFromFile(), "LARGE_FROM_FILE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @param largeFromFile The value of largeFromFile as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setLargeFromFile_NotLikeSearch(String largeFromFile, ConditionOptionCall<LikeSearchOption> opLambda) {
        setLargeFromFile_NotLikeSearch(largeFromFile, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @param largeFromFile The value of largeFromFile as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setLargeFromFile_NotLikeSearch(String largeFromFile, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(largeFromFile), xgetCValueLargeFromFile(), "LARGE_FROM_FILE", likeSearchOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     */
    public void setLargeFromFile_IsNull() { regLargeFromFile(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     */
    public void setLargeFromFile_IsNullOrEmpty() { regLargeFromFile(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     */
    public void setLargeFromFile_IsNotNull() { regLargeFromFile(CK_ISNN, DOBJ); }

    protected void regLargeFromFile(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLargeFromFile(), "LARGE_FROM_FILE"); }
    protected abstract ConditionValue xgetCValueLargeFromFile();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg}
     * @param doneFlg The value of doneFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDoneFlg_Equal(Boolean doneFlg) {
        regDoneFlg(CK_EQ, doneFlg);
    }

    /**
     * Equal(=). As Flg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg} <br>
     * general boolean classification for every flg-column
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDoneFlg_Equal_AsFlg(CDef.Flg cdef) {
        doSetDoneFlg_Equal(cdef != null ? Boolean.valueOf(cdef.code()) : null);
    }

    /**
     * Equal(=). As True. And OnlyOnceRegistered. <br>
     * Yes: means valid
     */
    public void setDoneFlg_Equal_True() {
        doSetDoneFlg_Equal(Boolean.valueOf(CDef.Flg.True.code()));
    }

    /**
     * Equal(=). As False. And OnlyOnceRegistered. <br>
     * No: means invalid
     */
    public void setDoneFlg_Equal_False() {
        doSetDoneFlg_Equal(Boolean.valueOf(CDef.Flg.False.code()));
    }

    protected void doSetDoneFlg_Equal(Boolean doneFlg) {
        regDoneFlg(CK_EQ, doneFlg);
    }

    protected void regDoneFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoneFlg(), "DONE_FLG"); }
    protected abstract ConditionValue xgetCValueDoneFlg();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTsvLoadingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WhiteTsvLoadingCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTsvLoadingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WhiteTsvLoadingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTsvLoadingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WhiteTsvLoadingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTsvLoadingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WhiteTsvLoadingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTsvLoadingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WhiteTsvLoadingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteTsvLoadingCB&gt;() {
     *     public void query(WhiteTsvLoadingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WhiteTsvLoadingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WhiteTsvLoadingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTsvLoadingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WhiteTsvLoadingCQ sq);

    protected WhiteTsvLoadingCB xcreateScalarConditionCB() {
        WhiteTsvLoadingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteTsvLoadingCB xcreateScalarConditionPartitionByCB() {
        WhiteTsvLoadingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteTsvLoadingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTsvLoadingCB cb = new WhiteTsvLoadingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TSV_LOADING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteTsvLoadingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteTsvLoadingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteTsvLoadingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteTsvLoadingCB cb = new WhiteTsvLoadingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TSV_LOADING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteTsvLoadingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteTsvLoadingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteTsvLoadingCB cb = new WhiteTsvLoadingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteTsvLoadingCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected WhiteTsvLoadingCB newMyCB() {
        return new WhiteTsvLoadingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteTsvLoadingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

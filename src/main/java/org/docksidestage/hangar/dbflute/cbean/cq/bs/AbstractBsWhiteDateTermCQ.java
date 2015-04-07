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
 * The abstract condition-query of WHITE_DATE_TERM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWhiteDateTermCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWhiteDateTermCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "WHITE_DATE_TERM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as equal. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_Equal(Long dateTermId) {
        doSetDateTermId_Equal(dateTermId);
    }

    protected void doSetDateTermId_Equal(Long dateTermId) {
        regDateTermId(CK_EQ, dateTermId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as notEqual. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_NotEqual(Long dateTermId) {
        doSetDateTermId_NotEqual(dateTermId);
    }

    protected void doSetDateTermId_NotEqual(Long dateTermId) {
        regDateTermId(CK_NES, dateTermId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_GreaterThan(Long dateTermId) {
        regDateTermId(CK_GT, dateTermId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as lessThan. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_LessThan(Long dateTermId) {
        regDateTermId(CK_LT, dateTermId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_GreaterEqual(Long dateTermId) {
        regDateTermId(CK_GE, dateTermId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermId The value of dateTermId as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setDateTermId_LessEqual(Long dateTermId) {
        regDateTermId(CK_LE, dateTermId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of dateTermId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of dateTermId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setDateTermId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setDateTermId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param minNumber The min number of dateTermId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of dateTermId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setDateTermId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDateTermId(), "DATE_TERM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermIdList The collection of dateTermId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermId_InScope(Collection<Long> dateTermIdList) {
        doSetDateTermId_InScope(dateTermIdList);
    }

    protected void doSetDateTermId_InScope(Collection<Long> dateTermIdList) {
        regINS(CK_INS, cTL(dateTermIdList), xgetCValueDateTermId(), "DATE_TERM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     * @param dateTermIdList The collection of dateTermId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermId_NotInScope(Collection<Long> dateTermIdList) {
        doSetDateTermId_NotInScope(dateTermIdList);
    }

    protected void doSetDateTermId_NotInScope(Collection<Long> dateTermIdList) {
        regINS(CK_NINS, cTL(dateTermIdList), xgetCValueDateTermId(), "DATE_TERM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDateTermId_IsNull() { regDateTermId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATE_TERM_ID: {PK, NotNull, DECIMAL(16)}
     */
    public void setDateTermId_IsNotNull() { regDateTermId(CK_ISNN, DOBJ); }

    protected void regDateTermId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateTermId(), "DATE_TERM_ID"); }
    protected abstract ConditionValue xgetCValueDateTermId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValue The value of dateTermValue as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_Equal(String dateTermValue) {
        doSetDateTermValue_Equal(fRES(dateTermValue));
    }

    protected void doSetDateTermValue_Equal(String dateTermValue) {
        regDateTermValue(CK_EQ, dateTermValue);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValue The value of dateTermValue as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_NotEqual(String dateTermValue) {
        doSetDateTermValue_NotEqual(fRES(dateTermValue));
    }

    protected void doSetDateTermValue_NotEqual(String dateTermValue) {
        regDateTermValue(CK_NES, dateTermValue);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValueList The collection of dateTermValue as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_InScope(Collection<String> dateTermValueList) {
        doSetDateTermValue_InScope(dateTermValueList);
    }

    protected void doSetDateTermValue_InScope(Collection<String> dateTermValueList) {
        regINS(CK_INS, cTL(dateTermValueList), xgetCValueDateTermValue(), "DATE_TERM_VALUE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValueList The collection of dateTermValue as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setDateTermValue_NotInScope(Collection<String> dateTermValueList) {
        doSetDateTermValue_NotInScope(dateTermValueList);
    }

    protected void doSetDateTermValue_NotInScope(Collection<String> dateTermValueList) {
        regINS(CK_NINS, cTL(dateTermValueList), xgetCValueDateTermValue(), "DATE_TERM_VALUE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDateTermValue_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param dateTermValue The value of dateTermValue as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDateTermValue_LikeSearch(String dateTermValue, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDateTermValue_LikeSearch(dateTermValue, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setDateTermValue_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dateTermValue The value of dateTermValue as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setDateTermValue_LikeSearch(String dateTermValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dateTermValue), xgetCValueDateTermValue(), "DATE_TERM_VALUE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValue The value of dateTermValue as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setDateTermValue_NotLikeSearch(String dateTermValue, ConditionOptionCall<LikeSearchOption> opLambda) {
        setDateTermValue_NotLikeSearch(dateTermValue, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATE_TERM_VALUE: {NotNull, VARCHAR(200)}
     * @param dateTermValue The value of dateTermValue as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setDateTermValue_NotLikeSearch(String dateTermValue, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dateTermValue), xgetCValueDateTermValue(), "DATE_TERM_VALUE", likeSearchOption);
    }

    protected void regDateTermValue(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDateTermValue(), "DATE_TERM_VALUE"); }
    protected abstract ConditionValue xgetCValueDateTermValue();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as equal. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_Equal(java.time.LocalDate beginDate) {
        regBeginDate(CK_EQ,  beginDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_GreaterThan(java.time.LocalDate beginDate) {
        regBeginDate(CK_GT,  beginDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_LessThan(java.time.LocalDate beginDate) {
        regBeginDate(CK_LT,  beginDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_GreaterEqual(java.time.LocalDate beginDate) {
        regBeginDate(CK_GE,  beginDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(8)}
     * @param beginDate The value of beginDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setBeginDate_LessEqual(java.time.LocalDate beginDate) {
        regBeginDate(CK_LE, beginDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setBeginDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setBeginDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setBeginDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BEGIN_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setBeginDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of beginDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setBeginDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "BEGIN_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueBeginDate(), nm, op);
    }

    protected void regBeginDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBeginDate(), "BEGIN_DATE"); }
    protected abstract ConditionValue xgetCValueBeginDate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as equal. (NullAllowed: if null, no condition)
     */
    public void setEndDate_Equal(java.time.LocalDate endDate) {
        regEndDate(CK_EQ,  endDate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as greaterThan. (NullAllowed: if null, no condition)
     */
    public void setEndDate_GreaterThan(java.time.LocalDate endDate) {
        regEndDate(CK_GT,  endDate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as lessThan. (NullAllowed: if null, no condition)
     */
    public void setEndDate_LessThan(java.time.LocalDate endDate) {
        regEndDate(CK_LT,  endDate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as greaterEqual. (NullAllowed: if null, no condition)
     */
    public void setEndDate_GreaterEqual(java.time.LocalDate endDate) {
        regEndDate(CK_GE,  endDate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(8)}
     * @param endDate The value of endDate as lessEqual. (NullAllowed: if null, no condition)
     */
    public void setEndDate_LessEqual(java.time.LocalDate endDate) {
        regEndDate(CK_LE, endDate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setEndDate_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setEndDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setEndDate_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * END_DATE: {NotNull, DATE(8)}
     * <pre>e.g. setEndDate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of endDate. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setEndDate_FromTo(java.time.LocalDate fromDatetime, java.time.LocalDate toDatetime, FromToOption fromToOption) {
        String nm = "END_DATE"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueEndDate(), nm, op);
    }

    protected void regEndDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEndDate(), "END_DATE"); }
    protected abstract ConditionValue xgetCValueEndDate();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_Equal()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_Equal() {
        return xcreateSSQFunction(CK_EQ, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_NotEqual()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setXxx... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setYyy...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_NotEqual() {
        return xcreateSSQFunction(CK_NES, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterThan()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_GreaterThan() {
        return xcreateSSQFunction(CK_GT, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessThan()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_LessThan() {
        return xcreateSSQFunction(CK_LT, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_GreaterEqual()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_GreaterEqual() {
        return xcreateSSQFunction(CK_GE, WhiteDateTermCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WhiteDateTermCB&gt;() {
     *     public void query(WhiteDateTermCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSSQFunction<WhiteDateTermCB> scalar_LessEqual() {
        return xcreateSSQFunction(CK_LE, WhiteDateTermCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSSQOption<CB> op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateTermCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        op.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, op);
    }
    public abstract String keepScalarCondition(WhiteDateTermCQ sq);

    protected WhiteDateTermCB xcreateScalarConditionCB() {
        WhiteDateTermCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WhiteDateTermCB xcreateScalarConditionPartitionByCB() {
        WhiteDateTermCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WhiteDateTermCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateTermCB cb = new WhiteDateTermCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DATE_TERM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WhiteDateTermCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WhiteDateTermCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WhiteDateTermCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WhiteDateTermCB cb = new WhiteDateTermCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DATE_TERM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WhiteDateTermCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WhiteDateTermCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WhiteDateTermCB cb = new WhiteDateTermCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WhiteDateTermCQ sq);

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
    protected WhiteDateTermCB newMyCB() {
        return new WhiteDateTermCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WhiteDateTermCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSSQS() { return HpSSQSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}

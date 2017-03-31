package org.docksidestage.hangar.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.docksidestage.hangar.dbflute.cbean.cq.ciq.*;
import org.docksidestage.hangar.dbflute.cbean.*;
import org.docksidestage.hangar.dbflute.cbean.cq.*;

/**
 * The base condition-query of WHITE_TSV_LOADING.
 * @author DBFlute(AutoGenerator)
 */
public class BsWhiteTsvLoadingCQ extends AbstractBsWhiteTsvLoadingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected WhiteTsvLoadingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsWhiteTsvLoadingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from WHITE_TSV_LOADING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public WhiteTsvLoadingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected WhiteTsvLoadingCIQ xcreateCIQ() {
        WhiteTsvLoadingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected WhiteTsvLoadingCIQ xnewCIQ() {
        return new WhiteTsvLoadingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join WHITE_TSV_LOADING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public WhiteTsvLoadingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        WhiteTsvLoadingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _tsvLoadingId;
    public ConditionValue xdfgetTsvLoadingId()
    { if (_tsvLoadingId == null) { _tsvLoadingId = nCV(); }
      return _tsvLoadingId; }
    protected ConditionValue xgetCValueTsvLoadingId() { return xdfgetTsvLoadingId(); }

    /** 
     * Add order-by as ascend. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_TsvLoadingId_Asc() { regOBA("TSV_LOADING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_TsvLoadingId_Desc() { regOBD("TSV_LOADING_ID"); return this; }

    protected ConditionValue _tsvLoadingName;
    public ConditionValue xdfgetTsvLoadingName()
    { if (_tsvLoadingName == null) { _tsvLoadingName = nCV(); }
      return _tsvLoadingName; }
    protected ConditionValue xgetCValueTsvLoadingName() { return xdfgetTsvLoadingName(); }

    /** 
     * Add order-by as ascend. <br>
     * TSV_LOADING_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_TsvLoadingName_Asc() { regOBA("TSV_LOADING_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * TSV_LOADING_NAME: {NotNull, VARCHAR(200)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_TsvLoadingName_Desc() { regOBD("TSV_LOADING_NAME"); return this; }

    protected ConditionValue _loadingCount;
    public ConditionValue xdfgetLoadingCount()
    { if (_loadingCount == null) { _loadingCount = nCV(); }
      return _loadingCount; }
    protected ConditionValue xgetCValueLoadingCount() { return xdfgetLoadingCount(); }

    /** 
     * Add order-by as ascend. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_LoadingCount_Asc() { regOBA("LOADING_COUNT"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOADING_COUNT: {INTEGER(10)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_LoadingCount_Desc() { regOBD("LOADING_COUNT"); return this; }

    protected ConditionValue _loadingDate;
    public ConditionValue xdfgetLoadingDate()
    { if (_loadingDate == null) { _loadingDate = nCV(); }
      return _loadingDate; }
    protected ConditionValue xgetCValueLoadingDate() { return xdfgetLoadingDate(); }

    /** 
     * Add order-by as ascend. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_LoadingDate_Asc() { regOBA("LOADING_DATE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOADING_DATE: {NotNull, DATE(8)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_LoadingDate_Desc() { regOBD("LOADING_DATE"); return this; }

    protected ConditionValue _beginDatetime;
    public ConditionValue xdfgetBeginDatetime()
    { if (_beginDatetime == null) { _beginDatetime = nCV(); }
      return _beginDatetime; }
    protected ConditionValue xgetCValueBeginDatetime() { return xdfgetBeginDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_BeginDatetime_Asc() { regOBA("BEGIN_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_BeginDatetime_Desc() { regOBD("BEGIN_DATETIME"); return this; }

    protected ConditionValue _endDatetime;
    public ConditionValue xdfgetEndDatetime()
    { if (_endDatetime == null) { _endDatetime = nCV(); }
      return _endDatetime; }
    protected ConditionValue xgetCValueEndDatetime() { return xdfgetEndDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_EndDatetime_Asc() { regOBA("END_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_EndDatetime_Desc() { regOBD("END_DATETIME"); return this; }

    protected ConditionValue _largeFromFile;
    public ConditionValue xdfgetLargeFromFile()
    { if (_largeFromFile == null) { _largeFromFile = nCV(); }
      return _largeFromFile; }
    protected ConditionValue xgetCValueLargeFromFile() { return xdfgetLargeFromFile(); }

    /** 
     * Add order-by as ascend. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_LargeFromFile_Asc() { regOBA("LARGE_FROM_FILE"); return this; }

    /**
     * Add order-by as descend. <br>
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_LargeFromFile_Desc() { regOBD("LARGE_FROM_FILE"); return this; }

    protected ConditionValue _doneFlg;
    public ConditionValue xdfgetDoneFlg()
    { if (_doneFlg == null) { _doneFlg = nCV(); }
      return _doneFlg; }
    protected ConditionValue xgetCValueDoneFlg() { return xdfgetDoneFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_DoneFlg_Asc() { regOBA("DONE_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg}
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addOrderBy_DoneFlg_Desc() { regOBD("DONE_FLG"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsWhiteTsvLoadingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, WhiteTsvLoadingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(WhiteTsvLoadingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, WhiteTsvLoadingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(WhiteTsvLoadingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, WhiteTsvLoadingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(WhiteTsvLoadingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, WhiteTsvLoadingCQ> _myselfExistsMap;
    public Map<String, WhiteTsvLoadingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(WhiteTsvLoadingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, WhiteTsvLoadingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(WhiteTsvLoadingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return WhiteTsvLoadingCB.class.getName(); }
    protected String xCQ() { return WhiteTsvLoadingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}

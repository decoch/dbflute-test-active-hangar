package org.docksidestage.hangar.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import org.docksidestage.hangar.dbflute.allcommon.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The DB meta of WHITE_TSV_LOADING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class WhiteTsvLoadingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final WhiteTsvLoadingDbm _instance = new WhiteTsvLoadingDbm();
    private WhiteTsvLoadingDbm() {}
    public static WhiteTsvLoadingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((WhiteTsvLoading)et).getTsvLoadingId(), (et, vl) -> ((WhiteTsvLoading)et).setTsvLoadingId(ctl(vl)), "tsvLoadingId");
        setupEpg(_epgMap, et -> ((WhiteTsvLoading)et).getTsvLoadingName(), (et, vl) -> ((WhiteTsvLoading)et).setTsvLoadingName((String)vl), "tsvLoadingName");
        setupEpg(_epgMap, et -> ((WhiteTsvLoading)et).getLoadingCount(), (et, vl) -> ((WhiteTsvLoading)et).setLoadingCount(cti(vl)), "loadingCount");
        setupEpg(_epgMap, et -> ((WhiteTsvLoading)et).getLoadingDate(), (et, vl) -> ((WhiteTsvLoading)et).setLoadingDate(ctld(vl)), "loadingDate");
        setupEpg(_epgMap, et -> ((WhiteTsvLoading)et).getBeginDatetime(), (et, vl) -> ((WhiteTsvLoading)et).setBeginDatetime(ctldt(vl)), "beginDatetime");
        setupEpg(_epgMap, et -> ((WhiteTsvLoading)et).getEndDatetime(), (et, vl) -> ((WhiteTsvLoading)et).setEndDatetime(ctldt(vl)), "endDatetime");
        setupEpg(_epgMap, et -> ((WhiteTsvLoading)et).getLargeFromFile(), (et, vl) -> ((WhiteTsvLoading)et).setLargeFromFile((String)vl), "largeFromFile");
        setupEpg(_epgMap, et -> ((WhiteTsvLoading)et).getDoneFlg(), (et, vl) -> {
            ((WhiteTsvLoading)et).setDoneFlg((Boolean)vl);
        }, "doneFlg");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "WHITE_TSV_LOADING";
    protected final String _tableDispName = "WHITE_TSV_LOADING";
    protected final String _tablePropertyName = "whiteTsvLoading";
    protected final TableSqlName _tableSqlName = new TableSqlName("MAIHAMADB.PUBLIC.WHITE_TSV_LOADING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTsvLoadingId = cci("TSV_LOADING_ID", "TSV_LOADING_ID", null, null, Long.class, "tsvLoadingId", null, true, false, true, "DECIMAL", 16, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTsvLoadingName = cci("TSV_LOADING_NAME", "TSV_LOADING_NAME", null, null, String.class, "tsvLoadingName", null, false, false, true, "VARCHAR", 200, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadingCount = cci("LOADING_COUNT", "LOADING_COUNT", null, null, Integer.class, "loadingCount", null, false, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLoadingDate = cci("LOADING_DATE", "LOADING_DATE", null, null, java.time.LocalDate.class, "loadingDate", null, false, false, true, "DATE", 8, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnBeginDatetime = cci("BEGIN_DATETIME", "BEGIN_DATETIME", null, null, java.time.LocalDateTime.class, "beginDatetime", null, false, false, true, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnEndDatetime = cci("END_DATETIME", "END_DATETIME", null, null, java.time.LocalDateTime.class, "endDatetime", null, false, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnLargeFromFile = cci("LARGE_FROM_FILE", "LARGE_FROM_FILE", null, null, String.class, "largeFromFile", null, false, false, false, "VARCHAR", 500, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDoneFlg = cci("DONE_FLG", "DONE_FLG", null, null, Boolean.class, "doneFlg", null, false, false, true, "BOOLEAN", 1, 0, null, false, null, null, null, null, CDef.DefMeta.Flg, false);

    /**
     * TSV_LOADING_ID: {PK, NotNull, DECIMAL(16)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsvLoadingId() { return _columnTsvLoadingId; }
    /**
     * TSV_LOADING_NAME: {NotNull, VARCHAR(200)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTsvLoadingName() { return _columnTsvLoadingName; }
    /**
     * LOADING_COUNT: {INTEGER(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadingCount() { return _columnLoadingCount; }
    /**
     * LOADING_DATE: {NotNull, DATE(8)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLoadingDate() { return _columnLoadingDate; }
    /**
     * BEGIN_DATETIME: {NotNull, TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnBeginDatetime() { return _columnBeginDatetime; }
    /**
     * END_DATETIME: {TIMESTAMP(23, 10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnEndDatetime() { return _columnEndDatetime; }
    /**
     * LARGE_FROM_FILE: {VARCHAR(500)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnLargeFromFile() { return _columnLargeFromFile; }
    /**
     * DONE_FLG: {NotNull, BOOLEAN(1), classification=Flg}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDoneFlg() { return _columnDoneFlg; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnTsvLoadingId());
        ls.add(columnTsvLoadingName());
        ls.add(columnLoadingCount());
        ls.add(columnLoadingDate());
        ls.add(columnBeginDatetime());
        ls.add(columnEndDatetime());
        ls.add(columnLargeFromFile());
        ls.add(columnDoneFlg());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnTsvLoadingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "org.docksidestage.hangar.dbflute.exentity.WhiteTsvLoading"; }
    public String getConditionBeanTypeName() { return "org.docksidestage.hangar.dbflute.cbean.WhiteTsvLoadingCB"; }
    public String getBehaviorTypeName() { return "org.docksidestage.hangar.dbflute.exbhv.WhiteTsvLoadingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<WhiteTsvLoading> getEntityType() { return WhiteTsvLoading.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public WhiteTsvLoading newEntity() { return new WhiteTsvLoading(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((WhiteTsvLoading)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((WhiteTsvLoading)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}

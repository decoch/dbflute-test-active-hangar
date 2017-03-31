package org.docksidestage.hangar.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.hangar.dbflute.exbhv.*;
import org.docksidestage.hangar.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_TSV_LOADING as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteTsvLoading {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteTsvLoading> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteTsvLoadingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteTsvLoading ready(List<WhiteTsvLoading> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteTsvLoadingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteTsvLoadingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteTsvLoading> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}

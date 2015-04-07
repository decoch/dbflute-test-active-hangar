package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.exception.ConditionInvokingFailureException;
import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.ProductStatusDbm;
import org.docksidestage.hangar.dbflute.cbean.MemberCB;
import org.docksidestage.hangar.dbflute.cbean.ProductCB;

/**
 * @author jflute
 */
public class WxIncludeQueryTest extends PlainTestCase {

    public void test_exclude_revive() {
        {
            MemberCB cb = new MemberCB();
            cb.query().queryMemberStatus().addOrderBy_DisplayOrder_Asc();
            cb.query().queryMemberStatus().addOrderBy_DisplayOrder_Desc(); // revived
        }
        {
            ProductCB cb = new ProductCB();
            ColumnInfo displayOrder = ProductStatusDbm.getInstance().columnDisplayOrder();
            cb.query().queryProductStatus().addOrderBy_DisplayOrder_Asc();
            String columnDbName = displayOrder.getColumnDbName();
            cb.query().queryProductStatus().invokeOrderBy(columnDbName, true);
        try {
                cb.query().queryProductStatus().invokeOrderBy(columnDbName, false); // excluded
                fail();
            } catch (ConditionInvokingFailureException e) {
                log(e.getClass());
                log(e.getMessage());
            }
        }
    }
}

package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.hangar.dbflute.bsentity.dbmeta.PurchaseDbm;

/**
 * @author jflute
 */
public class WxAddingCatalogTest extends PlainTestCase {

    public void test_DBMeta_tableSqlName_with_catalog_schema() {
        // ## Arrange ##
        String prefix = "MAIHAMADB.PUBLIC.";
        MemberDbm memberDbm = MemberDbm.getInstance();
        PurchaseDbm purchaseDbm = PurchaseDbm.getInstance();

        // ## Act & Assert ##
        assertEquals(prefix + memberDbm.getTableDbName(), memberDbm.getTableSqlName().toString());
        assertEquals(prefix + purchaseDbm.getTableDbName(), purchaseDbm.getTableSqlName().toString());
    }
}

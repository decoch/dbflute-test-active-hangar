package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import java.lang.reflect.Field;

import org.dbflute.exception.CharParameterShortSizeException;
import org.dbflute.outsidesql.PmbCustodial.PmbShortCharHandlingMode;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.hangar.dbflute.cbean.MemberCB;
import org.docksidestage.hangar.dbflute.exbhv.pmbean.OptionMemberPmb;
import org.docksidestage.hanger.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.6.1 (2009/11/17 Tuesday)
 */
public class WxShortCharHandlingExceptionTest extends UnitContainerTestCase {

    public void test_shortChar_conditionBean_exception() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        try {
            cb.query().invokeQueryEqual("MEMBER_STATUS_CODE", "AB");

            // ## Assert ##
            fail();
        } catch (CharParameterShortSizeException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_shortChar_parameterBean_exception() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb();

        // ## Act ##
        setMemberStatusCode(pmb, "AB");
        setStatus(pmb, "AB");

        // ## Assert ##
        try {
            pmb.getMemberStatusCode();

            fail();
        } catch (CharParameterShortSizeException e) {
            // OK
            log(e.getMessage());
        }
        pmb.getStatus(); // no exception because of not 'ref'
    }

    public void test_shortChar_parameterBean_rfillByExtension() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb() {
            @Override
            protected PmbShortCharHandlingMode chooseShortCharHandlingMode(String propertyName, String value, Integer size) {
                return PmbShortCharHandlingMode.RFILL;
            }
        };

        // ## Act ##
        setMemberStatusCode(pmb, "AB");
        setStatus(pmb, "AB");

        // ## Assert ##
        assertEquals("AB ", pmb.getMemberStatusCode());
        assertEquals("AB", pmb.getStatus());
    }

    public void test_shortChar_parameterBean_lfillByExtension() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb() {
            @Override
            protected PmbShortCharHandlingMode chooseShortCharHandlingMode(String propertyName, String value, Integer size) {
                return PmbShortCharHandlingMode.LFILL;
            }
        };

        // ## Act ##
        setMemberStatusCode(pmb, "AB");
        setStatus(pmb, "AB");

        // ## Assert ##
        assertEquals(" AB", pmb.getMemberStatusCode());
        assertEquals("AB", pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfillByExtension_null() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb() {
            @Override
            protected PmbShortCharHandlingMode chooseShortCharHandlingMode(String propertyName, String value, Integer size) {
                return PmbShortCharHandlingMode.RFILL;
            }
        };

        // ## Act ##
        setMemberStatusCode(pmb, null);
        setStatus(pmb, null);

        // ## Assert ##
        assertNull(pmb.getMemberStatusCode());
        assertNull(pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfillByExtension_empty() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb() {
            @Override
            protected PmbShortCharHandlingMode chooseShortCharHandlingMode(String propertyName, String value, Integer size) {
                return PmbShortCharHandlingMode.RFILL;
            }
        };

        // ## Act ##
        setMemberStatusCode(pmb, "");
        setStatus(pmb, "");

        // ## Assert ##
        assertNull(pmb.getMemberStatusCode());
        assertNull(pmb.getStatus());
    }

    public void test_shortChar_parameterBean_rfillByExtension_oneSpace() {
        // ## Arrange ##
        OptionMemberPmb pmb = new OptionMemberPmb() {
            @Override
            protected PmbShortCharHandlingMode chooseShortCharHandlingMode(String propertyName, String value, Integer size) {
                return PmbShortCharHandlingMode.RFILL;
            }
        };

        // ## Act ##
        setMemberStatusCode(pmb, " ");
        setStatus(pmb, " ");

        // ## Assert ##
        assertEquals("   ", pmb.getMemberStatusCode());
        assertEquals(" ", pmb.getStatus());
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void setMemberStatusCode(OptionMemberPmb pmb, String value) {
        Field field = DfReflectionUtil.getWholeField(pmb.getClass(), "_memberStatusCode");
        field.setAccessible(true);
        DfReflectionUtil.setValue(field, pmb, value);
    }

    protected void setStatus(OptionMemberPmb pmb, String value) {
        Field field = DfReflectionUtil.getWholeField(pmb.getClass(), "_status");
        field.setAccessible(true);
        DfReflectionUtil.setValue(field, pmb, value);
    }
}

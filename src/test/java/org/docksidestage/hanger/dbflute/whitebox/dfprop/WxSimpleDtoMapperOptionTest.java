package org.docksidestage.hanger.dbflute.whitebox.dfprop;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.hangar.dbflute.cbean.PurchaseCB;
import org.docksidestage.hangar.dbflute.dtomapper.MemberDtoMapper;
import org.docksidestage.hangar.dbflute.exbhv.MemberBhv;
import org.docksidestage.hangar.dbflute.exentity.Member;
import org.docksidestage.hangar.simpleflute.dto.MemberDto;
import org.docksidestage.hangar.simpleflute.dto.MemberSecurityDto;
import org.docksidestage.hangar.simpleflute.dto.MemberStatusDto;
import org.docksidestage.hangar.simpleflute.dto.ProductDto;
import org.docksidestage.hangar.simpleflute.dto.PurchaseDto;
import org.docksidestage.hanger.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.4B (2012/04/22 Sunday)
 */
public class WxSimpleDtoMapperOptionTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                    BaseOnly Mapping
    //                                                                    ================
    public void test_mappingToDtoList_baseOnly_basic_Tx() throws Exception {
        // ## Arrange ##
        MemberDtoMapper mapper = new MemberDtoMapper();
        mapper.setBaseOnlyMapping(true);
        final ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.setupSelect_MemberStatus();
            cb.setupSelect_MemberSecurityAsOne();
            cb.setupSelect_MemberWithdrawalAsOne().withWithdrawalReason();
        });

        assertHasAnyElement(memberList);
        memberBhv.loadPurchase(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.setupSelect_Product();
            }
        });

        // ## Act ##
        List<MemberDto> dtoList = mapper.mappingToDtoList(memberList);

        // ## Assert ##
        for (MemberDto memberDto : dtoList) {
            log(memberDto);
            assertNull(memberDto.getMemberStatus());
            assertNull(memberDto.getMemberSecurityAsOne());
            assertNull(memberDto.getMemberWithdrawalAsOne());
            assertHasZeroElement(memberDto.getPurchaseList());
        }
    }

    public void test_mappingToDtoList_baseOnly_false_nothing_Tx() throws Exception {
        // ## Arrange ##
        MemberDtoMapper mapper = new MemberDtoMapper();
        mapper.setBaseOnlyMapping(false);
        final ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.setupSelect_MemberStatus();
            cb.setupSelect_MemberSecurityAsOne();
        });

        assertHasAnyElement(memberList);
        memberBhv.loadPurchase(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.setupSelect_Product();
            }
        });

        // ## Act ##
        List<MemberDto> dtoList = mapper.mappingToDtoList(memberList);

        // ## Assert ##
        boolean existsPurchase = false;
        for (MemberDto memberDto : dtoList) {
            log(memberDto);
            assertNotNull(memberDto.getMemberStatus());
            assertNotNull(memberDto.getMemberSecurityAsOne());
            if (!memberDto.getPurchaseList().isEmpty()) {
                existsPurchase = true;
            }
        }
        assertTrue(existsPurchase);
    }

    // ===================================================================================
    //                                                                   Reverse Reference
    //                                                                   =================
    public void test_mappingToDtoList_reverse_basic_Tx() throws Exception {
        // ## Arrange ##
        MemberDtoMapper mapper = new MemberDtoMapper();
        mapper.setReverseReference(true);
        final ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.setupSelect_MemberStatus();
            cb.setupSelect_MemberSecurityAsOne();
            cb.setupSelect_MemberWithdrawalAsOne().withWithdrawalReason();
        });

        assertHasAnyElement(memberList);
        memberBhv.loadPurchase(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.setupSelect_Product();
            }
        });

        // ## Act ##
        List<MemberDto> dtoList = mapper.mappingToDtoList(memberList);

        // ## Assert ##
        Set<MemberStatusDto> statusSet = new HashSet<MemberStatusDto>();
        boolean existsPurchase = false;
        for (MemberDto memberDto : dtoList) {
            log(memberDto);
            statusSet.add(memberDto.getMemberStatus());
            MemberSecurityDto securityDto = memberDto.getMemberSecurityAsOne();
            assertEquals(memberDto, securityDto.getMember());
            List<PurchaseDto> purchaseList = memberDto.getPurchaseList();
            for (PurchaseDto purchaseDto : purchaseList) {
                existsPurchase = true;
                assertEquals(memberDto, purchaseDto.getMember());
                ProductDto productDto = purchaseDto.getProduct();
                assertHasAnyElement(productDto.getPurchaseList());
                assertTrue(productDto.getPurchaseList().contains(purchaseDto));
            }
        }
        assertTrue(existsPurchase);
        log("[Reverse]");
        for (MemberStatusDto statusDto : statusSet) {
            log(statusDto.getMemberStatusName());
            List<MemberDto> reverseList = statusDto.getMemberList();
            assertNotSame(0, reverseList.size());
            for (MemberDto memberDto : reverseList) {
                log("  " + memberDto);
            }
        }
    }

    // ===================================================================================
    //                                                                Ignore Common Column
    //                                                                ====================
    public void test_mappingToDtoList_exceptCommonColumn_toDto() throws Exception {
        // ## Arrange ##
        MemberDtoMapper mapper = new MemberDtoMapper();
        mapper.setExceptCommonColumn(true);
        final ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
            cb.setupSelect_MemberStatus();
            cb.setupSelect_MemberSecurityAsOne();
            cb.setupSelect_MemberWithdrawalAsOne().withWithdrawalReason();
        });

        assertHasAnyElement(memberList);
        memberBhv.loadPurchase(memberList, new ConditionBeanSetupper<PurchaseCB>() {
            public void setup(PurchaseCB cb) {
                cb.setupSelect_Product();
            }
        });

        // ## Act ##
        List<MemberDto> dtoList = mapper.mappingToDtoList(memberList);

        // ## Assert ##
        for (MemberDto memberDto : dtoList) {
            log(memberDto);
            assertNotNull(memberDto.getMemberName());
            assertNotNull(memberDto.getMemberAccount());
            assertNull(memberDto.getRegisterDatetime());
            assertNull(memberDto.getRegisterUser());
            assertNull(memberDto.getUpdateDatetime());
            assertNull(memberDto.getUpdateUser());
            assertNotNull(memberDto.getMemberStatus());
            assertNotNull(memberDto.getMemberStatus().getMemberStatusName());
            assertNotNull(memberDto.getMemberSecurityAsOne());
            assertNotNull(memberDto.getMemberSecurityAsOne().getLoginPassword());
            assertNull(memberDto.getMemberSecurityAsOne().getRegisterDatetime());
            assertNull(memberDto.getMemberSecurityAsOne().getRegisterUser());
        }
    }

    public void test_mappingToDtoList_exceptCommonColumn_toEntity() throws Exception {
        // ## Arrange ##
        List<MemberDto> dtoList;
        {
            MemberDtoMapper mapper = new MemberDtoMapper();
            final ListResultBean<Member> memberList = memberBhv.selectList(cb -> {
                cb.setupSelect_MemberStatus();
                cb.setupSelect_MemberSecurityAsOne();
                cb.setupSelect_MemberWithdrawalAsOne().withWithdrawalReason();
        });

            assertHasAnyElement(memberList);
            memberBhv.loadPurchase(memberList, new ConditionBeanSetupper<PurchaseCB>() {
                public void setup(PurchaseCB cb) {
                    cb.setupSelect_Product();
                }
            });
            dtoList = mapper.mappingToDtoList(memberList);
            for (Member member : memberList) {
                assertNotNull(member.getRegisterDatetime());
            }
        }

        // ## Act ##
        List<Member> memberList = new MemberDtoMapper().exceptCommonColumn().mappingToEntityList(dtoList);

        // ## Assert ##
        for (Member member : memberList) {
            log(member);
            assertNotNull(member.getMemberName());
            assertNotNull(member.getMemberAccount());
            assertNull(member.getRegisterDatetime());
            assertNull(member.getRegisterUser());
            assertNull(member.getUpdateDatetime());
            assertNull(member.getUpdateUser());
            assertTrue(member.getMemberStatus().isPresent());
            assertNotNull(member.getMemberStatus().get().getMemberStatusName());
            assertTrue(member.getMemberSecurityAsOne().isPresent());
            assertNotNull(member.getMemberSecurityAsOne().get().getLoginPassword());
            assertNull(member.getMemberSecurityAsOne().get().getRegisterDatetime());
            assertNull(member.getMemberSecurityAsOne().get().getRegisterUser());
        }
    }
}

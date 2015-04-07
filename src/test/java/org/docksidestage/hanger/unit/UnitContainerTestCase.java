package org.docksidestage.hanger.unit;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.sql.DataSource;
import javax.transaction.SystemException;
import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.bhv.BehaviorWritable;
import org.dbflute.bhv.writable.DeleteOption;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.exception.NonSpecifiedColumnAccessException;
import org.dbflute.utflute.core.smallhelper.ExceptionExaminer;
import org.dbflute.utflute.guice.ContainerTestCase;
import org.docksidestage.hangar.EmbeddedH2UrlFactoryBean;
import org.docksidestage.hangar.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberFollowingBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberSecurityBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberServiceBhv;
import org.docksidestage.hangar.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.hangar.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.hangar.dbflute.exbhv.PurchasePaymentBhv;
import org.docksidestage.hangar.dbflute.nogen.ExtendedDBFluteModule;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.atomikos.jdbc.nonxa.AtomikosNonXADataSourceBean;
import com.google.inject.AbstractModule;
import com.google.inject.Module;

/**
 * The test case with container.
 * @author jflute
 * @since 0.9.2 (2009/02/18 Wednesday)
 */
public abstract class UnitContainerTestCase extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private final Stack<ConditionBean> _cbStack = new Stack<ConditionBean>();
    private BehaviorSelector _behaviorSelector;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        _cbStack.clear();
    }

    // -----------------------------------------------------
    //                                                Module
    //                                                ------
    @Override
    protected List<Module> prepareModuleList() {
        final DataSource dataSource = createDataSource();
        final List<Module> moduleList = new ArrayList<Module>();
        moduleList.add(newExtendedDBFluteModule(dataSource));
        final TransactionModule transactionModule = createTransactionModule(dataSource);
        if (transactionModule != null) {
            moduleList.add(transactionModule);
        }
        return moduleList;
    }

    protected ExtendedDBFluteModule newExtendedDBFluteModule(DataSource dataSource) {
        return new ExtendedDBFluteModule(dataSource);
    }

    protected DataSource createDataSource() {
        final AtomikosNonXADataSourceBean bean = new AtomikosNonXADataSourceBean();
        bean.setUniqueResourceName("NONXADBMS");
        bean.setDriverClassName("org.h2.jdbcx.JdbcDataSource");
        final EmbeddedH2UrlFactoryBean factoryBean = new EmbeddedH2UrlFactoryBean();
        factoryBean.setUrlSuffix("/database/maihamadb");
        factoryBean.setReferenceClassName(EmbeddedH2UrlFactoryBean.class.getName());
        final String url;
        try {
            url = factoryBean.getObject().toString();
        } catch (Exception e) {
            String msg = "The factoryBean was invalid: " + factoryBean;
            throw new IllegalStateException(msg, e);
        }
        bean.setUrl(url.toString());
        bean.setUser("sa");
        bean.setPassword("");
        bean.setPoolSize(20);
        bean.setBorrowConnectionTimeout(60);
        return bean;
    }

    protected TransactionModule createTransactionModule(DataSource dataSource) {
        return new TransactionModule(dataSource);
    }

    protected static class TransactionModule extends AbstractModule {

        protected final DataSource _dataSource;

        public TransactionModule(DataSource dataSource) {
            if (dataSource == null) {
                String msg = "The argument 'dataSource' should not be null!";
                throw new IllegalArgumentException(msg);
            }
            _dataSource = dataSource;
        }

        @Override
        protected void configure() {
            try {
                final UserTransactionImp userTransactionImp = new UserTransactionImp();
                userTransactionImp.setTransactionTimeout(300);
                UserTransactionManager userTransactionManager = new UserTransactionManager();
                userTransactionManager.setForceShutdown(true);
                userTransactionManager.init();
                bind(UserTransaction.class).toInstance(userTransactionImp);
                bind(TransactionManager.class).toInstance(userTransactionManager);
                bind(DataSource.class).toInstance(_dataSource);
            } catch (SystemException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    // ===================================================================================
    //                                                                 ConditionBean Stack
    //                                                                 ===================
    protected void pushCB(ConditionBean cb) {
        _cbStack.push(cb);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> CB popCB() {
        return (CB) _cbStack.pop();
    }

    // ===================================================================================
    //                                                                         Data Helper
    //                                                                         ===========
    protected void deleteAll(Class<? extends BehaviorWritable> clazz) {
        BehaviorWritable bhv = _behaviorSelector.select(clazz);
        ConditionBean cb = bhv.newConditionBean();
        bhv.rangeRemove(cb, new DeleteOption<ConditionBean>().allowNonQueryDelete());
    }

    protected void deleteMemberReferrer() {
        deleteAll(MemberAddressBhv.class);
        deleteAll(MemberFollowingBhv.class);
        deleteAll(MemberLoginBhv.class);
        deleteAll(MemberSecurityBhv.class);
        deleteAll(MemberServiceBhv.class);
        deleteAll(MemberWithdrawalBhv.class);
        deleteAll(PurchasePaymentBhv.class);
        deleteAll(PurchaseBhv.class);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertNonSpecifiedAccess(ExceptionExaminer noArgInLambda) {
        assertException(NonSpecifiedColumnAccessException.class, noArgInLambda);
    }
}

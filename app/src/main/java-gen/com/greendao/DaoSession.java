package com.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import ys.app.petproject.itemmodel.CardNumberList2Bean;
import ys.app.petproject.itemmodel.NumCardEntityInfo;
import ys.app.petproject.model.AnimalTypeClassifyInfo;
import ys.app.petproject.model.AnimalTypeInfo;
import ys.app.petproject.model.BackGoodsReasonInfo;
import ys.app.petproject.model.CommitOrderTempInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.GoodTypeInfo;
import ys.app.petproject.model.LoginInfo;
import ys.app.petproject.model.NumCardListInfo;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.model.VipCardInfo;
import ys.app.petproject.widgetprovider.AppWidgetIdInfo;

import com.greendao.CardNumberList2BeanDao;
import com.greendao.NumCardEntityInfoDao;
import com.greendao.AnimalTypeClassifyInfoDao;
import com.greendao.AnimalTypeInfoDao;
import com.greendao.BackGoodsReasonInfoDao;
import com.greendao.CommitOrderTempInfoDao;
import com.greendao.EmployeeInfoDao;
import com.greendao.GoodTypeInfoDao;
import com.greendao.LoginInfoDao;
import com.greendao.NumCardListInfoDao;
import com.greendao.ServiceTypeInfoDao;
import com.greendao.VipCardInfoDao;
import com.greendao.AppWidgetIdInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cardNumberList2BeanDaoConfig;
    private final DaoConfig numCardEntityInfoDaoConfig;
    private final DaoConfig animalTypeClassifyInfoDaoConfig;
    private final DaoConfig animalTypeInfoDaoConfig;
    private final DaoConfig backGoodsReasonInfoDaoConfig;
    private final DaoConfig commitOrderTempInfoDaoConfig;
    private final DaoConfig employeeInfoDaoConfig;
    private final DaoConfig goodTypeInfoDaoConfig;
    private final DaoConfig loginInfoDaoConfig;
    private final DaoConfig numCardListInfoDaoConfig;
    private final DaoConfig serviceTypeInfoDaoConfig;
    private final DaoConfig vipCardInfoDaoConfig;
    private final DaoConfig appWidgetIdInfoDaoConfig;

    private final CardNumberList2BeanDao cardNumberList2BeanDao;
    private final NumCardEntityInfoDao numCardEntityInfoDao;
    private final AnimalTypeClassifyInfoDao animalTypeClassifyInfoDao;
    private final AnimalTypeInfoDao animalTypeInfoDao;
    private final BackGoodsReasonInfoDao backGoodsReasonInfoDao;
    private final CommitOrderTempInfoDao commitOrderTempInfoDao;
    private final EmployeeInfoDao employeeInfoDao;
    private final GoodTypeInfoDao goodTypeInfoDao;
    private final LoginInfoDao loginInfoDao;
    private final NumCardListInfoDao numCardListInfoDao;
    private final ServiceTypeInfoDao serviceTypeInfoDao;
    private final VipCardInfoDao vipCardInfoDao;
    private final AppWidgetIdInfoDao appWidgetIdInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cardNumberList2BeanDaoConfig = daoConfigMap.get(CardNumberList2BeanDao.class).clone();
        cardNumberList2BeanDaoConfig.initIdentityScope(type);

        numCardEntityInfoDaoConfig = daoConfigMap.get(NumCardEntityInfoDao.class).clone();
        numCardEntityInfoDaoConfig.initIdentityScope(type);

        animalTypeClassifyInfoDaoConfig = daoConfigMap.get(AnimalTypeClassifyInfoDao.class).clone();
        animalTypeClassifyInfoDaoConfig.initIdentityScope(type);

        animalTypeInfoDaoConfig = daoConfigMap.get(AnimalTypeInfoDao.class).clone();
        animalTypeInfoDaoConfig.initIdentityScope(type);

        backGoodsReasonInfoDaoConfig = daoConfigMap.get(BackGoodsReasonInfoDao.class).clone();
        backGoodsReasonInfoDaoConfig.initIdentityScope(type);

        commitOrderTempInfoDaoConfig = daoConfigMap.get(CommitOrderTempInfoDao.class).clone();
        commitOrderTempInfoDaoConfig.initIdentityScope(type);

        employeeInfoDaoConfig = daoConfigMap.get(EmployeeInfoDao.class).clone();
        employeeInfoDaoConfig.initIdentityScope(type);

        goodTypeInfoDaoConfig = daoConfigMap.get(GoodTypeInfoDao.class).clone();
        goodTypeInfoDaoConfig.initIdentityScope(type);

        loginInfoDaoConfig = daoConfigMap.get(LoginInfoDao.class).clone();
        loginInfoDaoConfig.initIdentityScope(type);

        numCardListInfoDaoConfig = daoConfigMap.get(NumCardListInfoDao.class).clone();
        numCardListInfoDaoConfig.initIdentityScope(type);

        serviceTypeInfoDaoConfig = daoConfigMap.get(ServiceTypeInfoDao.class).clone();
        serviceTypeInfoDaoConfig.initIdentityScope(type);

        vipCardInfoDaoConfig = daoConfigMap.get(VipCardInfoDao.class).clone();
        vipCardInfoDaoConfig.initIdentityScope(type);

        appWidgetIdInfoDaoConfig = daoConfigMap.get(AppWidgetIdInfoDao.class).clone();
        appWidgetIdInfoDaoConfig.initIdentityScope(type);

        cardNumberList2BeanDao = new CardNumberList2BeanDao(cardNumberList2BeanDaoConfig, this);
        numCardEntityInfoDao = new NumCardEntityInfoDao(numCardEntityInfoDaoConfig, this);
        animalTypeClassifyInfoDao = new AnimalTypeClassifyInfoDao(animalTypeClassifyInfoDaoConfig, this);
        animalTypeInfoDao = new AnimalTypeInfoDao(animalTypeInfoDaoConfig, this);
        backGoodsReasonInfoDao = new BackGoodsReasonInfoDao(backGoodsReasonInfoDaoConfig, this);
        commitOrderTempInfoDao = new CommitOrderTempInfoDao(commitOrderTempInfoDaoConfig, this);
        employeeInfoDao = new EmployeeInfoDao(employeeInfoDaoConfig, this);
        goodTypeInfoDao = new GoodTypeInfoDao(goodTypeInfoDaoConfig, this);
        loginInfoDao = new LoginInfoDao(loginInfoDaoConfig, this);
        numCardListInfoDao = new NumCardListInfoDao(numCardListInfoDaoConfig, this);
        serviceTypeInfoDao = new ServiceTypeInfoDao(serviceTypeInfoDaoConfig, this);
        vipCardInfoDao = new VipCardInfoDao(vipCardInfoDaoConfig, this);
        appWidgetIdInfoDao = new AppWidgetIdInfoDao(appWidgetIdInfoDaoConfig, this);

        registerDao(CardNumberList2Bean.class, cardNumberList2BeanDao);
        registerDao(NumCardEntityInfo.class, numCardEntityInfoDao);
        registerDao(AnimalTypeClassifyInfo.class, animalTypeClassifyInfoDao);
        registerDao(AnimalTypeInfo.class, animalTypeInfoDao);
        registerDao(BackGoodsReasonInfo.class, backGoodsReasonInfoDao);
        registerDao(CommitOrderTempInfo.class, commitOrderTempInfoDao);
        registerDao(EmployeeInfo.class, employeeInfoDao);
        registerDao(GoodTypeInfo.class, goodTypeInfoDao);
        registerDao(LoginInfo.class, loginInfoDao);
        registerDao(NumCardListInfo.class, numCardListInfoDao);
        registerDao(ServiceTypeInfo.class, serviceTypeInfoDao);
        registerDao(VipCardInfo.class, vipCardInfoDao);
        registerDao(AppWidgetIdInfo.class, appWidgetIdInfoDao);
    }
    
    public void clear() {
        cardNumberList2BeanDaoConfig.clearIdentityScope();
        numCardEntityInfoDaoConfig.clearIdentityScope();
        animalTypeClassifyInfoDaoConfig.clearIdentityScope();
        animalTypeInfoDaoConfig.clearIdentityScope();
        backGoodsReasonInfoDaoConfig.clearIdentityScope();
        commitOrderTempInfoDaoConfig.clearIdentityScope();
        employeeInfoDaoConfig.clearIdentityScope();
        goodTypeInfoDaoConfig.clearIdentityScope();
        loginInfoDaoConfig.clearIdentityScope();
        numCardListInfoDaoConfig.clearIdentityScope();
        serviceTypeInfoDaoConfig.clearIdentityScope();
        vipCardInfoDaoConfig.clearIdentityScope();
        appWidgetIdInfoDaoConfig.clearIdentityScope();
    }

    public CardNumberList2BeanDao getCardNumberList2BeanDao() {
        return cardNumberList2BeanDao;
    }

    public NumCardEntityInfoDao getNumCardEntityInfoDao() {
        return numCardEntityInfoDao;
    }

    public AnimalTypeClassifyInfoDao getAnimalTypeClassifyInfoDao() {
        return animalTypeClassifyInfoDao;
    }

    public AnimalTypeInfoDao getAnimalTypeInfoDao() {
        return animalTypeInfoDao;
    }

    public BackGoodsReasonInfoDao getBackGoodsReasonInfoDao() {
        return backGoodsReasonInfoDao;
    }

    public CommitOrderTempInfoDao getCommitOrderTempInfoDao() {
        return commitOrderTempInfoDao;
    }

    public EmployeeInfoDao getEmployeeInfoDao() {
        return employeeInfoDao;
    }

    public GoodTypeInfoDao getGoodTypeInfoDao() {
        return goodTypeInfoDao;
    }

    public LoginInfoDao getLoginInfoDao() {
        return loginInfoDao;
    }

    public NumCardListInfoDao getNumCardListInfoDao() {
        return numCardListInfoDao;
    }

    public ServiceTypeInfoDao getServiceTypeInfoDao() {
        return serviceTypeInfoDao;
    }

    public VipCardInfoDao getVipCardInfoDao() {
        return vipCardInfoDao;
    }

    public AppWidgetIdInfoDao getAppWidgetIdInfoDao() {
        return appWidgetIdInfoDao;
    }

}
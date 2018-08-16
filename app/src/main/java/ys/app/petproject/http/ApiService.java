package ys.app.petproject.http;


import java.util.Map;

import okhttp3.MultipartBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.QueryMap;
import rx.Observable;
import ys.app.petproject.itemmodel.DailySettlementBean;
import ys.app.petproject.model.AllotRecordInfo;
import ys.app.petproject.model.AllotSelectModel;
import ys.app.petproject.model.AnimalInfo;
import ys.app.petproject.model.AnimalTypeInfo;
import ys.app.petproject.model.AppointmentBean;
import ys.app.petproject.model.AppointmentMainBean;
import ys.app.petproject.model.AppointmentPointInfo;
import ys.app.petproject.model.BackGoodsReasonInfo;
import ys.app.petproject.model.BaseDataResult;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.model.BaseResult;
import ys.app.petproject.model.ChargeInfo;
import ys.app.petproject.model.ChargeResultInfo;
import ys.app.petproject.model.EmployeeAppointmentInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.EmployeePerformanceInfo;
import ys.app.petproject.model.GoodInfo;
import ys.app.petproject.model.GoodTypeInfo;
import ys.app.petproject.model.GoodUnitInfo;
import ys.app.petproject.model.InventoryRecordsInfo;
import ys.app.petproject.model.LoginInfo;
import ys.app.petproject.model.NumCardListInfo;
import ys.app.petproject.model.OrderCancelResult;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.model.OrderPayResult;
import ys.app.petproject.model.OrderQueryResult;
import ys.app.petproject.model.OutStorageInfo;
import ys.app.petproject.model.RefundResult;
import ys.app.petproject.model.RefundVipInfo;
import ys.app.petproject.model.ServiceInfo;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.model.StatisticsDataInfo;
import ys.app.petproject.model.SummitOrderInfo;
import ys.app.petproject.model.VipCardInfo;
import ys.app.petproject.model.VipInfo;
import ys.app.petproject.model.VipPayInfo;
import ys.app.petproject.model.VipRechargeInfo;
import ys.app.petproject.model.WorkTypeInfo;

/**
 * <p>Here, all data api method for the app.</p>
 * <p><b>The method requried:</b></p>
 * <p>the parameters of the api-method must have one and only three:</p>
 * <ul>
 * <li>the first which is the api-request's parameters, its data type is 'java.util.Map'; </li>
 * <li>the second which is the api-request's Cache-Control, its data type is 'java.lang.String';</li>
 * <li>the third which is the api-request's User-Agent, its data type is 'java.lang.String'. </li>
 * </ul>
 * <p>Notice:
 * for the annotation, please refer to retrofit.</p>
 * <p>
 * Created by dennis on 2016/12/15 19:31
 * for ebrun
 * you can contact me at : pengjianjun@ebrun.com
 * or see link for more details
 *
 * @version 1.0.0
 */
public interface ApiService {

    @GET("userLogin")
    Observable<BaseListResult<LoginInfo>> userLogin(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("userBackLogin")
    Observable<BaseResult> exitLogin(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectCommodityType")
    Observable<BaseListResult<GoodTypeInfo>> goodsType(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertCommodity")
    Observable<BaseResult> addGood(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectCommodityUnit")
    Observable<BaseListResult<GoodUnitInfo>> goodsUnit(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectCommodity")
    Observable<BaseListResult<GoodInfo>> getGoods(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectProductType")
    Observable<BaseListResult<ServiceTypeInfo>> serviceType(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertProduct")
    Observable<BaseResult> addService(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);


    @FormUrlEncoded
    @POST("insertVipCard")
    Observable<BaseResult> addVipCard(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectVipCard")
    Observable<BaseListResult<VipCardInfo>> queryVipList(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("deleteVipCard")
    Observable<BaseResult> deleteVipCard(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    //作废会员卡
    @GET("updateVipCardState")
    Observable<BaseResult> updateVipCardState(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateVipCard")
    Observable<BaseResult> updateVipCard(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectProductType2")
    Observable<BaseListResult<ServiceTypeInfo>> queryServiceType(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertVipUser")
    Observable<BaseResult> insertVip(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("wangPosReturnUrl")
    Observable<BaseResult> wangPosReturnUrl(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);


    @FormUrlEncoded
    @POST("selectVipUser")
    Observable<BaseListResult<VipInfo>> queryVip(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateVipUser")
    Observable<BaseResult> updateVip(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertPet")
    Observable<BaseResult> insertAnimal(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updatePet")
    Observable<BaseResult> updateAnimal(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectPet")
    Observable<BaseListResult<AnimalInfo>> queryAnimal(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectPetType")
    Observable<BaseListResult<AnimalTypeInfo>> queryAnimalType(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertRecharge")
    Observable<BaseListResult<ChargeInfo>> insertRecharge(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("insertOrderRecharge")
    Observable<BaseResult> insertRechargeOrder(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectUserList")
    Observable<BaseListResult<EmployeeInfo>> queryEmployeeList(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectProduct")
    Observable<BaseListResult<ServiceInfo>> queryServiceList(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateProduct")
    Observable<BaseResult> updateService(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertOrderDetailed")
    Observable<BaseResult> getOrderId(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateCommodityInventory")
    Observable<BaseResult> checkInvertory(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateCommodityStock")
    Observable<BaseResult> updateInvertory(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertAllocation")
    Observable<BaseResult> insertAllocation(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateCommodity")
    Observable<BaseResult> updateGoods(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectOutboundReasons")
    Observable<BaseListResult<BackGoodsReasonInfo>> backReasonList(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectOrderDetailed")
    Observable<BaseListResult<SummitOrderInfo>> queryOrderList(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectOrder")
    Observable<BaseListResult<ChargeResultInfo>> queryChargeOrder(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertEquipmentShop")
    Observable<BaseResult> uploadDeviceInfo(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertOrder")
    Observable<BaseResult> insertOrder(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

//
//    @GET("/pictureapp_{commodity}")
//    Observable<BaseResult> uploadImg(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    /*上传文件*/
//    @Multipart
//    @POST("pictureapp_commodity")
//    Observable<BaseResult> uploadImg(@Part MultipartBody.Part file);
    @Multipart
    @POST("commitPic")
    Observable<BaseResult> uploadImg(@Part MultipartBody.Part file);


    @GET("orderReturn")
    Observable<BaseResult> vipPay(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectOrder")
    Observable<BaseListResult<OrderInfo>> queryOrder(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);


    @GET("updateOrder")
    Observable<BaseResult> updateOrder(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);


    @GET("ShopUserAchievementReturn")
    Observable<BaseDataResult<EmployeePerformanceInfo>> queryEmployeePerformance(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectTypeWork")
    Observable<BaseListResult<WorkTypeInfo>> queryWorkType(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectOrderToday")
    Observable<BaseDataResult<StatisticsDataInfo>> queryStatistics(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectRecharge")
    Observable<BaseListResult<VipRechargeInfo>> queryVipRecharge(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectCommodityInventory")
    Observable<BaseListResult<InventoryRecordsInfo>> selectCommodityInventory(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertUserList")
    Observable<BaseResult> insertUserList(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectOrder")
    Observable<BaseListResult<VipPayInfo>> queryVipPay(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updatePasswordBoss")
    Observable<BaseResult> modifyBossPsw(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updatePassword2")
    Observable<BaseResult> lostLoginPsw(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updatePassword")
    Observable<BaseResult> modifyLoginPsw(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    /**
     * 充值订单 修改
     * @param params
     * @param cache
     * @param userAgent
     * @return
     */
    @FormUrlEncoded
    @POST("updateRecharge ")
    Observable<BaseResult> updateRecharge(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    /**
     * 商品/服务订单 修改
     * @param params
     * @param cache
     * @param userAgent
     * @return
     */
    @FormUrlEncoded
    @POST("updateOrderDetailed ")
    Observable<BaseResult> updateOrderDetailed(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectVipUser")
    Observable<BaseListResult<VipInfo>> selectVip(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("findSMSValid")
    Observable<BaseResult> sendSms(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateUserList ")
    Observable<BaseResult> updateEmployee(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("userLoginBoss")
    Observable<BaseListResult<LoginInfo>> userLoginBoss(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectBranchShop")
    Observable<BaseListResult<AllotSelectModel>> selectBranchShop(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectAllocationList")
    Observable<BaseListResult<AllotRecordInfo>> selectAllocationList(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateAllocation")
    Observable<BaseResult> updateAllocation(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectBespeakSetupPoint")
    Observable<BaseListResult<AppointmentPointInfo>> selectBespeakSetupPoint(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectBespeakSetupUser")
    Observable<BaseListResult<EmployeeAppointmentInfo>> selectBespeakSetupUser(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertBespeak")
    Observable<BaseResult> insertBespeak(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectBespeak")
    Observable<BaseListResult<AppointmentBean>> selectBespeak(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectBespeakByDay")
    Observable<BaseListResult<AppointmentMainBean>> selectBespeakByDay(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("updateBespeak")
    Observable<BaseResult> updateBespeak(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("/selectStockList")//出入库记录
    Observable<BaseListResult<OutStorageInfo>> selectStockList(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("/selectSettlementByDay")//业绩统计打印
    Observable<BaseDataResult<DailySettlementBean>> selectSettlementByDay(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("refundOrder ")//退款
    Observable<BaseResult> refundOrder(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("refundVipUserOrder ")//退会员卡
    Observable<BaseResult> refundVipUserOrder(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("refundVipUser ")//退卡信息
    Observable<BaseDataResult<RefundVipInfo>> refundVipUser(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectVipCardNumber")//次卡列表和详情
    Observable<BaseListResult<NumCardListInfo>> selectVipCardNumber(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertNumberCard")//新增次卡
    Observable<BaseDataResult> insertNumberCard(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectOnlyNumberCard")//次卡列表
    Observable<BaseListResult<NumCardListInfo>> selectOnlyNumberCard(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("insertOrderDetailedCardNumber")
    Observable<BaseResult> insertOrderDetailedCardNumber(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("selectPublicLibrary")
    Observable<BaseListResult<GoodInfo>> selectPublicLibrary(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectEquipmentShop")//获取店铺手机号
    Observable<BaseResult> selectEquipmentShop(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @GET("selectVipUserMessage")//查找有需要提醒的会员
    Observable<BaseListResult<VipInfo>> selectVipUserMessage(@QueryMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("pay/doPay")//杉德下单
    Observable<OrderPayResult> doPay(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("order/query")//查询杉德支付结果
    Observable<OrderQueryResult> querySandOrder(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("refund/doRefund")//订单退款
    Observable<RefundResult> doRefund(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("order/cancel")//订单退款
    Observable<OrderCancelResult> cancelPay(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);

    @FormUrlEncoded
    @POST("shandeVirtualReturnUrl")//支付完成,更新订单信息
    Observable<BaseResult> shandeVirtualReturnUrl(@FieldMap Map<String, String> params, @Header("Cache-Control") String cache, @Header("User-Agent") String userAgent);
}

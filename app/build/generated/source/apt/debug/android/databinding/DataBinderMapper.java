
package android.databinding;
import ys.app.petproject.BR;
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 19;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case ys.app.petproject.R.layout.activity_modify_boss_psw:
                    return ys.app.petproject.databinding.ActivityModifyBossPswBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_service:
                    return ys.app.petproject.databinding.FragmentServiceBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_add_vip_card:
                    return ys.app.petproject.databinding.ActivityAddVipCardBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_shopping_pay:
                    return ys.app.petproject.databinding.ActivityShoppingPayBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_order2:
                    return ys.app.petproject.databinding.ItemOrder2Binding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_child_order:
                    return ys.app.petproject.databinding.ItemChildOrderBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_refund_vip:
                    return ys.app.petproject.databinding.ActivityRefundVipBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_employee_performance_1:
                    return ys.app.petproject.databinding.ItemEmployeePerformance1Binding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_employee_performance_3:
                    return ys.app.petproject.databinding.ItemEmployeePerformance3Binding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_vip_pet_list:
                    return ys.app.petproject.databinding.VipPetListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_employee:
                    return ys.app.petproject.databinding.ItemEmployeeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_employee_performance_2:
                    return ys.app.petproject.databinding.ItemEmployeePerformance2Binding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_service_settings:
                    return ys.app.petproject.databinding.ServiceSettingsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_employee_detail:
                    return ys.app.petproject.databinding.ActivityEmployeeDetailBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_statistics:
                    return ys.app.petproject.databinding.ActivityStatisticsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_service_num_list:
                    return ys.app.petproject.databinding.FragmentServiceNumListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_confirm_check_out:
                    return ys.app.petproject.databinding.ItemConfirmCheckOutBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_service_search:
                    return ys.app.petproject.databinding.ItemServiceSearchBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_login:
                    return ys.app.petproject.databinding.ActivityLoginBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_modify:
                    return ys.app.petproject.databinding.ActivityModifyBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_inventory_records_detail:
                    return ys.app.petproject.databinding.InventoryRecordsDetailBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_appointment_main:
                    return ys.app.petproject.databinding.AppointmentMainItemModelBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_vip_search:
                    return ys.app.petproject.databinding.ItemVipSearchBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_service_detail:
                    return ys.app.petproject.databinding.ServiceDetailActivityBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_inventory_record_detail:
                    return ys.app.petproject.databinding.InventoryRecordDetailBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_inventory:
                    return ys.app.petproject.databinding.ActivityInventoryBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_achievement:
                    return ys.app.petproject.databinding.ActivityAchievementBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_add_animal:
                    return ys.app.petproject.databinding.ActivityAddAnimalBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_employee_performance:
                    return ys.app.petproject.databinding.ActivityEmployeePerformanceBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_goods_detail:
                    return ys.app.petproject.databinding.ActivityGoodsDetailBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_employee_list:
                    return ys.app.petproject.databinding.ItemEmployeeListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_sale:
                    return ys.app.petproject.databinding.ActivitySaleBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_num_card_list:
                    return ys.app.petproject.databinding.ActivityNumCardListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_employee_name_new:
                    return ys.app.petproject.databinding.ItemEmployeeNameNewBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_all_achievement:
                    return ys.app.petproject.databinding.ActivityAllAchievementBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_sand_qrcode:
                    return ys.app.petproject.databinding.SandQRCodeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_add_inventory:
                    return ys.app.petproject.databinding.ActivityAddInventoryBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_search:
                    return ys.app.petproject.databinding.ActivitySearchBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_good_type_in_vip:
                    return ys.app.petproject.databinding.ItemGoodTypeInVipBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_transaction_detail:
                    return ys.app.petproject.databinding.TransactionDetailBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_num_card_service:
                    return ys.app.petproject.databinding.ItemNumCardBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_start:
                    return ys.app.petproject.databinding.ActivityStartBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_num_card_list:
                    return ys.app.petproject.databinding.ItemNumCardListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.dialog_customer_type:
                    return ys.app.petproject.databinding.DialogCustomerTypeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_check:
                    return ys.app.petproject.databinding.ActivityCheckBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_pay:
                    return ys.app.petproject.databinding.ActivityPayBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_check:
                    return ys.app.petproject.databinding.ItemCheckBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_add:
                    return ys.app.petproject.databinding.ActivityAddBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_about_us:
                    return ys.app.petproject.databinding.ActivityAboutUsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_shopping_pay_result:
                    return ys.app.petproject.databinding.ActivityShoppingPayResultBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_goods_search:
                    return ys.app.petproject.databinding.ItemGoodsSearchBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_personal_pay:
                    return ys.app.petproject.databinding.PersonalPayBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_manager:
                    return ys.app.petproject.databinding.ActivityManagerBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_add_employee:
                    return ys.app.petproject.databinding.ItemAddEmployeeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_employee_list:
                    return ys.app.petproject.databinding.ActivityEmployeeListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_employee_name:
                    return ys.app.petproject.databinding.ItemEmployeeNameBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_vip_card:
                    return ys.app.petproject.databinding.ItemVipCardBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_out_put_inventory:
                    return ys.app.petproject.databinding.ItemOutPutBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_add_goods:
                    return ys.app.petproject.databinding.FragmentAddGoodsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_commit_order:
                    return ys.app.petproject.databinding.ActivityCommitOrderBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_charge:
                    return ys.app.petproject.databinding.ActivityChargeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_animal:
                    return ys.app.petproject.databinding.ItemAnimalBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_add_vip:
                    return ys.app.petproject.databinding.ActivityAddVipBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_num_card_detail:
                    return ys.app.petproject.databinding.NumCardFragmentBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.ac_sunmi_scan_finder:
                    return ys.app.petproject.databinding.SunmiScanBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_service_list:
                    return ys.app.petproject.databinding.FragmentServiceListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_add_service:
                    return ys.app.petproject.databinding.FragmentAddServiceBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_out_storage_detail:
                    return ys.app.petproject.databinding.OutStorageDetialBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_appointment_main:
                    return ys.app.petproject.databinding.ActivityAppointmentMainBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_add_service:
                    return ys.app.petproject.databinding.ActivityAddServiceBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_service_type_in_vip:
                    return ys.app.petproject.databinding.ItemServiceTypeInVipBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_vip_consume:
                    return ys.app.petproject.databinding.VipConsumesBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_pay_result:
                    return ys.app.petproject.databinding.ActivityPayResultBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_vip_card:
                    return ys.app.petproject.databinding.FragmentVipCardBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_vip_consume:
                    return ys.app.petproject.databinding.ItemVipConsumeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_normal_appointment:
                    return ys.app.petproject.databinding.NormalAppointmentBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_ticket_mange:
                    return ys.app.petproject.databinding.TicketManageBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_transaction:
                    return ys.app.petproject.databinding.ItemTransactionBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_inventory_record:
                    return ys.app.petproject.databinding.InventoryRecordItemBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_inventory_records:
                    return ys.app.petproject.databinding.InventoryRecordsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_add_goods:
                    return ys.app.petproject.databinding.ActivityAddGoodsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_modify_service:
                    return ys.app.petproject.databinding.ModifyServiceDetailActivityBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_goods_name:
                    return ys.app.petproject.databinding.ItemGoodsNameBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_paymethod_statistics:
                    return ys.app.petproject.databinding.ItemPayMethodStatisticsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_vip_recharge:
                    return ys.app.petproject.databinding.VipRechargeRecordsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_vip_pet_child:
                    return ys.app.petproject.databinding.ItemVipPetChildBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_inventory:
                    return ys.app.petproject.databinding.ItemInventoryBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_modify_psw:
                    return ys.app.petproject.databinding.ActivityModifyPswBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_vip_recharge:
                    return ys.app.petproject.databinding.ItemVipRechargeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_vip_detail:
                    return ys.app.petproject.databinding.ActivityVipDetailBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_search_service:
                    return ys.app.petproject.databinding.ItemSearchServiceBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_goods_list:
                    return ys.app.petproject.databinding.FragmentGoodsListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_vip:
                    return ys.app.petproject.databinding.ItemVipBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_transaction_detail:
                    return ys.app.petproject.databinding.ItemTransactionDetailBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_allot_record_list:
                    return ys.app.petproject.databinding.AllotRecordAcitivtyBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_allot_shop_list:
                    return ys.app.petproject.databinding.AllotListActivityBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_vip_appointment:
                    return ys.app.petproject.databinding.VipAppointmentBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_vip_card:
                    return ys.app.petproject.databinding.ActivityVipCardBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_collect_money:
                    return ys.app.petproject.databinding.ActivityCollectMoneyBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_add_employee:
                    return ys.app.petproject.databinding.ActivityAddEmployeeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_forget_pwd:
                    return ys.app.petproject.databinding.ForgetPwdActivityBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_edit_employee:
                    return ys.app.petproject.databinding.ActivityEditEmployeeBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_goods:
                    return ys.app.petproject.databinding.ItemGoodsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_main:
                    return ys.app.petproject.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_pay_list:
                    return ys.app.petproject.databinding.ActivityPayListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_vip_record:
                    return ys.app.petproject.databinding.VipRecordActivityBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_take_out_inventory:
                    return ys.app.petproject.databinding.ActivityTakeOutInventoryBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_appointment_list:
                    return ys.app.petproject.databinding.AppointmentListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_goods:
                    return ys.app.petproject.databinding.ActivityGoodsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_service:
                    return ys.app.petproject.databinding.ItemServiceBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_settle_order:
                    return ys.app.petproject.databinding.ItemSettleOrderBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_out_put_list:
                    return ys.app.petproject.databinding.OutPutRecordListBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_allot_manage:
                    return ys.app.petproject.databinding.ItemAllotShopRecordBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_num_card_detail:
                    return ys.app.petproject.databinding.NumCardDetailBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_goods_or_service_statistics:
                    return ys.app.petproject.databinding.ItemGoodsOrServiceStatisticsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_inventory_records:
                    return ys.app.petproject.databinding.ItemInventoryRecordBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.fragment_goods:
                    return ys.app.petproject.databinding.FragmentGoodsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_service_settings:
                    return ys.app.petproject.databinding.ItemServiceSettingsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_search_goods:
                    return ys.app.petproject.databinding.ItemSearchGoodsBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_employee_shop_car_goods:
                    return ys.app.petproject.databinding.EmployeeServiceBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.activity_service:
                    return ys.app.petproject.databinding.ActivityServiceBinding.bind(view, bindingComponent);
                case ys.app.petproject.R.layout.item_appointment:
                    return ys.app.petproject.databinding.ItemAppointmentBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case -756728915: {
                if(tag.equals("layout/activity_modify_boss_psw_0")) {
                    return ys.app.petproject.R.layout.activity_modify_boss_psw;
                }
                break;
            }
            case -1543473924: {
                if(tag.equals("layout/fragment_service_0")) {
                    return ys.app.petproject.R.layout.fragment_service;
                }
                break;
            }
            case -1756487988: {
                if(tag.equals("layout/activity_add_vip_card_0")) {
                    return ys.app.petproject.R.layout.activity_add_vip_card;
                }
                break;
            }
            case -2106340339: {
                if(tag.equals("layout/activity_shopping_pay_0")) {
                    return ys.app.petproject.R.layout.activity_shopping_pay;
                }
                break;
            }
            case 804388572: {
                if(tag.equals("layout/item_order2_0")) {
                    return ys.app.petproject.R.layout.item_order2;
                }
                break;
            }
            case 200731189: {
                if(tag.equals("layout/item_child_order_0")) {
                    return ys.app.petproject.R.layout.item_child_order;
                }
                break;
            }
            case 289362706: {
                if(tag.equals("layout/activity_refund_vip_0")) {
                    return ys.app.petproject.R.layout.activity_refund_vip;
                }
                break;
            }
            case -1355069687: {
                if(tag.equals("layout/item_employee_performance_1_0")) {
                    return ys.app.petproject.R.layout.item_employee_performance_1;
                }
                break;
            }
            case -1355067765: {
                if(tag.equals("layout/item_employee_performance_3_0")) {
                    return ys.app.petproject.R.layout.item_employee_performance_3;
                }
                break;
            }
            case -531031656: {
                if(tag.equals("layout/item_vip_pet_list_0")) {
                    return ys.app.petproject.R.layout.item_vip_pet_list;
                }
                break;
            }
            case -622828890: {
                if(tag.equals("layout/item_employee_0")) {
                    return ys.app.petproject.R.layout.item_employee;
                }
                break;
            }
            case -1355068726: {
                if(tag.equals("layout/item_employee_performance_2_0")) {
                    return ys.app.petproject.R.layout.item_employee_performance_2;
                }
                break;
            }
            case -496477015: {
                if(tag.equals("layout/activity_service_settings_0")) {
                    return ys.app.petproject.R.layout.activity_service_settings;
                }
                break;
            }
            case 118916872: {
                if(tag.equals("layout/activity_employee_detail_0")) {
                    return ys.app.petproject.R.layout.activity_employee_detail;
                }
                break;
            }
            case -1378399713: {
                if(tag.equals("layout/activity_statistics_0")) {
                    return ys.app.petproject.R.layout.activity_statistics;
                }
                break;
            }
            case 590785628: {
                if(tag.equals("layout/fragment_service_num_list_0")) {
                    return ys.app.petproject.R.layout.fragment_service_num_list;
                }
                break;
            }
            case 439915170: {
                if(tag.equals("layout/item_confirm_check_out_0")) {
                    return ys.app.petproject.R.layout.item_confirm_check_out;
                }
                break;
            }
            case -2002583510: {
                if(tag.equals("layout/item_service_search_0")) {
                    return ys.app.petproject.R.layout.item_service_search;
                }
                break;
            }
            case -237232145: {
                if(tag.equals("layout/activity_login_0")) {
                    return ys.app.petproject.R.layout.activity_login;
                }
                break;
            }
            case -1402518154: {
                if(tag.equals("layout/activity_modify_0")) {
                    return ys.app.petproject.R.layout.activity_modify;
                }
                break;
            }
            case 1270241389: {
                if(tag.equals("layout/activity_inventory_records_detail_0")) {
                    return ys.app.petproject.R.layout.activity_inventory_records_detail;
                }
                break;
            }
            case -468888431: {
                if(tag.equals("layout/item_appointment_main_0")) {
                    return ys.app.petproject.R.layout.item_appointment_main;
                }
                break;
            }
            case -1014993086: {
                if(tag.equals("layout/item_vip_search_0")) {
                    return ys.app.petproject.R.layout.item_vip_search;
                }
                break;
            }
            case -663042409: {
                if(tag.equals("layout/activity_service_detail_0")) {
                    return ys.app.petproject.R.layout.activity_service_detail;
                }
                break;
            }
            case -27635610: {
                if(tag.equals("layout/item_inventory_record_detail_0")) {
                    return ys.app.petproject.R.layout.item_inventory_record_detail;
                }
                break;
            }
            case -354023774: {
                if(tag.equals("layout/activity_inventory_0")) {
                    return ys.app.petproject.R.layout.activity_inventory;
                }
                break;
            }
            case 740983413: {
                if(tag.equals("layout/activity_achievement_0")) {
                    return ys.app.petproject.R.layout.activity_achievement;
                }
                break;
            }
            case 775369366: {
                if(tag.equals("layout/activity_add_animal_0")) {
                    return ys.app.petproject.R.layout.activity_add_animal;
                }
                break;
            }
            case 1403631707: {
                if(tag.equals("layout/activity_employee_performance_0")) {
                    return ys.app.petproject.R.layout.activity_employee_performance;
                }
                break;
            }
            case 864600534: {
                if(tag.equals("layout/activity_goods_detail_0")) {
                    return ys.app.petproject.R.layout.activity_goods_detail;
                }
                break;
            }
            case -1280195559: {
                if(tag.equals("layout/item_employee_list_0")) {
                    return ys.app.petproject.R.layout.item_employee_list;
                }
                break;
            }
            case 595608707: {
                if(tag.equals("layout/activity_sale_0")) {
                    return ys.app.petproject.R.layout.activity_sale;
                }
                break;
            }
            case 72246202: {
                if(tag.equals("layout/activity_num_card_list_0")) {
                    return ys.app.petproject.R.layout.activity_num_card_list;
                }
                break;
            }
            case -2860825: {
                if(tag.equals("layout/item_employee_name_new_0")) {
                    return ys.app.petproject.R.layout.item_employee_name_new;
                }
                break;
            }
            case -1706414633: {
                if(tag.equals("layout/activity_all_achievement_0")) {
                    return ys.app.petproject.R.layout.activity_all_achievement;
                }
                break;
            }
            case -1206722449: {
                if(tag.equals("layout/activity_sand_qrcode_0")) {
                    return ys.app.petproject.R.layout.activity_sand_qrcode;
                }
                break;
            }
            case -682188412: {
                if(tag.equals("layout/activity_add_inventory_0")) {
                    return ys.app.petproject.R.layout.activity_add_inventory;
                }
                break;
            }
            case 101625572: {
                if(tag.equals("layout/activity_search_0")) {
                    return ys.app.petproject.R.layout.activity_search;
                }
                break;
            }
            case -160426722: {
                if(tag.equals("layout/item_good_type_in_vip_0")) {
                    return ys.app.petproject.R.layout.item_good_type_in_vip;
                }
                break;
            }
            case 1802443534: {
                if(tag.equals("layout/activity_transaction_detail_0")) {
                    return ys.app.petproject.R.layout.activity_transaction_detail;
                }
                break;
            }
            case -1889596073: {
                if(tag.equals("layout/item_num_card_service_0")) {
                    return ys.app.petproject.R.layout.item_num_card_service;
                }
                break;
            }
            case 1818204840: {
                if(tag.equals("layout/activity_start_0")) {
                    return ys.app.petproject.R.layout.activity_start;
                }
                break;
            }
            case -104477122: {
                if(tag.equals("layout/item_num_card_list_0")) {
                    return ys.app.petproject.R.layout.item_num_card_list;
                }
                break;
            }
            case -859490438: {
                if(tag.equals("layout/dialog_customer_type_0")) {
                    return ys.app.petproject.R.layout.dialog_customer_type;
                }
                break;
            }
            case 162736590: {
                if(tag.equals("layout/activity_check_0")) {
                    return ys.app.petproject.R.layout.activity_check;
                }
                break;
            }
            case -1646113106: {
                if(tag.equals("layout/activity_pay_0")) {
                    return ys.app.petproject.R.layout.activity_pay;
                }
                break;
            }
            case 1005541458: {
                if(tag.equals("layout/item_check_0")) {
                    return ys.app.petproject.R.layout.item_check;
                }
                break;
            }
            case -1659896729: {
                if(tag.equals("layout/activity_add_0")) {
                    return ys.app.petproject.R.layout.activity_add;
                }
                break;
            }
            case 1018757388: {
                if(tag.equals("layout/activity_about_us_0")) {
                    return ys.app.petproject.R.layout.activity_about_us;
                }
                break;
            }
            case -1910386159: {
                if(tag.equals("layout/activity_shopping_pay_result_0")) {
                    return ys.app.petproject.R.layout.activity_shopping_pay_result;
                }
                break;
            }
            case 1118456425: {
                if(tag.equals("layout/item_goods_search_0")) {
                    return ys.app.petproject.R.layout.item_goods_search;
                }
                break;
            }
            case -1708065051: {
                if(tag.equals("layout/activity_personal_pay_0")) {
                    return ys.app.petproject.R.layout.activity_personal_pay;
                }
                break;
            }
            case 898485747: {
                if(tag.equals("layout/activity_manager_0")) {
                    return ys.app.petproject.R.layout.activity_manager;
                }
                break;
            }
            case -1922693756: {
                if(tag.equals("layout/item_add_employee_0")) {
                    return ys.app.petproject.R.layout.item_add_employee;
                }
                break;
            }
            case -1103472235: {
                if(tag.equals("layout/activity_employee_list_0")) {
                    return ys.app.petproject.R.layout.activity_employee_list;
                }
                break;
            }
            case -1230518586: {
                if(tag.equals("layout/item_employee_name_0")) {
                    return ys.app.petproject.R.layout.item_employee_name;
                }
                break;
            }
            case -46681878: {
                if(tag.equals("layout/item_vip_card_0")) {
                    return ys.app.petproject.R.layout.item_vip_card;
                }
                break;
            }
            case 1421264389: {
                if(tag.equals("layout/item_out_put_inventory_0")) {
                    return ys.app.petproject.R.layout.item_out_put_inventory;
                }
                break;
            }
            case 1939731007: {
                if(tag.equals("layout/fragment_add_goods_0")) {
                    return ys.app.petproject.R.layout.fragment_add_goods;
                }
                break;
            }
            case 2110690242: {
                if(tag.equals("layout/activity_commit_order_0")) {
                    return ys.app.petproject.R.layout.activity_commit_order;
                }
                break;
            }
            case 649091312: {
                if(tag.equals("layout/activity_charge_0")) {
                    return ys.app.petproject.R.layout.activity_charge;
                }
                break;
            }
            case -1225083852: {
                if(tag.equals("layout/item_animal_0")) {
                    return ys.app.petproject.R.layout.item_animal;
                }
                break;
            }
            case 1718176069: {
                if(tag.equals("layout/activity_add_vip_0")) {
                    return ys.app.petproject.R.layout.activity_add_vip;
                }
                break;
            }
            case 950836462: {
                if(tag.equals("layout/fragment_num_card_detail_0")) {
                    return ys.app.petproject.R.layout.fragment_num_card_detail;
                }
                break;
            }
            case -1869976662: {
                if(tag.equals("layout/ac_sunmi_scan_finder_0")) {
                    return ys.app.petproject.R.layout.ac_sunmi_scan_finder;
                }
                break;
            }
            case -393365629: {
                if(tag.equals("layout/fragment_service_list_0")) {
                    return ys.app.petproject.R.layout.fragment_service_list;
                }
                break;
            }
            case -1523353634: {
                if(tag.equals("layout/fragment_add_service_0")) {
                    return ys.app.petproject.R.layout.fragment_add_service;
                }
                break;
            }
            case 344286434: {
                if(tag.equals("layout/activity_out_storage_detail_0")) {
                    return ys.app.petproject.R.layout.activity_out_storage_detail;
                }
                break;
            }
            case -1334248043: {
                if(tag.equals("layout/activity_appointment_main_0")) {
                    return ys.app.petproject.R.layout.activity_appointment_main;
                }
                break;
            }
            case 1249168989: {
                if(tag.equals("layout/activity_add_service_0")) {
                    return ys.app.petproject.R.layout.activity_add_service;
                }
                break;
            }
            case 237577768: {
                if(tag.equals("layout/item_service_type_in_vip_0")) {
                    return ys.app.petproject.R.layout.item_service_type_in_vip;
                }
                break;
            }
            case 1235131361: {
                if(tag.equals("layout/fragment_vip_consume_0")) {
                    return ys.app.petproject.R.layout.fragment_vip_consume;
                }
                break;
            }
            case 140134480: {
                if(tag.equals("layout/activity_pay_result_0")) {
                    return ys.app.petproject.R.layout.activity_pay_result;
                }
                break;
            }
            case 1865894925: {
                if(tag.equals("layout/fragment_vip_card_0")) {
                    return ys.app.petproject.R.layout.fragment_vip_card;
                }
                break;
            }
            case 695741924: {
                if(tag.equals("layout/item_vip_consume_0")) {
                    return ys.app.petproject.R.layout.item_vip_consume;
                }
                break;
            }
            case 1871137954: {
                if(tag.equals("layout/fragment_normal_appointment_0")) {
                    return ys.app.petproject.R.layout.fragment_normal_appointment;
                }
                break;
            }
            case 408287873: {
                if(tag.equals("layout/activity_ticket_mange_0")) {
                    return ys.app.petproject.R.layout.activity_ticket_mange;
                }
                break;
            }
            case 2042024424: {
                if(tag.equals("layout/item_transaction_0")) {
                    return ys.app.petproject.R.layout.item_transaction;
                }
                break;
            }
            case -1281477620: {
                if(tag.equals("layout/item_inventory_record_0")) {
                    return ys.app.petproject.R.layout.item_inventory_record;
                }
                break;
            }
            case -2127424027: {
                if(tag.equals("layout/activity_inventory_records_0")) {
                    return ys.app.petproject.R.layout.activity_inventory_records;
                }
                break;
            }
            case 1643175038: {
                if(tag.equals("layout/activity_add_goods_0")) {
                    return ys.app.petproject.R.layout.activity_add_goods;
                }
                break;
            }
            case 1182111852: {
                if(tag.equals("layout/activity_modify_service_0")) {
                    return ys.app.petproject.R.layout.activity_modify_service;
                }
                break;
            }
            case -1772145012: {
                if(tag.equals("layout/item_goods_name_0")) {
                    return ys.app.petproject.R.layout.item_goods_name;
                }
                break;
            }
            case 1860025937: {
                if(tag.equals("layout/item_paymethod_statistics_0")) {
                    return ys.app.petproject.R.layout.item_paymethod_statistics;
                }
                break;
            }
            case -1855242268: {
                if(tag.equals("layout/fragment_vip_recharge_0")) {
                    return ys.app.petproject.R.layout.fragment_vip_recharge;
                }
                break;
            }
            case 1282192932: {
                if(tag.equals("layout/item_vip_pet_child_0")) {
                    return ys.app.petproject.R.layout.item_vip_pet_child;
                }
                break;
            }
            case 782193446: {
                if(tag.equals("layout/item_inventory_0")) {
                    return ys.app.petproject.R.layout.item_inventory;
                }
                break;
            }
            case -143160373: {
                if(tag.equals("layout/activity_modify_psw_0")) {
                    return ys.app.petproject.R.layout.activity_modify_psw;
                }
                break;
            }
            case -1396445631: {
                if(tag.equals("layout/item_vip_recharge_0")) {
                    return ys.app.petproject.R.layout.item_vip_recharge;
                }
                break;
            }
            case -1721903185: {
                if(tag.equals("layout/activity_vip_detail_0")) {
                    return ys.app.petproject.R.layout.activity_vip_detail;
                }
                break;
            }
            case -1987995178: {
                if(tag.equals("layout/item_search_service_0")) {
                    return ys.app.petproject.R.layout.item_search_service;
                }
                break;
            }
            case -2081516990: {
                if(tag.equals("layout/fragment_goods_list_0")) {
                    return ys.app.petproject.R.layout.fragment_goods_list;
                }
                break;
            }
            case 1207458919: {
                if(tag.equals("layout/item_vip_0")) {
                    return ys.app.petproject.R.layout.item_vip;
                }
                break;
            }
            case 189375242: {
                if(tag.equals("layout/item_transaction_detail_0")) {
                    return ys.app.petproject.R.layout.item_transaction_detail;
                }
                break;
            }
            case 1730213593: {
                if(tag.equals("layout/activity_allot_record_list_0")) {
                    return ys.app.petproject.R.layout.activity_allot_record_list;
                }
                break;
            }
            case -618030188: {
                if(tag.equals("layout/activity_allot_shop_list_0")) {
                    return ys.app.petproject.R.layout.activity_allot_shop_list;
                }
                break;
            }
            case 196535492: {
                if(tag.equals("layout/fragment_vip_appointment_0")) {
                    return ys.app.petproject.R.layout.fragment_vip_appointment;
                }
                break;
            }
            case 332307950: {
                if(tag.equals("layout/activity_vip_card_0")) {
                    return ys.app.petproject.R.layout.activity_vip_card;
                }
                break;
            }
            case 1873129585: {
                if(tag.equals("layout/activity_collect_money_0")) {
                    return ys.app.petproject.R.layout.activity_collect_money;
                }
                break;
            }
            case 1962332296: {
                if(tag.equals("layout/activity_add_employee_0")) {
                    return ys.app.petproject.R.layout.activity_add_employee;
                }
                break;
            }
            case -2068280089: {
                if(tag.equals("layout/activity_forget_pwd_0")) {
                    return ys.app.petproject.R.layout.activity_forget_pwd;
                }
                break;
            }
            case -270986679: {
                if(tag.equals("layout/activity_edit_employee_0")) {
                    return ys.app.petproject.R.layout.activity_edit_employee;
                }
                break;
            }
            case 470265632: {
                if(tag.equals("layout/item_goods_0")) {
                    return ys.app.petproject.R.layout.item_goods;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return ys.app.petproject.R.layout.activity_main;
                }
                break;
            }
            case 1856642321: {
                if(tag.equals("layout/activity_pay_list_0")) {
                    return ys.app.petproject.R.layout.activity_pay_list;
                }
                break;
            }
            case 729099183: {
                if(tag.equals("layout/activity_vip_record_0")) {
                    return ys.app.petproject.R.layout.activity_vip_record;
                }
                break;
            }
            case -1817742865: {
                if(tag.equals("layout/activity_take_out_inventory_0")) {
                    return ys.app.petproject.R.layout.activity_take_out_inventory;
                }
                break;
            }
            case -1705139623: {
                if(tag.equals("layout/fragment_appointment_list_0")) {
                    return ys.app.petproject.R.layout.fragment_appointment_list;
                }
                break;
            }
            case -372539236: {
                if(tag.equals("layout/activity_goods_0")) {
                    return ys.app.petproject.R.layout.activity_goods;
                }
                break;
            }
            case -635338625: {
                if(tag.equals("layout/item_service_0")) {
                    return ys.app.petproject.R.layout.item_service;
                }
                break;
            }
            case -671982382: {
                if(tag.equals("layout/item_settle_order_0")) {
                    return ys.app.petproject.R.layout.item_settle_order;
                }
                break;
            }
            case 690076538: {
                if(tag.equals("layout/fragment_out_put_list_0")) {
                    return ys.app.petproject.R.layout.fragment_out_put_list;
                }
                break;
            }
            case 1096280310: {
                if(tag.equals("layout/item_allot_manage_0")) {
                    return ys.app.petproject.R.layout.item_allot_manage;
                }
                break;
            }
            case 407935981: {
                if(tag.equals("layout/activity_num_card_detail_0")) {
                    return ys.app.petproject.R.layout.activity_num_card_detail;
                }
                break;
            }
            case -197888726: {
                if(tag.equals("layout/item_goods_or_service_statistics_0")) {
                    return ys.app.petproject.R.layout.item_goods_or_service_statistics;
                }
                break;
            }
            case -1071079831: {
                if(tag.equals("layout/item_inventory_records_0")) {
                    return ys.app.petproject.R.layout.item_inventory_records;
                }
                break;
            }
            case -1121739043: {
                if(tag.equals("layout/fragment_goods_0")) {
                    return ys.app.petproject.R.layout.fragment_goods;
                }
                break;
            }
            case 368882597: {
                if(tag.equals("layout/item_service_settings_0")) {
                    return ys.app.petproject.R.layout.item_service_settings;
                }
                break;
            }
            case -1770245577: {
                if(tag.equals("layout/item_search_goods_0")) {
                    return ys.app.petproject.R.layout.item_search_goods;
                }
                break;
            }
            case -1778101475: {
                if(tag.equals("layout/item_employee_shop_car_goods_0")) {
                    return ys.app.petproject.R.layout.item_employee_shop_car_goods;
                }
                break;
            }
            case 1178002171: {
                if(tag.equals("layout/activity_service_0")) {
                    return ys.app.petproject.R.layout.activity_service;
                }
                break;
            }
            case 1462513257: {
                if(tag.equals("layout/item_appointment_0")) {
                    return ys.app.petproject.R.layout.item_appointment;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"barCode"
            ,"cardNo"
            ,"costAmt"
            ,"dataBean"
            ,"discount"
            ,"expand"
            ,"id"
            ,"imgpath"
            ,"info"
            ,"inventoryNum"
            ,"isClick"
            ,"isPromotion"
            ,"itemViewModel"
            ,"mInfo"
            ,"mainViewModel"
            ,"model"
            ,"name"
            ,"nameArray"
            ,"payDate"
            ,"payWay"
            ,"price"
            ,"realAmt"
            ,"rechargeAmt"
            ,"state"
            ,"stockNum"
            ,"tel"
            ,"type"
            ,"typeName"
            ,"unit"
            ,"userId"
            ,"userName"
            ,"viewModel"
            ,"vipType"};
    }
}
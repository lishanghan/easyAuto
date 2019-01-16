package com.haier.testng.test;

import com.haier.anno.SKey;
import com.haier.po.HryTest;
import com.haier.testng.base.Base;
import com.haier.util.HryHttpClientUtil;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.haier.util.AssertUtil.supperAssert;
@SKey("Zhuanle")
public class ZhuanleDefaultTest extends Base{
    @Parameters({"serviceId", "envId", "caseDesigner", "i_c", "i_c_zdy", "testingId"})
    public ZhuanleDefaultTest(Integer serviceId, Integer envId, String caseDesigner, String i_c, String i_c_zdy, String testingId) {
        super(serviceId, envId, caseDesigner, i_c, i_c_zdy, testingId);
    }

    @Test(testName = "/arap/query-by-range", dataProvider = "provider", description = "资金日历查询")
    public void arap_query_by_range(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/config/historic-rate", dataProvider = "provider", description = "获取参考历史年化区间")
    public void auto_bidding_config_historic_rate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/config/list", dataProvider = "provider", description = "自动投标设置")
    public void auto_bidding_config_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/config/save", dataProvider = "provider", description = "保存或修改自动投标设置并开启自动投标")
    public void auto_bidding_config_save(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/earn-list", dataProvider = "provider", description = "赚钱明细")
    public void auto_bidding_earn_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/earn-list-dashboard", dataProvider = "provider", description = "赚钱明细")
    public void auto_bidding_earn_list_dashboard(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/manual", dataProvider = "provider", description = "自动投标指南")
    public void auto_bidding_manual(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/match-dashboard", dataProvider = "provider", description = "自动投标计划的汇总信息-v3.0.6")
    public void auto_bidding_match_dashboard(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/matching-list", dataProvider = "provider", description = "快速匹配明细")
    public void auto_bidding_matching_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/plan-list", dataProvider = "provider", description = "自动投标计划列表-v3.0.6")
    public void auto_bidding_plan_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/plan/matched-bids", dataProvider = "provider", description = "自动投标计划匹配的标的-v3.0.6")
    public void auto_bidding_plan_matched_bids(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/statistics", dataProvider = "provider", description = "智能投标主页")
    public void auto_bidding_statistics(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/update-status", dataProvider = "provider", description = "暂停或恢复自动投标")
    public void auto_bidding_update_status(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/auto-bidding/user-config", dataProvider = "provider", description = "获取自动投标设置")
    public void auto_bidding_user_config(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bank/agreements", dataProvider = "provider", description = "retrieveAgreementByBankCode")
    public void bank_agreements(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bank/get-cardBin", dataProvider = "provider", description = "根据卡号获取卡Bin信息")
    public void bank_get_cardBin(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bank/querySupportBank", dataProvider = "provider", description = "querySupportBank")
    public void bank_querySupportBank(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bank/querySupportBankList", dataProvider = "provider", description = "querySupportBankList")
    public void bank_querySupportBankList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/banner/list-by-position", dataProvider = "provider", description = "listByPosition")
    public void banner_list_by_position(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/banner/queryByCategory", dataProvider = "provider", description = "queryByCategory")
    public void banner_queryByCategory(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/banner/startup-banner", dataProvider = "provider", description = "app启动页广告")
    public void banner_startup_banner(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bid/aggregated-bid-info", dataProvider = "provider", description = "查询标的详情")
    public void bid_aggregated_bid_info(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bid/category-list/v2", dataProvider = "provider", description = "listCompositeBidCategories")
    public void bid_category_list_v2(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bid/list-by-category/v2", dataProvider = "provider", description = "listBidByCategory")
    public void bid_list_by_category_v2(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bid/query-by-rebate", dataProvider = "provider", description = "根据优惠信息搜索支持的标的")
    public void bid_query_by_rebate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bid/top-products", dataProvider = "provider", description = "查询置顶的标的列表")
    public void bid_top_products(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/bindPromotionCode", dataProvider = "provider", description = "绑定推广码")
    public void bindPromotionCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/cash-flow/list", dataProvider = "provider", description = "查询资金流水列表")
    public void cash_flow_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consumer-finance/my-reservations", dataProvider = "provider", description = "queryUserReservationList")
    public void consumer_finance_my_reservations(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consumer-finance/reservation-detail", dataProvider = "provider", description = "我的预约记录详情")
    public void consumer_finance_reservation_detail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consumer-finance/reservation/invest-detail", dataProvider = "provider", description = "查询预约计划的交易详情")
    public void consumer_finance_reservation_invest_detail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consumer-finance/reservation/matched-bid-detail", dataProvider = "provider", description = "查询匹配的标的详情")
    public void consumer_finance_reservation_matched_bid_detail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consumer-finance/reservation/matched-bid-list", dataProvider = "provider", description = "查询匹配的标的列表")
    public void consumer_finance_reservation_matched_bid_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consumer-finance/reservation/plan-detail", dataProvider = "provider", description = "查询预约详情")
    public void consumer_finance_reservation_plan_detail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consumer-finance/reservation/plan-summary", dataProvider = "provider", description = "查询预约申请概要信息")
    public void consumer_finance_reservation_plan_summary(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/consumer-finance/reservation/purchased-products", dataProvider = "provider", description = "queryPurchasedProduct4Reservation")
    public void consumer_finance_reservation_purchased_products(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/coupon/activeCoupon", dataProvider = "provider", description = "activeCoupon")
    public void coupon_activeCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/coupon/getAvailableCouponList", dataProvider = "provider", description = "根据标的搜索可用的优惠信息")
    public void coupon_getAvailableCouponList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/coupon/getCouponAmount", dataProvider = "provider", description = "getCouponAmount")
    public void coupon_getCouponAmount(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/coupon/getCouponList", dataProvider = "provider", description = "根据状态(1：未使用；2：已使用；3：已过期)查询我的理财券")
    public void coupon_getCouponList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/coupon/grabCoupon", dataProvider = "provider", description = "grabCoupon")
    public void coupon_grabCoupon(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/coupon/profit-benchmark", dataProvider = "provider", description = "获取加息券预期收益的基准")
    public void coupon_profit_benchmark(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/coupon/queryCoupon4Grab", dataProvider = "provider", description = "queryCoupon4Grab")
    public void coupon_queryCoupon4Grab(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/customer-service/show-dialog", dataProvider = "provider", description = "阿里客服系统接入入口")
    public void customer_service_show_dialog(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/bid/detail", dataProvider = "provider", description = "债权投资人查看债权详情")
    public void czz_bid_detail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/bid/list", dataProvider = "provider", description = "列表页债转标的查询")
    public void czz_bid_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/bid/orderAnPay", dataProvider = "provider", description = "createOrder")
    public void czz_bid_orderAnPay(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/bid/place-order", dataProvider = "provider", description = "placeOrder")
    public void czz_bid_place_order(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/bid/prebuy", dataProvider = "provider", description = "prebuy")
    public void czz_bid_prebuy(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/bid/queryInvestOrder", dataProvider = "provider", description = "queryInvestOrder")
    public void czz_bid_queryInvestOrder(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/bid/recommend-list", dataProvider = "provider", description = "首页推荐债转标的查询")
    public void czz_bid_recommend_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/cancel", dataProvider = "provider", description = "撤销申请并且同步返回申请结果")
    public void czz_cancel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/publish", dataProvider = "provider", description = "发起债权转让申请并且同步返回申请结果")
    public void czz_publish(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/queryCzzDetail", dataProvider = "provider", description = "查询纯债转转让详细信息")
    public void czz_queryCzzDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/queryCzzRecord", dataProvider = "provider", description = "查询债权转让申请记录")
    public void czz_queryCzzRecord(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/czz/queryPublishInfo", dataProvider = "provider", description = "查询用于发布的信息")
    public void czz_queryPublishInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/auth/prepare", dataProvider = "provider", description = "准备发起开通存管请求")
    public void depository_auth_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/bank-card-change/prepare", dataProvider = "provider", description = "准备发起换绑银行卡请求")
    public void depository_bank_card_change_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/passwd-getback/prepare", dataProvider = "provider", description = "准备发起存管密码找回请求")
    public void depository_passwd_getback_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/passwd-update/prepare", dataProvider = "provider", description = "准备发起存管密码修改请求")
    public void depository_passwd_update_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/passwd-verify/prepare", dataProvider = "provider", description = "准备发起存管密码验证请求")
    public void depository_passwd_verify_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/recharge/prepare", dataProvider = "provider", description = "准备发起存管充值")
    public void depository_recharge_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/reserved-phone-change/prepare", dataProvider = "provider", description = "准备发起更新手机请求")
    public void depository_reserved_phone_change_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/trade-details", dataProvider = "provider", description = "存管交易记录详情查询")
    public void depository_trade_details(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/trade-records", dataProvider = "provider", description = "存管交易记录查询")
    public void depository_trade_records(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/user-active/prepare", dataProvider = "provider", description = "准备发起激活存管请求")
    public void depository_user_active_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/withdraw/conditions", dataProvider = "provider", description = "提现操作前的条件查询")
    public void depository_withdraw_conditions(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/depository/withdraw/prepare", dataProvider = "provider", description = "准备发起存管提现")
    public void depository_withdraw_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/finance/dashboard", dataProvider = "provider", description = "hryDashboard")
    public void finance_dashboard(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/finance/getInvestDetail", dataProvider = "provider", description = "查询交易详情")
    public void finance_getInvestDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/finance/getMybids", dataProvider = "provider", description = "用户投资列表")
    public void finance_getMybids(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/h5/asset/summary", dataProvider = "provider", description = "顺逛资产查询")
    public void h5_asset_summary(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/h5/dep/account-info", dataProvider = "provider", description = "查询H5用户的账户信息")
    public void h5_dep_account_info(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/h5/investment/p2p-records", dataProvider = "provider", description = "queryUserP2PInvestRecords")
    public void h5_investment_p2p_records(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/haier/account/bind", dataProvider = "provider", description = "海尔集团用户绑定")
    public void haier_account_bind(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/haier/sign-in", dataProvider = "provider", description = "海尔集团用户登录")
    public void haier_sign_in(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home-dispatch/hot-bid-list", dataProvider = "provider", description = "热门推荐标的列表查询")
    public void home_dispatch_hot_bid_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home-dispatch/marquee", dataProvider = "provider", description = "走马灯")
    public void home_dispatch_marquee(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home-dispatch/news", dataProvider = "provider", description = "新闻列表")
    public void home_dispatch_news(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home-dispatch/novice-bid-list", dataProvider = "provider", description = "新客专享标的查询")
    public void home_dispatch_novice_bid_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home-dispatch/recommend-bid-list", dataProvider = "provider", description = "查询预约专区和精选投资列表")
    public void home_dispatch_recommend_bid_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home-dispatch/top-area-dashboard", dataProvider = "provider", description = "查询顶部banner和运营活动区信息")
    public void home_dispatch_top_area_dashboard(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home-dispatch/ue-wrappers", dataProvider = "provider", description = "优易智投推荐列表")
    public void home_dispatch_ue_wrappers(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home/dialogs", dataProvider = "provider", description = "newDialogs")
    public void home_dialogs(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home/h5", dataProvider = "provider", description = "h5home")
    public void home_h5(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home/headers", dataProvider = "provider", description = "headers")
    public void home_headers(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home/queryHryStat", dataProvider = "provider", description = "queryHryStat")
    public void home_queryHryStat(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home/queryRecommendBid", dataProvider = "provider", description = "queryRecommendBid")
    public void home_queryRecommendBid(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home/user-asset", dataProvider = "provider", description = "queryMyAsset")
    public void home_user_asset(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/home/v2", dataProvider = "provider", description = "home")
    public void home_v2(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/huijin/bid/detail", dataProvider = "provider", description = "债权投资人查看债权详情")
    public void huijin_bid_detail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investment-record/dashboard", dataProvider = "provider", description = "我的投资主页")
    public void investment_record_dashboard(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investment-record/normal-bid-list", dataProvider = "provider", description = "散标列表查询")
    public void investment_record_normal_bid_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/investment-record/settled-bid-list", dataProvider = "provider", description = "我的出借:结清和撤销的记录查询")
    public void investment_record_settled_bid_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lcj/exchange", dataProvider = "provider", description = "exchange")
    public void lcj_exchange(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lcj/exchange-coupon/list", dataProvider = "provider", description = "queryToBeExchangedCoupons")
    public void lcj_exchange_coupon_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lcj/getLcjBalance", dataProvider = "provider", description = "getLcjBalance")
    public void lcj_getLcjBalance(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/lcj/getLcjDetails", dataProvider = "provider", description = "getLcjDetails")
    public void lcj_getLcjDetails(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/logout", dataProvider = "provider", description = "退出")
    public void logout(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member-grade/definition", dataProvider = "provider", description = "queryMemberGradeDefinition")
    public void member_grade_definition(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member-grade/home", dataProvider = "provider", description = "home")
    public void member_grade_home(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member-grade/privilege", dataProvider = "provider", description = "queryMemberPrivilege")
    public void member_grade_privilege(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member-grade/privilege-detail", dataProvider = "provider", description = "queryMemberGradePrivilegeDetail")
    public void member_grade_privilege_detail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member-grade/query-rewards-message", dataProvider = "provider", description = "queryUserRewardsMessage")
    public void member_grade_query_rewards_message(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member-grade/upgrade-gift", dataProvider = "provider", description = "queryUserRewardsAfterUpgrade")
    public void member_grade_upgrade_gift(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/acct-attrs", dataProvider = "provider", description = "查询用户的账户属性信息")
    public void member_acct_attrs(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/agreeNewUserLicense", dataProvider = "provider", description = "agreeNewUserLicense")
    public void member_agreeNewUserLicense(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/check-account", dataProvider = "provider", description = "checkAccount")
    public void member_check_account(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/checkAccount4FindPassword", dataProvider = "provider", description = "checkAccount4FindPassword")
    public void member_checkAccount4FindPassword(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/dep-elements", dataProvider = "provider", description = "存管开户前查询用户资料")
    public void member_dep_elements(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/dialogs", dataProvider = "provider", description = "dialogs")
    public void member_dialogs(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/homepage/app-list/v3", dataProvider = "provider", description = "我的应用列表")
    public void member_homepage_app_list_v3(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/homepage/asset-allocation", dataProvider = "provider", description = "查询账户资产配置信息")
    public void member_homepage_asset_allocation(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/homepage/brief-account-info", dataProvider = "provider", description = "查询账户简要信息")
    public void member_homepage_brief_account_info(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/homepage/my-assets", dataProvider = "provider", description = "我的总资产")
    public void member_homepage_my_assets(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/queryCurrentUser", dataProvider = "provider", description = "queryCurrentUser")
    public void member_queryCurrentUser(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/queryUserStatusForH5", dataProvider = "provider", description = "queryUserStatusForH5")
    public void member_queryUserStatusForH5(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/risk-assessment/perform", dataProvider = "provider", description = "riskAssessmentPerform")
    public void member_risk_assessment_perform(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/risk-assessment/questions", dataProvider = "provider", description = "queryRiskAssessmentTopics")
    public void member_risk_assessment_questions(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/verify-account", dataProvider = "provider", description = "verifyAccount")
    public void member_verify_account(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/member/verify-idCard", dataProvider = "provider", description = "verifyIdCard")
    public void member_verify_idCard(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/message/queryMessage", dataProvider = "provider", description = "getMessage")
    public void message_queryMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/message/queryMessageReadStatusStat", dataProvider = "provider", description = "getMessageReadStatus")
    public void message_queryMessageReadStatusStat(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/message/queryYellowBarMessage", dataProvider = "provider", description = "queryYellowBarMessage")
    public void message_queryYellowBarMessage(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/message/setAllMessageRead", dataProvider = "provider", description = "setAllMessageRead")
    public void message_setAllMessageRead(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/message/setMessageRead", dataProvider = "provider", description = "setMessageRead")
    public void message_setMessageRead(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/mng/iosIsVerify", dataProvider = "provider", description = "iosIsVerify")
    public void mng_iosIsVerify(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/mng/queryMaintence", dataProvider = "provider", description = "systemMaintence")
    public void mng_queryMaintence(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/newGuestGift", dataProvider = "provider", description = "查询新手大礼包")
    public void newGuestGift(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/operation/query-scratch", dataProvider = "provider", description = "queryScratchAfterInvest")
    public void operation_query_scratch(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/operation/recommendActivity", dataProvider = "provider", description = "queryRecommendActivity")
    public void operation_recommendActivity(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/operation/recommendProfit", dataProvider = "provider", description = "queryRecommendProfit")
    public void operation_recommendProfit(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/operation/scratch-ticket", dataProvider = "provider", description = "scratchTicket")
    public void operation_scratch_ticket(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/operation/scratch/perform", dataProvider = "provider", description = "scratchTicketAdaptor")
    public void operation_scratch_perform(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/operation/scratch/query", dataProvider = "provider", description = "scratchQueryAdaptor")
    public void operation_scratch_query(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oss/getDiscoveryDetail", dataProvider = "provider", description = "getDiscoveryDetail")
    public void oss_getDiscoveryDetail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/oss/getMiscContentList", dataProvider = "provider", description = "getMiscContentList")
    public void oss_getMiscContentList(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/password/set-password", dataProvider = "provider", description = "setPassword")
    public void password_set_password(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/password/update-password", dataProvider = "provider", description = "updatePassword")
    public void password_update_password(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/popup/home-page/adv", dataProvider = "provider", description = "首页广告弹窗")
    public void popup_home_page_adv(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/popup/view-resource", dataProvider = "provider", description = "预览登记")
    public void popup_view_resource(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotion/query-promoter", dataProvider = "provider", description = "queryPromoter")
    public void promotion_query_promoter(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotion/queryShareInfo", dataProvider = "provider", description = "promoteUri")
    public void promotion_queryShareInfo(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/promotion/uri", dataProvider = "provider", description = "promoteUri")
    public void promotion_uri(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/queryLatestCategoryUpdate", dataProvider = "provider", description = "queryLatestCategoryUpdate")
    public void queryLatestCategoryUpdate(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/share/bid-detail-share", dataProvider = "provider", description = "标的详情分享")
    public void share_bid_detail_share(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/sign-in", dataProvider = "provider", description = "用户登录")
    public void sign_in(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/sms/checkVerifyCode", dataProvider = "provider", description = "checkVerifyCode")
    public void sms_checkVerifyCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/sms/sendEmailVerifyCode", dataProvider = "provider", description = "sendEmailVerifyCode")
    public void sms_sendEmailVerifyCode(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/sms/sendSMS", dataProvider = "provider", description = "sendSMS")
    public void sms_sendSMS(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tender/p2p/order-result", dataProvider = "provider", description = "查看p2p标的投资下单结果")
    public void tender_p2p_order_result(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/tender/p2p/place-order", dataProvider = "provider", description = "存管p2p标的投资下单")
    public void tender_p2p_place_order(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ue/authorize/cancel", dataProvider = "provider", description = "优易智投授权撤销")
    public void ue_authorize_cancel(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ue/authorize/perform", dataProvider = "provider", description = "优易智投授权申请")
    public void ue_authorize_perform(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ue/authorize/prepare", dataProvider = "provider", description = "准备发起授权申请")
    public void ue_authorize_prepare(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ue/details", dataProvider = "provider", description = "优易智投详情查询")
    public void ue_details(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ue/invest-details", dataProvider = "provider", description = "优易智投投资详情")
    public void ue_invest_details(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ue/matched-bid-detail", dataProvider = "provider", description = "查询匹配的标的详情")
    public void ue_matched_bid_detail(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ue/matched-bid-list", dataProvider = "provider", description = "查询匹配的标的列表")
    public void ue_matched_bid_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/ue/wrapper-list", dataProvider = "provider", description = "优易智投列表查询")
    public void ue_wrapper_list(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/v2/register", dataProvider = "provider", description = "注册并且设置登陆密码")
    public void v2_register(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/version/backgroudCheck", dataProvider = "provider", description = "checkAppVersion")
    public void version_backgroudCheck(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/version/check", dataProvider = "provider", description = "checkAppVersion")
    public void version_check(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/virtual/hat_trick", dataProvider = "provider", description = "虚拟接口（三）")
    public void virtual_hat_trick(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/virtual/Rakhim", dataProvider = "provider", description = "虚拟接口（二）")
    public void virtual_Rakhim(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

    @Test(testName = "/virtual/sql", dataProvider = "provider", description = "虚拟接口")
    public void virtual_sql(HryTest test) {
        String actual = HryHttpClientUtil.send(test, this);
        supperAssert(actual, test);
    }

}

package com.slf.wx.pay.constant;

/**
*	Description:调用微信统一下单接口回调可能会出现的错误信息
*	Company:苏州咕噜信息科技有限公司
*	@author dpc
*	@date   2016年7月13日
*
 * 	NOAUTH	商户无此接口权限	商户未开通此接口权限	请商户前往申请此接口权限
	NOTENOUGH	余额不足	用户帐号余额不足	用户帐号余额不足，请用户充值或更换支付卡后再支付
	ORDERPAID	商户订单已支付	商户订单已支付，无需重复操作	商户订单已支付，无需更多操作
	ORDERCLOSED	订单已关闭	当前订单已关闭，无法支付	当前订单已关闭，请重新下单
	SYSTEMERROR	系统错误	系统超时	系统异常，请用相同参数重新调用
	APPID_NOT_EXIST	APPID不存在	参数中缺少APPID	请检查APPID是否正确
	MCHID_NOT_EXIST	MCHID不存在	参数中缺少MCHID	请检查MCHID是否正确
	APPID_MCHID_NOT_MATCH	appid和mch_id不匹配	appid和mch_id不匹配	请确认appid和mch_id是否匹配
	LACK_PARAMS	缺少参数	缺少必要的请求参数	请检查参数是否齐全
	OUT_TRADE_NO_USED	商户订单号重复	同一笔交易不能多次提交	请核实商户订单号是否重复提交
	SIGNERROR	签名错误	参数签名结果不正确	请检查签名参数和方法是否都符合签名算法要求
	XML_FORMAT_ERROR	XML格式错误	XML格式错误	请检查XML参数格式是否正确
	REQUIRE_POST_METHOD	请使用post方法	未使用post传递参数 	请检查请求参数是否通过post方法提交
	POST_DATA_EMPTY	post数据为空	post数据不能为空	请检查post数据是否为空
	NOT_UTF8	编码格式错误	未使用指定编码格式	请使用NOT_UTF8编码格式
 */
public class WxPayError {
	public static final String NOAUTH="NOAUTH";
	public static final String NOTENOUGH="NOTENOUGH";
	public static final String ORDERPAID="ORDERPAID";
	public static final String ORDERCLOSED="ORDERCLOSED";
	public static final String SYSTEMERROR="SYSTEMERROR";
	public static final String APPID_NOT_EXIST="APPID_NOT_EXIST";
	public static final String MCHID_NOT_EXIST="MCHID_NOT_EXIST";
	public static final String APPID_MCHID_NOT_MATCH="APPID_MCHID_NOT_MATCH";
	public static final String LACK_PARAMS="LACK_PARAMS";
	public static final String OUT_TRADE_NO_USED="OUT_TRADE_NO_USED";
	public static final String SIGNERROR="SIGNERROR";
	public static final String XML_FORMAT_ERROR="XML_FORMAT_ERROR";
	public static final String REQUIRE_POST_METHOD="REQUIRE_POST_METHOD";
	public static final String POST_DATA_EMPTY="POST_DATA_EMPTY";
	public static final String NOT_UTF8="NOT_UTF8";
	
}

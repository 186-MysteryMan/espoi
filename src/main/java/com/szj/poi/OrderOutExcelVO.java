package com.szj.poi;

//import cn.afterturn.easypoi.excel.annotation.Excel;
//import cn.afterturn.easypoi.excel.annotation.ExcelTarget;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author shenggongjie
 * @date 2020/12/23 17:22
 */
@Data
@ExcelTarget("orderOutExcelVO")
public class OrderOutExcelVO implements java.io.Serializable{
    private static final long serialVersionUID=1L;
    @Excel(name = "订单号", height = 10, width = 20, isImportField = "true_st",mergeVertical = true)
    private String orderCode;

    @Excel(name = "商品名", width = 20, isImportField = "true_st")
    private String goodsName;

    @Excel(name = "商品编号", width = 20, isImportField = "true_st")
    private String goodsCode;

    @Excel(name = "下单时间", format = "yyyy-MM-dd HH:mm:ss", isImportField = "true_st", width = 20)
    private Date createTime;

    @Excel(name = "售后状态", width = 20, isImportField = "true_st")
    private String afterSaleStatus;

    @Excel(name = "订单状态", width = 20, isImportField = "true_st")
    private String orderStatus;

    @Excel(name = "用户openid", width = 20, isImportField = "true_st")
    private String openId;

    @Excel(name = "收件人姓名", width = 20, isImportField = "true_st")
    private String receiverName;

    @Excel(name = "收件人地址", width = 20, isImportField = "true_st")
    private String receiveAddress;

    @Excel(name = "收件人手机", width = 20, isImportField = "true_st")
    private String receiverPhone;

    @Excel(name = "买家备注", width = 20, isImportField = "true_st")
    private String memberRemark;

    @Excel(name = "商户备注", width = 20, isImportField = "true_st")
    private String dealerRemark;

    @Excel(name = "企业备注", width = 20, isImportField = "true_st")
    private String enterpriseRemark;

    @Excel(name = "配送方式", width = 20, isImportField = "true_st")
    private String deliveryType;

    @Excel(name = "客户收货方式", width = 20, isImportField = "true_st")
    private String receiveType;

    @Excel(name = "商户名称", width = 20, isImportField = "true_st")
    private String dealerName;

    @Excel(name = "商户组别", width = 20, isImportField = "true_st")
    private String dealerGroupName;

    @Excel(name = "商户区域", width = 20, isImportField = "true_st")
    private String dealerArea;

    @Excel(name = "渠道", width = 20, isImportField = "true_st")
    private String channelName;

    @Excel(name = "自取时间", width = 20, isImportField = "true_st", format = "yyyy-MM-dd HH:mm:ss")
    private Date receiveTime;

    @Excel(name = "物流公司", width = 20, isImportField = "true_st")
    private String expressCompanyName;

    @Excel(name = "快递单号", width = 20, isImportField = "true_st")
    private String expressCode;

    @Excel(name = "商品价格(单价)", width = 20, isImportField = "true_st",type = 10)
    private BigDecimal price;

    @Excel(name = "商品数量", width = 20, isImportField = "true_st",type = 10)
    private Integer quantity;

    @Excel(name = "支付单号", width = 20, isImportField = "true_st")
    private String thdTradeId;

    @Excel(name = "实际支付金额", width = 20, isImportField = "true_st",type = 10)
    private BigDecimal totalAmount;
}

package com.mingming.homework.elmproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@TableName(value ="business")
@Data
public class Business implements Serializable {
    /**
     * 商家编号
     */
    @TableId("businessId")
    private Object businessId;

    /**
     * 商家名称
     */
    @TableField("businessName")
    private String businessName;

    /**
     * 商家地址
     */
    @TableField("businessAddress")
    private String businessAddress;

    /**
     * 商家介绍
     */
    @TableField("businessExplain")
    private String businessExplain;

    /**
     * 商家图片（base64）
     */
    @TableField("businessImg")
    private String businessImg;

    /**
     * 点餐分类
     */
    @TableField("orderTypeId")
    private Integer orderTypeId;

    /**
     * 起送费
     */
    @TableField("starPrice")
    private BigDecimal starPrice;

    /**
     * 配送费
     */
    @TableField("deliveryPrice")
    private BigDecimal deliveryPrice;

    /**
     * 备注
     */
    @TableField("remarks")
    private String remarks;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
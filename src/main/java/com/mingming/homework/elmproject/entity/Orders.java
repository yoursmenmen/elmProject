package com.mingming.homework.elmproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Orders implements Serializable {
    @TableId("orderId")
    private Integer orderId;

    @TableField("userId")
    private String userId;

    @TableField("businessId")
    private Integer businessId;

    @TableField("orderDate")
    private String orderDate;

    @TableField("orderTotal")
    private BigDecimal orderTotal;

    @TableField("daId")
    private Integer daId;

    @TableField("orderState")
    private Integer orderState;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;



}
package com.mingming.homework.elmproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName cart
 */
@TableName(value = "cart")
@Data
public class Cart implements Serializable {
    @TableId("cartId")
    private Integer cartId;

    @TableField("foodId")
    @JsonIgnore
    private Integer foodId;

    @TableField(exist = false)
    private Food food;

    @TableField("businessId")
    private Integer businessId;

    @TableField("userId")
    private String userId;

    @TableField("quantity")
    private Integer quantity;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Cart(Integer foodId, Integer businessId, String userId) {
        this.foodId = foodId;
        this.businessId = businessId;
        this.userId = userId;
        this.quantity = 1;
    }
}
package com.mingming.homework.elmproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "orderdetailet")
@Data
public class OrderDetailet {

    @TableId("odId")
    private int odId;
    @TableField("orderId")
    private int orderId;
    @TableField("foodId")
    private int foodId;
    @TableField("quantity")
    private int quantity;


}

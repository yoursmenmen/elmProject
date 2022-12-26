package com.mingming.homework.elmproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @TableName food
 */
@TableName(value ="food")
@Data
public class Food implements Serializable {
    @TableId("foodId")
    private Integer foodId;

    @TableField("foodName")
    private String foodName;

    @TableField("foodExplain")
    private String foodExplain;

    @TableField("foodImg")
    private String foodImg;

    @TableField("foodPrice")
    private BigDecimal foodPrice;

    @TableField("businessId")
    private Integer businessId;

    @TableField("remarks")
    private String remarks;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
package com.mingming.homework.elmproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName(value ="deliveryaddress")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeliveryAddress implements Serializable {
    @TableId("daId")
    private Integer daId;

    @TableField("contactName")
    private String contactName;

    @TableField("contactSex")
    private Integer contactSex;

    @TableField("contactTel")
    private String contactTel;

    @TableField("address")
    private String address;

    @TableField("userId")
    private String userId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
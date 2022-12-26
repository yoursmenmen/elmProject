package com.mingming.homework.elmproject.entity;

import java.math.BigDecimal;
import java.util.List;

public class Orderss {


    private Integer orderId;


    private String userId;


    private Integer businessId;


    private String orderDate;


    private BigDecimal orderTotal;


    private Integer daId;

    private Integer orderState;

    @Override
    public String toString() {
        return "Orderss{" +
                "orderId=" + orderId +
                ", userId='" + userId + '\'' +
                ", businessId=" + businessId +
                ", orderDate='" + orderDate + '\'' +
                ", orderTotal=" + orderTotal +
                ", daId=" + daId +
                ", orderState=" + orderState +
                ", business=" + business +
                ", list=" + list +
                '}';
    }

    private Business business;
    //一对多
    private List<OrderDetailets> list;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public Integer getDaId() {
        return daId;
    }

    public void setDaId(Integer daId) {
        this.daId = daId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public List<OrderDetailets> getList() {
        return list;
    }

    public void setList(List<OrderDetailets> list) {
        this.list = list;
    }
}

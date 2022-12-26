package com.mingming.homework.elmproject.entity;

public class OrderDetailets {

    private int odId;

    private int orderId;

    private int foodId;

    private int quantity;

    private Food food;

    @Override
    public String toString() {
        return "OrderDetailets{" +
                "odId=" + odId +
                ", orderId=" + orderId +
                ", foodId=" + foodId +
                ", quantity=" + quantity +
                ", food=" + food +
                '}';
    }

    public int getOdId() {
        return odId;
    }

    public void setOdId(int odId) {
        this.odId = odId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}

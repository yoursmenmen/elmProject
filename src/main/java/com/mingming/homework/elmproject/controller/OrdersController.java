package com.mingming.homework.elmproject.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mingming.homework.elmproject.entity.*;
import com.mingming.homework.elmproject.service.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/elm/OrdersController")
public class OrdersController {
    @Resource
    private OrdersService ordersService;

    @Resource
    private BusinessService businessService;

    @Resource
    private CartService cartService;
    @Resource
    private FoodService foodService;
    @Resource
    private OrderDetailetService orderDetailetService;

    @PostMapping("/createOrders")
    public int createOrders(Orders orders) {
        // 创建订单
        orders.setOrderDate(String.valueOf(new Date()));
        boolean save = ordersService.save(orders);
        // 获取订单详情
        QueryWrapper<Cart> queryWrapper = new QueryWrapper<>();
//        System.out.println(orders.getUserId());
//        System.out.println(orders.getBusinessId());
        queryWrapper.eq("userId", orders.getUserId());
        queryWrapper.eq("businessId", orders.getBusinessId());
         List<Cart> list = cartService.list(queryWrapper);
        list.forEach(cart -> {
            QueryWrapper<Food> foodQueryWrapper = new QueryWrapper<>();
            foodQueryWrapper.eq("foodId", cart.getFoodId());
            Food food = foodService.getOne(foodQueryWrapper);
            cart.setFood(food);
        });
        // 创建详情订单

        for (Cart cart : list) {
            OrderDetailet orderDetailet = new OrderDetailet();
            orderDetailet.setFoodId(cart.getFoodId());
            orderDetailet.setQuantity(cart.getQuantity());
            orderDetailet.setOrderId(orders.getOrderId());
//            System.out.println(orderDetailet);
            orderDetailetService.save(orderDetailet);
        }
        cartService.remove(null);

        return save ? orders.getOrderId() : 0;
    }

    @PostMapping("/listOrdersByUserId")
    public List<Orderss> listOrdersByUserId(String userId) {
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId", userId);
//        System.out.println(ordersService.list(queryWrapper));
        List<Orders> list = ordersService.list(queryWrapper);
        List<Orderss> lists = new ArrayList<>();
        for (Orders orders : list) {
            Orderss orderss = new Orderss();
            orderss.setOrderState(orders.getOrderState());
            orderss.setOrderDate(orders.getOrderDate());
            orderss.setUserId(orders.getUserId());
            orderss.setOrderTotal(orders.getOrderTotal());
            orderss.setDaId(orders.getDaId());
            orderss.setBusinessId(orders.getBusinessId());
            orderss.setOrderId(orders.getOrderId());

            // detailets对象
            QueryWrapper<OrderDetailet> queryWrapper2 = new QueryWrapper<>();
            queryWrapper.eq("orderId",orders.getOrderId());
            List<OrderDetailet> listt = orderDetailetService.list(queryWrapper2);
            List<OrderDetailets> sList = new ArrayList<>();
            for (OrderDetailet detailet : listt) {
                OrderDetailets detailets = new OrderDetailets();
                detailets.setOdId(detailet.getOdId());
                detailets.setFood(foodService.getById(detailet.getFoodId()));
                detailets.setFoodId(detailet.getFoodId());
                detailets.setOrderId(detailet.getOrderId());
                detailets.setQuantity(detailet.getQuantity());
                sList.add(detailets);
            }
            orderss.setList(sList);

            //business
            orderss.setBusiness(businessService.getById(orders.getBusinessId()));
            lists.add(orderss);
        }
        return lists;
    }

    @PostMapping("/getOrdersById")
    public Orderss getOrdersById(long orderId) {
        // 不单单是一个集合
        // System.out.println(orderId);
        // System.out.println(ordersService.getById(orderId));
//
//        List<String> list = new ArrayList<>();
//        Class<ArrayList<String>> aClass = (Class<ArrayList<String>>) list.getClass();
//        Method method = aClass.getMethod("add", Business.class);
//        method.invoke(businessService.getById())
        Orders orders = ordersService.getById(orderId);
        Orderss orderss = new Orderss();
        orderss.setOrderId((int) orderId);
        orderss.setUserId(orders.getUserId());
        orderss.setBusinessId(orders.getBusinessId());
        orderss.setOrderDate(orders.getOrderDate());
        orderss.setOrderState(orders.getOrderState());
        orderss.setOrderTotal(orders.getOrderTotal());
        orderss.setDaId(orders.getDaId());
        orderss.setBusiness(businessService.getById(orders.getBusinessId()));
        // 基础属性加business
        QueryWrapper<OrderDetailet> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("orderId", orderId);

        // detailets对象
        List<OrderDetailet> list = orderDetailetService.list(queryWrapper);
        List<OrderDetailets> sList = new ArrayList<>();
        for (OrderDetailet detailet : list) {
            OrderDetailets detailets = new OrderDetailets();
            detailets.setOdId(detailet.getOdId());
            detailets.setFood(foodService.getById(detailet.getFoodId()));
            detailets.setFoodId(detailet.getFoodId());
            detailets.setOrderId(detailet.getOrderId());
            detailets.setQuantity(detailet.getQuantity());
            sList.add(detailets);
        }
        orderss.setList(sList);
        System.out.println(businessService.getById(orders.getBusinessId()));
        System.out.println(orderDetailetService.list());
        return orderss;
    }
}

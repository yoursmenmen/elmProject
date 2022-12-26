package com.mingming.homework.elmproject.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mingming.homework.elmproject.entity.Cart;
import com.mingming.homework.elmproject.entity.Food;
import com.mingming.homework.elmproject.service.CartService;
import com.mingming.homework.elmproject.service.FoodService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/elm/CartController")
public class CartController {
    @Resource
    private CartService cartService;
    @Resource
    private FoodService foodService;

    @PostMapping("/listCart")
    public List<Cart> getCart(String userId) {
        QueryWrapper<Cart> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("userId", userId);
        List<Cart> list = cartService.list(queryWrapper);
        list.forEach(cart -> {
            QueryWrapper<Food> foodQueryWrapper = new QueryWrapper<>();
            foodQueryWrapper.eq("foodId", cart.getFoodId());
            Food food = foodService.getOne(foodQueryWrapper);
            cart.setFood(food);
        });
        return list;
    }

    @PostMapping("/saveCart")
    public int saveCart(Cart cart) {
        boolean save = cartService.save(cart);
        return save ? 1 : 0;
    }

    @PostMapping("/updateCart")
    public int updateCart(Cart cart) {
        boolean save = cartService.saveOrUpdate(cart);
        return save ? 1 : 0;
    }

    @PostMapping("/removeCart")
    public int removeCart(Cart cart) {
        QueryWrapper<Cart> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("businessId", cart.getBusinessId())
                    .eq("userId", cart.getUserId())
                    .eq("foodId", cart.getFoodId());
        boolean remove = cartService.remove(queryWrapper);
        return remove ? 1 : 0;
    }

    @PostMapping("/getBusinessById")
    public List<Food> getFoodsByBusinessId(Integer businessId) {
        QueryWrapper<Food> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("businessId", businessId);
        return foodService.list(queryWrapper);
    }
}

package com.mingming.homework.elmproject.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mingming.homework.elmproject.entity.Food;
import com.mingming.homework.elmproject.service.FoodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author mingming
 */
@RestController
@RequestMapping("/elm/FoodController")
public class FoodController {

    @Resource
    private FoodService foodService;

    @RequestMapping("/listFoodByBusinessId")
    public List<Food> listFoodByBusinessId(String businessId){

        QueryWrapper<Food> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("businessId", businessId);
        return foodService.list(queryWrapper);
    }
}

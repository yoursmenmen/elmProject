package com.mingming.homework.elmproject.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mingming.homework.elmproject.entity.Business;
import com.mingming.homework.elmproject.service.BusinessService;
import com.mingming.homework.elmproject.service.FoodService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/elm/BusinessController")
public class BusinessController {
    @Resource
    private BusinessService businessService;
    @Resource
    private FoodService foodService;

    @PostMapping("/listBusinessByOrderTypeId")
    public List<Business> getBusiness(int orderTypeId) {
        QueryWrapper<Business> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("orderTypeId", orderTypeId);
        return businessService.list(queryWrapper);
    }
    @PostMapping("/getBusinessById")
    public Business getBusinessById(Integer businessId){

        return businessService.getById(businessId);
    }
}

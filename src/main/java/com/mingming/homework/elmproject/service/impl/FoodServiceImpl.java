package com.mingming.homework.elmproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mingming.homework.elmproject.entity.Food;
import com.mingming.homework.elmproject.mapper.FoodMapper;
import com.mingming.homework.elmproject.service.FoodService;
import org.springframework.stereotype.Service;

@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food>
    implements FoodService{

}





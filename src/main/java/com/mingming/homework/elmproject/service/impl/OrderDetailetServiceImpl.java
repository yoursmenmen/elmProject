package com.mingming.homework.elmproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mingming.homework.elmproject.entity.OrderDetailet;
import com.mingming.homework.elmproject.mapper.OrderDetailetMapper;
import com.mingming.homework.elmproject.service.OrderDetailetService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailetServiceImpl extends ServiceImpl<OrderDetailetMapper, OrderDetailet> implements OrderDetailetService {
}

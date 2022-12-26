package com.mingming.homework.elmproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mingming.homework.elmproject.entity.Orders;
import com.mingming.homework.elmproject.mapper.OrdersMapper;
import com.mingming.homework.elmproject.service.OrdersService;
import org.springframework.stereotype.Service;

/**
* @author mingming
* @description 针对表【orders】的数据库操作Service实现
* @createDate 2022-12-08 13:43:39
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService{

}





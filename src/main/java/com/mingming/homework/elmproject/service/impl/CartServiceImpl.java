package com.mingming.homework.elmproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mingming.homework.elmproject.entity.Cart;
import com.mingming.homework.elmproject.mapper.CartMapper;
import com.mingming.homework.elmproject.service.CartService;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart>
    implements CartService{

}





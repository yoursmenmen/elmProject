package com.mingming.homework.elmproject.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mingming.homework.elmproject.entity.User;
import com.mingming.homework.elmproject.mapper.UserMapper;
import com.mingming.homework.elmproject.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}





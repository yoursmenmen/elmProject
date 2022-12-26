package com.mingming.homework.elmproject.controller;

import com.mingming.homework.elmproject.entity.User;
import com.mingming.homework.elmproject.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author mingming
 */
@RestController
@RequestMapping("/elm/UserController")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/getUserByIdByPass")
    public User login(User user) {
        User user1 = userService.getById(user.getUserId());
        System.out.println(user1);
        if(user1 != null){
            if (user1.getPassword().equals(user.getPassword())) {
                return user1;
            }
        }
        return null;

    }

    @PostMapping("/saveUser")
    public int register(User user) {
        boolean save = userService.save(user);
        return save ? 1 : 0;
    }

    @PostMapping("/getUserById")
    public int isExists(String userId) {
        User user = userService.getById(userId);
        return user == null ? 0 : 1;
    }
}

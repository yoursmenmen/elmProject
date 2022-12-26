package com.mingming.homework.elmproject.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mingming.homework.elmproject.entity.User;
import com.mingming.homework.elmproject.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserService userService;

    @Test
    public void test() {
/*        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userName", "666");
        map.put("userSex", "1");
        int res = userMapper.deleteByMap(map);
        System.out.println(res);*/

        User user = new User();
        user.setUserId("1231231231");
        user.setUserName("333");
        user.setPassword("1234");
        user.setUserSex(2);
        userMapper.updateById(user); // 自动根据传入对象的id进行修改

    }
    @Test
    public void test2() {
        QueryWrapper<User> queryWrapper= new QueryWrapper<User>();
        queryWrapper.eq("userName", "mingming");
        List<User> users = userMapper.selectList(queryWrapper);
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testSelect(){
        /*User user = userMapper.selectById("12345672222");
        System.out.println(user);*/
//        User user2 = new User();
//        user2.setUserName("lxh");
//        user2.setPassword("123");
//        user2.setUserSex(2);
//        userMapper.insert(user2);
//        userService.save(user2);

//        HashMap<String, Object> map = new HashMap<>();
//        map.put("userName", "lxh");
//        userService.removeByMap(map);

        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
//        Map<String, Object> map = userMapper.selectAsMap(12345672222L);
//        System.out.println(map.get("userName"));
    }
    @Test
    public void testService(){
//        System.out.println(userService.count());
        Date date = new Date();
        System.out.println(String.valueOf(date).length());

    }
}
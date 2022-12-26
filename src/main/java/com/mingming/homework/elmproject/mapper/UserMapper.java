package com.mingming.homework.elmproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mingming.homework.elmproject.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper extends BaseMapper<User> {

    Map<String, Object> selectAsMap(@Param("id") long id);

}





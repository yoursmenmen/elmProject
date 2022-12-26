package com.mingming.homework.elmproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户
 *
 * @author h
 * @date 2022/12/10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
     * TableXX : 进行数据库的手动映射
     * TableId :
     * */
    @TableId("userId")
    private String userId;
    @TableField("password")
    private String password;
    @TableField("userName")
    private String userName;
    @TableField("userSex")
    private Integer userSex;
    @TableField("userImg")
    private String userImg;
    @TableField("delTag")
    private Integer delTag;
}

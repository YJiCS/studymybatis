package com.mapper;

import com.pojo.Users;

import java.util.List;

/**
 * 使用接口绑定
 */
public interface UserMapper {
    List<Users> selAll();
}

package com.changpu.spirit.mapper;

import com.changpu.spirit.entity.User;

/**
 * Created by maxing on 2016/4/6.
 */
public interface UserMapper {
    User selectByUsername(String username);
}

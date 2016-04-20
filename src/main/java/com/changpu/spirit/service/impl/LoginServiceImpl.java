package com.changpu.spirit.service.impl;

import com.changpu.spirit.mapper.UserMapper;
import com.changpu.spirit.entity.User;
import com.changpu.spirit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by maxing on 2016/4/7.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private UserMapper usermapper;

        /**
     * 验证用户名密码是否正确
     * @param username
     * @param password
     * @return
     */
    public boolean checkLoginUserPassword(String username, String password) {
        User loginUser = usermapper.selectByUsername(username);
        if(loginUser ==null)
            return false;
        return loginUser.getPassword().equals(password)?true:false;
    }
}

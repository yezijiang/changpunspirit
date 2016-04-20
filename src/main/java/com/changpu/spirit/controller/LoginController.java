package com.changpu.spirit.controller;

import com.changpu.spirit.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by maxing on 2016/3/15.
 */
@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model){
        String username = request.getParameter("username").toString();
        String password = request.getParameter("password").toString();
        loginService.checkLoginUserPassword(username,password);
        int i=0;
        while(i<100000){
            logger.info("登录成功");
            logger.debug("登录成功");
            i++;
        }
        return "welcome";
    }


}

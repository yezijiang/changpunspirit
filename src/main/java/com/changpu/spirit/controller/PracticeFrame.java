package com.changpu.spirit.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by maxing on 2016/3/9.
 */
@Controller
@ControllerAdvice
public class PracticeFrame {
//
//    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
//    public String login(){
//        return "index";
//    }
//
//    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
//    public String login(HttpServletRequest request, Model model){
//        System.out.println("用户名："+request.getParameter("username").toString());
//        System.out.println("密码："+request.getParameter("password").toString());
//
//        return "welcome";
//    }
//    @RequestMapping(value = "/validateLoginMessage",method = RequestMethod.GET)
//    public @ResponseBody String  validateLoginMessage(HttpServletRequest request,Model model){
//        return "1";
//    }
//
//    @RequestMapping(value = "/validateCustomerMessage",method = RequestMethod.POST)
//    public @ResponseBody Map<String,Object> validateCustomerMessage(String username,String password){
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("flag",1);
//        map.put("userName",username);
//        return map;
//    }



}

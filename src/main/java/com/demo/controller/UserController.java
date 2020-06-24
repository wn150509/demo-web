package com.demo.controller;

import com.demo.entity.User;
import com.demo.entity.UserLogin;
import com.demo.service.UserService;
import com.demo.util.ResponseUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
@RequestMapping(value = "user")
@CrossOrigin
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    ResponseUtil register(@RequestBody User user){
        return userService.UserRegister(user);
    }

    @RequestMapping(value = "/login")
    public ResponseUtil doPost(HttpServletRequest request)
            throws ServletException, IOException {
        UserLogin userLogin=new UserLogin(request.getParameter("phone")
                ,request.getParameter("password"),getIpAddr(request));
        return userService.UserLogin(userLogin);
    }

    @RequestMapping(value = "/loginLog",method = RequestMethod.POST)
    ResponseUtil loginLog(@RequestBody User user){
        return userService.LoginLog(user.getUserId());
    }

    /**
     * 获取登录用户的IP地址
     *
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if ("0:0:0:0:0:0:0:1".equals(ip)) {
            ip = "127.0.0.1";
        }
        if (ip.split(",").length > 1) {
            ip = ip.split(",")[0];
        }
        return ip;
    }
}

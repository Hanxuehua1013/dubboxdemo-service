package com.itheima.dubboxdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.dubboxdemo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Reference
	private UserService userService; // 远程注入用户服务

	/**
	 * 
	 * @Title: getName
	 * @Description: TODO
	 * @return String
	 */
	@RequestMapping("/getName.do")
	@ResponseBody
	public String getName() {
		return userService.getName();
	}
}

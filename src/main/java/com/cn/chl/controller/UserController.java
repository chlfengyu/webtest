/*
 *  Copyright 2012, Tera-soft Co., Ltd.  All right reserved.
 *
 *  THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF TERA-SOFT CO.,
 *  LTD.  THE CONTENTS OF THIS FILE MAY NOT BE DISCLOSED TO THIRD
 *  PARTIES, COPIED OR DUPLICATED IN ANY FORM, IN WHOLE OR IN PART,
 *  WITHOUT THE PRIOR WRITTEN PERMISSION OF TERA-SOFT CO., LTD
 *
 */
package com.cn.chl.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.chl.bean.User;
import com.cn.chl.service.UserService;

/**
 * @author Tera
 * 
 */
@Controller
@RequestMapping(value = "/sys/user/")
public class UserController {
	@Autowired(required = true)
	private UserService userService;
	/**
	 * 日志
	 */
	@SuppressWarnings("unused")
	private static Log log = LogFactory.getLog(UserController.class);

	@RequestMapping("login")
	public String login(HttpServletRequest request, ModelMap map) {
		User user = userService.getUser("admin");
		System.out.println(user.getName());
		System.out.println(user.getName());
		System.out.println("登陆成功！");
		return "success";
	}

}

package com.cn.chl.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.chl.bean.User;
import com.cn.chl.dao.UserDao;

@Service("userService")
public class UserService {
	@Autowired
	private UserDao userDao;

	public User getUser(String loginId) {
		return userDao.getUser(loginId);
	}

	public List<User> getUserPageList(Map<String, Object> map) {
		return null;
		// return this.userDao.getUser(map);
	}
}

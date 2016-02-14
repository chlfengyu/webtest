package com.cn.chl.dao;

import com.cn.chl.bean.User;

/**
 * 
 * @author Administrator
 * 
 */
public interface UserDao {
	/**
	 * 通过用户ID获取用户
	 * 
	 * @param loginId
	 *            loginId
	 * @return User
	 */
	User getUser(String loginId);
}

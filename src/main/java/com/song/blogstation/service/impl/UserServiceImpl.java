package com.song.blogstation.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.song.blogstation.beans.UserBean;
import com.song.blogstation.mapper.UserMapper;
import com.song.blogstation.service.UserService;

/**
 * <p>
 * Title: blogstation_[子系统名称]_[UserServiceImpl]
 * </p>
 * <p>
 * Description: [UserServiceImpl]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月17日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper um;

	@Override
	public Map<String, Object> insertUserTradition(UserBean user) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.insertUserTradition(user) > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用传统方式添加用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式添加用户失败");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> insertUserUserAnnotation(UserBean user) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.insertUserUserAnnotation(user) > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用注解方式添加用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式添加用户失败");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> updateUserTradition(UserBean user, Integer id) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.updateUserTradition(user, id) > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用传统方式修改用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式修改用户失败");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> updateUserAnnotation(UserBean user, Integer id) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.updateUserAnnotation(user, id) > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用注解方式修改用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式修改用户失败");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> deleteUserTradition(Integer id) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.deleteUserTradition(id) > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用传统方式删除用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式删除用户失败");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> deleteUserAnnotation(Integer id) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.deleteUserAnnotation(id) > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用注解方式删除用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式删除用户失败");
		}
		return resultMap;
	}

}

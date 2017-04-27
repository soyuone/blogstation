package com.song.blogstation.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public Map<String, Object> insertUserTradition(UserBean user) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.insertUserTradition(user) > 0) {
			// 人为制造异常，验证事务回滚
			int a = 2 / 0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用传统方式添加用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式添加用户失败");
		}
		return resultMap;
	}

	@Transactional
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

	@Transactional
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

	@Transactional
	@Override
	public Map<String, Object> updateUserAnnotation(UserBean user, Integer id) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.updateUserAnnotation(user, id) > 0) {
			// 人为制造异常，验证事务回滚
			int a = 2 / 0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用注解方式修改用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式修改用户失败");
		}
		return resultMap;
	}

	@Transactional
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

	@Transactional
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

	@Override
	public Map<String, Object> getUserByIdTradition(Integer id) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		UserBean user = um.getUserByIdTradition(id);
		if (null != user) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用传统方式查询用户成功");
			resultMap.put("data", user);
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式查询用户失败");
			resultMap.put("data", user);
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> getUserByIdAnnotation(Integer id) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		UserBean user = um.getUserByIdAnnotation(id);
		if (null != user) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用注解方式查询用户成功");
			resultMap.put("data", user);
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式查询用户失败");
			resultMap.put("data", user);
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> getAllUserAccountTradition() throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<UserBean> list = um.getAllUserAccountTradition();
		if (null != list && list.size() > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用传统方式查询用户成功");
			resultMap.put("data", list);
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式查询用户失败");
			resultMap.put("data", list);
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> getAllUserAccountAnnotation() throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<UserBean> list = um.getAllUserAccountAnnotation();
		if (null != list && list.size() > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "使用注解方式查询用户成功");
			resultMap.put("data", list);
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式查询用户失败");
			resultMap.put("data", list);
		}
		return resultMap;
	}

	@Transactional
	@Override
	public Map<String, Object> insertBatchUser(List<UserBean> users) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.batchInsertUser(users) > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "批量添加用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "批量添加用户失败");
		}
		return resultMap;
	}

	@Transactional
	@Override
	public Map<String, Object> deleteBatchUser(List<Integer> ids) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if (um.batchDeleteUser(ids) > 0) {
			// 人为制造异常，验证事务回滚
			// int a = 2/0;
			resultMap.put("code", 200);
			resultMap.put("result", "批量删除用户成功");
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "批量删除用户失败");
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> getUserByLike(String username) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<UserBean> users = um.getUserByLike(username);
		if (null != users && users.size() > 0) {
			resultMap.put("code", 200);
			resultMap.put("result", "模糊查询用户成功");
			resultMap.put("data", users);
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "没有对应的用户信息，请先添加");
			resultMap.put("data", users);
		}
		return resultMap;
	}

	@Override
	public Map<String, Object> getUserByLikeParamMap(Map<String, Object> paramMap) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<UserBean> userList = um.getUserByLikeParamMap(paramMap);
		if (null != userList && userList.size() > 0) {
			resultMap.put("code", 200);
			resultMap.put("result", "模糊查询用户成功");
			resultMap.put("data", userList);
		}
		else {
			resultMap.put("code", 500);
			resultMap.put("result", "没有对应的用户信息，请先添加");
			resultMap.put("data", userList);
		}
		return resultMap;
	}

}

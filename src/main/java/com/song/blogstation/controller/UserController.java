package com.song.blogstation.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.song.blogstation.beans.UserBean;
import com.song.blogstation.service.UserService;

/**
 * <p>
 * Title: blogstation_[子系统名称]_[UserController]
 * </p>
 * <p>
 * Description: [UserController]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月17日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
@Controller
@RequestMapping("api/user")
public class UserController {

	protected Logger log = Logger.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	/**
	 * <p>
	 * Description:[添加用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/insertuser/tradition", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insertUserTradition(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 接收参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String account = request.getParameter("account");
		try {
			// 添加
			UserBean user = new UserBean(username, password, Double.valueOf(account));
			resultMap = userService.insertUserTradition(user);
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式添加用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[添加用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/insertuser/annotation", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insertUserUserAnnotation(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 接收参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String account = request.getParameter("account");
		try {
			// 添加
			UserBean user = new UserBean(username, password, Double.valueOf(account));
			resultMap = userService.insertUserUserAnnotation(user);
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式添加用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[修改用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateuser/tradition", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateUserTradition(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 接收参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String account = request.getParameter("account");
		String id = request.getParameter("id");
		try {
			// 修改
			UserBean user = new UserBean(username, password, Double.valueOf(account));
			resultMap = userService.updateUserTradition(user, Integer.parseInt(id));
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式添加用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[修改用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateuser/annotation", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateUserAnnotation(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 接收参数
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String account = request.getParameter("account");
		String id = request.getParameter("id");
		try {
			// 修改
			UserBean user = new UserBean(username, password, Double.valueOf(account));
			resultMap = userService.updateUserAnnotation(user, Integer.parseInt(id));
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式添加用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[删除用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/delteuser/tradition", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteUserTradition(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 接收参数
		String id = request.getParameter("id");
		try {
			// 修改
			resultMap = userService.deleteUserTradition(Integer.parseInt(id));
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式删除用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[删除用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/deleteuser/annotation", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> deleteUserAnnotation(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 接收参数
		String id = request.getParameter("id");
		try {
			// 修改
			resultMap = userService.deleteUserAnnotation(Integer.parseInt(id));
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式删除用户异常，可能是网络原因");
		}
		return resultMap;
	}
}

package com.song.blogstation.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
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
			// 删除
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
			// 删除
			resultMap = userService.deleteUserAnnotation(Integer.parseInt(id));
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解方式删除用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[查询用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getuserbyid/tradition", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getUserByIdTradition(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 接收参数
		String id = request.getParameter("id");
		try {
			// 查询
			resultMap = userService.getUserByIdTradition(Integer.parseInt(id));
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式查询用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[查询用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getuserbyid/annotation", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getUserByIdAnnotation(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		// 接收参数
		String id = request.getParameter("id");
		try {
			// 查询
			resultMap = userService.getUserByIdAnnotation(Integer.parseInt(id));
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解式查询用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[查询所有用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getalluser/tradition", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAllUserAccountTradition(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			// 查询
			resultMap = userService.getAllUserAccountTradition();
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用传统方式查询用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[查询所有用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getalluser/annotation", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getAllUserAccountAnnotation(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			// 查询
			resultMap = userService.getAllUserAccountAnnotation();
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "使用注解式查询用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[批量添加用户]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/batch/insertuser", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> batchInsertUser(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			// 查询
			List<UserBean> users = new ArrayList<UserBean>();
			for (int i = 0; i < 5; i++) {
				String username = "晴天" + i;
				UserBean ub = new UserBean(username, "2000", 10.10);
				users.add(ub);
			}

			resultMap = userService.insertBatchUser(users);
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "批量添加用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[批量删除用户]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/batch/deleteuser", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> batchDeleteUser(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			String ids = request.getParameter("ids");

			String[] idArray = ids.split(",");
			List<Integer> idList = new ArrayList<Integer>();
			for (int i = 0; i < idArray.length; i++) {
				idList.add(Integer.parseInt(idArray[i]));
			}

			resultMap = userService.deleteBatchUser(idList);
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "批量删除用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[根据用户名模糊查询用户]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getuser/like", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getUserByLike(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			String username = request.getParameter("username");

			// 查询
			resultMap = userService.getUserByLike(username);
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "模糊查询用户异常，可能是网络原因");
		}
		return resultMap;
	}

	/**
	 * <p>
	 * Description:[模糊查询-map]
	 * </p>
	 * Created by [songyushi] [2017年2月21日] Midified by [修改人] [修改时间]
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getuser/paramlike", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getUserByLikeParamMap(HttpServletRequest request) {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		try {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String account = request.getParameter("account");

			// 是否为空
			Map<String, Object> paramMap = new HashMap<String, Object>();
			if (StringUtils.isNotBlank(username)) {
				paramMap.put("username", username);
			}
			if (StringUtils.isNotBlank(password)) {
				paramMap.put("password", password);
			}
			if (StringUtils.isNotBlank(account)) {
				paramMap.put("account", account);
			}

			resultMap = userService.getUserByLikeParamMap(paramMap);
		}
		catch (Exception e) {
			log.error(e.getLocalizedMessage(), e);
			resultMap.put("code", 500);
			resultMap.put("result", "模糊查询用户异常，可能是网络原因");
		}
		return resultMap;
	}
}

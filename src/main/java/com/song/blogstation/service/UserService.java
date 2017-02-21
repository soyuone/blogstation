package com.song.blogstation.service;

import java.util.List;
import java.util.Map;

import com.song.blogstation.beans.UserBean;

/**
 * <p>
 * Title: blogstation_[子系统名称]_[UserService]
 * </p>
 * <p>
 * Description: [UserService]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月17日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
public interface UserService {

	/**
	 * <p>
	 * Description:[添加用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> insertUserTradition(UserBean user) throws Exception;

	/**
	 * <p>
	 * Description:[添加用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> insertUserUserAnnotation(UserBean user) throws Exception;

	/**
	 * <p>
	 * Description:[修改用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param user
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> updateUserTradition(UserBean user, Integer id) throws Exception;

	/**
	 * <p>
	 * Description:[修改用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param user
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> updateUserAnnotation(UserBean user, Integer id) throws Exception;

	/**
	 * <p>
	 * Description:[删除用户-传统方式]
	 * </p>
	 * Created by [SO] [2017年2月19日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> deleteUserTradition(Integer id) throws Exception;

	/**
	 * <p>
	 * Description:[删除用户-注解方式]
	 * </p>
	 * Created by [SO] [2017年2月19日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> deleteUserAnnotation(Integer id) throws Exception;

	/**
	 * <p>
	 * Description:[根据ID查询用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public Map<String, Object> getUserByIdTradition(Integer id) throws Exception;

	/**
	 * <p>
	 * Description:[根据ID查询用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getUserByIdAnnotation(Integer id) throws Exception;

	/**
	 * <p>
	 * Description:[查询所有用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getAllUserAccountTradition() throws Exception;

	/**
	 * <p>
	 * Description:[查询所有用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getAllUserAccountAnnotation() throws Exception;

	/**
	 * <p>
	 * Description:[批量添加用户]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param users
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> insertBatchUser(List<UserBean> users) throws Exception;

	/**
	 * <p>
	 * Description:[批量删除用户]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param ids
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> deleteBatchUser(List<Integer> ids) throws Exception;

	/**
	 * <p>
	 * Description:[根据用户名模糊查询用户]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @param username
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getUserByLike(String username) throws Exception;

	/**
	 * <p>
	 * Description:[模糊查询-map]
	 * </p>
	 * Created by [songyushi] [2017年2月21日] Midified by [修改人] [修改时间]
	 *
	 * @param paramMap
	 * @return
	 */
	public Map<String, Object> getUserByLikeParamMap(Map<String, Object> paramMap);
}

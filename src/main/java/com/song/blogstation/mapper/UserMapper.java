package com.song.blogstation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.song.blogstation.beans.UserBean;

/**
 * <p>
 * Title: blogstation_[子系统名称]_[UserMapper]
 * </p>
 * <p>
 * Description: [UserMapper]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月17日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
public interface UserMapper {

	/**
	 * <p>
	 * Description:[添加用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param user
	 * @return
	 */
	public int insertUserTradition(@Param("user") UserBean user) throws Exception;

	/**
	 * <p>
	 * Description:[添加用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月17日] Midified by [修改人] [修改时间]
	 *
	 * @param user
	 * @return
	 */
	@Insert(" INSERT INTO tb_user (username,password,account) VALUES (#{user.username},#{user.password},#{user.account})")
	@Options(useGeneratedKeys = true, keyProperty = "user.id")
	public int insertUserUserAnnotation(@Param("user") UserBean user);

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
	public int updateUserTradition(@Param("user") UserBean user, @Param("id") Integer id) throws Exception;

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
	@Update(" UPDATE tb_user SET username=#{user.username},password=#{user.password},account=#{user.account} WHERE id=#{id} ")
	public int updateUserAnnotation(@Param("user") UserBean user, @Param("id") Integer id) throws Exception;

	/**
	 * <p>
	 * Description:[删除用户-传统方式]
	 * </p>
	 * Created by [SO] [2017年2月19日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public int deleteUserTradition(@Param("id") Integer id);

	/**
	 * <p>
	 * Description:[删除用户-注解方式]
	 * </p>
	 * Created by [SO] [2017年2月19日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	@Delete(" DELETE FROM tb_user WHERE id=#{id} ")
	public int deleteUserAnnotation(@Param("id") Integer id);

	/**
	 * <p>
	 * Description:[根据ID查询用户-传统方式]
	 * </p>
	 * Created by [SO] [2017年2月19日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	public UserBean getUserByIdTradition(@Param("id") Integer id);

	/**
	 * <p>
	 * Description:[根据ID查询用户-注解方式]
	 * </p>
	 * Created by [SO] [2017年2月19日] Midified by [修改人] [修改时间]
	 *
	 * @param id
	 * @return
	 */
	@Select(" SELECT * FROM tb_user WHERE id=#{id} ")
	@Results({ @Result(id = true, property = "id", column = "id", javaType = Integer.class),
			@Result(property = "username", column = "username", javaType = String.class),
			@Result(property = "password", column = "password", javaType = String.class),
			@Result(property = "account", column = "account", javaType = Double.class) })
	public UserBean getUserByIdAnnotation(@Param("id") Integer id);

	/**
	 * <p>
	 * Description:[查询所有用户-传统方式]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 */
	public List<UserBean> getAllUserAccountTradition();

	/**
	 * <p>
	 * Description:[查询所有用户-注解方式]
	 * </p>
	 * Created by [songyushi] [2017年2月20日] Midified by [修改人] [修改时间]
	 *
	 * @return
	 */
	@Select(" SELECT * FROM tb_user ")
	@ResultMap("userMap")
	public List<UserBean> getAllUserAccountAnnotation();
}

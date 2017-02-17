package com.song.blogstation.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
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

}

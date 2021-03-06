package com.song.blogstation.beans;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Title: blogstation_[子系统名称]_[UserBean]
 * </p>
 * <p>
 * Description: [UserBean]
 * </p>
 * 
 * @author songyushi
 * @version $Revision$ 2017年2月17日
 * @author (lastest modification by $Author$)
 * @since 20100901
 */
public class UserBean implements Serializable {

	/**
	 * generated
	 */
	private static final long serialVersionUID = 3355971530456471082L;

	private Integer id;

	private String username;

	private String password;

	private Double account;

	private List<AddressBean> addressList;

	public UserBean() {
	}

	public UserBean(String username, String password, Double account) {
		this.username = username;
		this.password = password;
		this.account = account;
	}

	public UserBean(Integer id, String username, String password, Double account) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public List<AddressBean> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressBean> addressList) {
		this.addressList = addressList;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", username=" + username + ", password=" + password + ", account=" + account
				+ "]";
	}

}

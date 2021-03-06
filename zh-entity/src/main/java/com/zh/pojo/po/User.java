package com.zh.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	private static final long serialVersionUID = 3435223771988430040L;

	private Integer id;

	private String username;

	private String password;

	private Date createdate;

	private Date updatedate;

	private Integer flag;

	private String remark;

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

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public User(Integer id, String username, String password, Date createdate, Date updatedate, Integer flag,
			String remark) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.flag = flag;
		this.remark = remark;
	}

	public User() {
		
	}

	public User(Integer id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
}

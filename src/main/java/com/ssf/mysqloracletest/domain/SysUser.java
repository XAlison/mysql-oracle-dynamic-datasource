package com.ssf.mysqloracletest.domain;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class SysUser implements Serializable{
	private static final long serialVersionUID = 1L;
	@TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private Short userlevel;

    private String organizationcode;

    private String remark;

    private Short status;

    private Short theme;

    private Short usertype;

    private Integer creator;

    private Date intime;

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

	public Short getUserlevel() {
		return userlevel;
	}

	public void setUserlevel(Short userlevel) {
		this.userlevel = userlevel;
	}

	public String getOrganizationcode() {
		return organizationcode;
	}

	public void setOrganizationcode(String organizationcode) {
		this.organizationcode = organizationcode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public Short getTheme() {
		return theme;
	}

	public void setTheme(Short theme) {
		this.theme = theme;
	}

	public Short getUsertype() {
		return usertype;
	}

	public void setUsertype(Short usertype) {
		this.usertype = usertype;
	}

	public Integer getCreator() {
		return creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Date getIntime() {
		return intime;
	}

	public void setIntime(Date intime) {
		this.intime = intime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
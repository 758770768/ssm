package org.ssm.pojo;

import java.util.Set;

public class User {

	private Integer uid;
	private String uname;
	private Set<Role> rs;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Set<Role> getRs() {
		return rs;
	}

	public void setRs(Set<Role> rs) {
		this.rs = rs;
	}

}

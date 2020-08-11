package com.t05g1.pojo;

public class Admins {
	
    private Integer a_id;

    private String a_adminName;

    private String a_password;

    private String a_holder;

    private String salt;

    private String a_headportrait;
    
    //非数据库字段    
    private Role role;

    public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_adminName() {
        return a_adminName;
    }

    public void setA_adminName(String a_adminName) {
        this.a_adminName = a_adminName == null ? null : a_adminName.trim();
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password == null ? null : a_password.trim();
    }

    public String getA_holder() {
        return a_holder;
    }

    public void setA_holder(String a_holder) {
        this.a_holder = a_holder == null ? null : a_holder.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getA_headportrait() {
        return a_headportrait;
    }

    public void setA_headportrait(String a_headportrait) {
        this.a_headportrait = a_headportrait == null ? null : a_headportrait.trim();
    }

	@Override
	public String toString() {
		return "Admins [a_id=" + a_id + ", a_adminName=" + a_adminName + ", a_password=" + a_password + ", a_holder="
				+ a_holder + ", salt=" + salt + ", a_headportrait=" + a_headportrait + "]";
	}
    
}
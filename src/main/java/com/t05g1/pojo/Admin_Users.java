package com.t05g1.pojo;

public class Admin_Users {
    private Integer u_id;

    private String u_user;

    private String u_pwd;

    private String u_name;

    private String u_addres;

    private Integer u_type;

    private String u_phone;

    private String u_email;
    
    private String u_photo;

    public String getU_photo() {
		return u_photo;
	}

	public void setU_photo(String u_photo) {
		this.u_photo = u_photo;
	}

	public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_user() {
        return u_user;
    }

    public void setU_user(String u_user) {
        this.u_user = u_user == null ? null : u_user.trim();
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd == null ? null : u_pwd.trim();
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name == null ? null : u_name.trim();
    }

    public String getU_addres() {
        return u_addres;
    }

    public void setU_addres(String u_addres) {
        this.u_addres = u_addres == null ? null : u_addres.trim();
    }

    public Integer getU_type() {
        return u_type;
    }

    public void setU_type(Integer u_type) {
        this.u_type = u_type;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone == null ? null : u_phone.trim();
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email == null ? null : u_email.trim();
    }
}
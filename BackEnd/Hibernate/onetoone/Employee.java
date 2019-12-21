package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import lombok.Data;
import lombok.ToString.Exclude;

@Entity
@Table(name = "employe_info")
public class Employee {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	public EmployeeOthersInfo getOther() {
		return other;
	}
	public void setOther(EmployeeOthersInfo other) {
		this.other = other;
	}


	@OneToOne(cascade = CascadeType.ALL, mappedBy = "empinfo")
	private EmployeeOthersInfo other;
	}



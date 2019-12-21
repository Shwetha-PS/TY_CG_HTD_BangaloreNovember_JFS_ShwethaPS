package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoone.Employee;

import lombok.Data;

@Data
@Entity
@Table(name = "EmployeeExperience")
public class EmployeeExperience {
	@Id
	@Column
	private int expid;
	@Column
	private String cname;
	@Column
	private int noOfyears;
	
	
	public int getExpid() {
		return expid;
	}


	public void setExpid(int expid) {
		this.expid = expid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public int getNoOfyears() {
		return noOfyears;
	}


	public void setNoOfyears(int noOfyears) {
		this.noOfyears = noOfyears;
	}


	public Employee getEmp() {
		return emp;
	}


	public void setEmp(Employee emp) {
		this.emp = emp;
	}


	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "eid")
	private Employee emp;
	
	
	

}

package com.capgemini.retailermaintainance.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product_info")
public class OrderInfo {
	@Id
	@Column
	@GeneratedValue
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	private ProductInfo productbean;

	public ProductInfo getProductbean() {
		return productbean;
	}

	public void setProductbean(ProductInfo productbean) {
		this.productbean = productbean;
	}

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private ProductInfo userbean;

	public ProductInfo getUserbean() {
		return userbean;
	}

	public void setUserbean(ProductInfo userbean) {
		this.userbean = userbean;
	}

	@Override
	public String toString() {
		return "OrderInfo [id=" + id + "]";
	}

}

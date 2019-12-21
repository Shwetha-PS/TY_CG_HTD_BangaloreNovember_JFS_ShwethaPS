package com.capgemini.jpawithhibernate.dto;

import javax.persistence.*;
//import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	@Column(name = "movie_id")
	private int m_id;
	@Column(name = "name")
	private String m_name;
	@Column(name = "rating")
	private String m_rating;
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_rating() {
		return m_rating;
	}
	public void setM_rating(String m_rating) {
		this.m_rating = m_rating;
	}


}

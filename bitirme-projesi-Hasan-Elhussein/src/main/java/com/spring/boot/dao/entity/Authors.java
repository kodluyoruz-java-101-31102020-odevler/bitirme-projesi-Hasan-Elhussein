package com.spring.boot.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Authors {
	
	@Id
	@Column(name = "author_id")
	private int author_id;
	
	@Column(name = "author_name")
	private String author_name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_name", insertable = false, updatable = false)
	private Books books;
	
	
	//*** Setters and Getters ***
	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}
	//***************************
	
}

package com.spring.boot.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {
	
	@Id
	@Column(name = "book_id")
	private long book_id;
	
	@Column(name = "book_name")
	private String book_name;
	
	@Column(name = "author_name")
	private String author_name;
	
	@Column(name = "book_description")
	private String book_description;
	
	@Column(name = "book_note")
	private String book_note;
	
	@Column(name = "book_page_count")
	private int book_page_count;
	
	@Column(name = "book_publication_date")
	private String book_publication_date;
	
	
	//*** Setters and Getters ***
	public long getBook_id() {
		return book_id;
	}

	public void setBook_id(long book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getBook_description() {
		return book_description;
	}

	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}

	public String getBook_note() {
		return book_note;
	}

	public void setBook_note(String book_note) {
		this.book_note = book_note;
	}

	public int getBook_page_count() {
		return book_page_count;
	}

	public void setBook_page_count(int book_page_count) {
		this.book_page_count = book_page_count;
	}

	public String getBook_publication_date() {
		return book_publication_date;
	}

	public void setBook_publication_date(String book_publication_date) {
		this.book_publication_date = book_publication_date;
	}
	
}



package com.spring.boot.dao.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Books {
	
	@Id
	@Column(name = "book_id")
	private long book_id;
	
	@Column(name = "book_name")
	private String book_name;
	
	@Column(name = "author_id")
	private long author_id;
	
	@Column(name = "book_description")
	private String book_description;
	
	@Column(name = "book_note")
	private String book_note;
	
	@Column(name = "book_page_count")
	private int book_page_count;
	
	@Column(name = "book_publication_date")
	private String book_publication_date;
	
	@OneToMany(mappedBy = "books", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Authors> authorsList;
	
	
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

	public long getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(long author_id) {
		this.author_id = author_id;
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

	public List<Authors> getAuthorsList() {
		return authorsList;
	}

	public void setAuthorsList(List<Authors> authors) {
		this.authorsList = authors;
	}
	//***************************
	
}



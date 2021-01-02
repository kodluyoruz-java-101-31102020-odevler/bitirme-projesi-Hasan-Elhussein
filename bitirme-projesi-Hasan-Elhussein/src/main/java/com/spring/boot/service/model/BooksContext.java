package com.spring.boot.service.model;

//import java.io.Serializable;

public class BooksContext  /*implements Serializable*/ {

	//private static final long serialVersionUID = 3906169278470348749L;
	
	private String keyWord;
	
	private long id;
	private String book_name;
	private long author_id;
	private String book_description;
	private String book_note;
	private int book_page_count;
	private String book_publication_date;
	
	//*** Setters and Getters ***
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	//***************************

}

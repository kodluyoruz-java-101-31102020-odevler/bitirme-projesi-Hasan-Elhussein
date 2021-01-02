package com.spring.boot.service.model;

//import java.io.Serializable;

public class AuthorsContext  /*implements Serializable*/ {

	//private static final long serialVersionUID = 3906169278470348749L;
	
	private String keyWord;

	private long author_id;
	private String author_name;
	
	//*** Setters and Getters ***
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public long getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(long author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	//***************************

}

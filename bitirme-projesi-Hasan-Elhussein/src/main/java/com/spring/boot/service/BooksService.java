package com.spring.boot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.boot.annotation.RuntimeAspect;
import com.spring.boot.dao.entity.Books;
import com.spring.boot.dao.jpa.repository.BooksRepository;
import com.spring.boot.service.model.BooksContext;

@Service
public class BooksService implements IBooksService{
	
	
	@Autowired
	private BooksRepository booksRepository;
	
	@RuntimeAspect(active = true)
	public Books findWithBook_id(Long id) {
		return booksRepository.findWithBook_id(id);
	}
	
	@RuntimeAspect(active = true)
	public List<Books> getAllBooksList() {
		return booksRepository.getAllBooksList();
	}
	
	@RuntimeAspect(active = true)
	public List<Books> searchBooksList(BooksContext booksContext) {
		if(booksContext.getKeyWord() != null) return booksRepository.searchBooksList(booksContext.getKeyWord());	
		 return booksRepository.getAllBooksList(); 	
	}
	
	@RuntimeAspect(active = true)
	@Transactional
	public Long save(BooksContext booksContext) {
		
		Long maxId = 1L;
		
		//check if the list is empty
		if(booksRepository.findWithBook_id(1L) != null)
			maxId = booksRepository.findMaxId() + 1;
		
		Books books= new Books();
		books.setBook_id(maxId);
		books.setBook_name(booksContext.getBook_name());
		books.setAuthor_name(booksContext.getAuthor_name());
		books.setBook_publication_date(booksContext.getBook_publication_date());
		books.setBook_description(booksContext.getBook_description());
		books.setBook_note(booksContext.getBook_note());
		books.setBook_page_count(booksContext.getBook_page_count());
		books = booksRepository.save(books);
		
		return books.getBook_id();
	}
	
	/*
	@RuntimeAspect(active = true)
	@Transactional
	public Long update(BooksContext booksContext) {
		
		Books books = booksRepository.findWithBook_id(booksContext.getId());
		if(books == null)
			throw new RuntimeException(booksContext.getId() + " ID not found in DB");
		
		books.setBook_name(booksContext.getBook_name());
		books.setAuthor_name(booksContext.getAuthor_name());
		books.setBook_publication_date(booksContext.getBook_publication_date());
		books.setBook_description(booksContext.getBook_description());
		books.setBook_note(booksContext.getBook_note());
		books.setBook_page_count(booksContext.getBook_page_count());
		booksRepository.save(books);
		return books.getBook_id();
	}
	*/
	
	@RuntimeAspect(active = true)
	@Transactional
	public Long delete(Long id) {
		booksRepository.deleteAll();
		return id;
	}

}

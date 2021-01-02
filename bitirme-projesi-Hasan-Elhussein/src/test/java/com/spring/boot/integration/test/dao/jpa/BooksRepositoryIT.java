package com.spring.boot.integration.test.dao.jpa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.boot.dao.entity.Books;
import com.spring.boot.dao.jpa.repository.BooksRepository;



@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource({ "classpath:application.properties" })
class BooksRepositoryIT {
	
	@Autowired
	private BooksRepository booksRepository;
	
	@Test
	@Order(1)
	public void selectBooksById() {
		
		Long maxId = booksRepository.findMaxId();
		Books books = booksRepository.findWithBook_id(maxId);
		
		assertNotNull(books);
		assertTrue(books.getBook_id() > 0);
	}
	
	@Test
	@Transactional
	@Rollback(true)
	@Order(3)
	public void saveBooks() {
		
		Long testMaxId = 1L;
		if(booksRepository.findWithBook_id(1L) != null)
			testMaxId = booksRepository.findMaxId() + 1;
		
		Books books = new Books();
		books.setBook_id(testMaxId );
		books.setBook_name("test book name");
		books.setAuthor_name("test author name");
		books.setBook_description("test description");
		books.setBook_publication_date("2020");
		books.setBook_note("just a test");
		books.setBook_page_count(20);
		booksRepository.save(books);
		
		assertNotNull(books);
		assertTrue(books.getBook_id() > 0);
	}
	
	

}

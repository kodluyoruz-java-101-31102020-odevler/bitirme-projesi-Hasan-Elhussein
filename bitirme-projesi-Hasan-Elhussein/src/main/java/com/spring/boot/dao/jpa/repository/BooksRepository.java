package com.spring.boot.dao.jpa.repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.boot.annotation.RuntimeAspect;
import com.spring.boot.dao.entity.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books, Long> {
	
	@RuntimeAspect(active = true)
	@Query(value = "SELECT b FROM Books b WHERE b.book_id = :book_id")
	public Books findWithBook_id(@Param("book_id") long book_id);
	
	@RuntimeAspect(active = true)
	@Query(value = "SELECT * FROM books b WHERE b.book_name like %:book_name%", nativeQuery = true)
	public List<Books> searchBooksList(@Param("book_name") String keyword );
	
	@RuntimeAspect(active = true)
	@Query(value = "SELECT MAX(b.book_id) FROM Books b")
	public long findMaxId();
	
	@RuntimeAspect(active = true)
	@Query(value = "SELECT b FROM Books b ")
	public List<Books> getAllBooksList();
		

}

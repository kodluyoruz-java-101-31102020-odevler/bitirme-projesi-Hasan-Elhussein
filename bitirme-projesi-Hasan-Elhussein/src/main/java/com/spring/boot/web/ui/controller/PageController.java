package com.spring.boot.web.ui.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.spring.boot.dao.entity.Books;
import com.spring.boot.service.BooksService;
import com.spring.boot.service.model.AuthorsContext;
import com.spring.boot.service.model.BooksContext;

@Controller
@RequestMapping("/pages")
public class PageController {

	@Autowired
	private BooksService booksService;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String searchBooksList(BooksContext booksContext, BindingResult result, Model model) {
		List<Books> books = booksService.searchBooksList(booksContext);
		model.addAttribute("books", books);
		return "pages/thyme_books";
	}
	
	@RequestMapping(value = "/add_book", method = RequestMethod.GET)
	public String getBooksSavePage(BooksContext booksContext) {
		return "pages/thyme_add_book";
	}
	
	
	@RequestMapping(value = "/add_book", method = RequestMethod.POST)
    public String addBook(BooksContext booksContext, BindingResult result, Model model) {
		booksService.save(booksContext);
		model.addAttribute("books", booksService.getAllBooksList());
        return "pages/thyme_books";
	}
	
	
	@RequestMapping(value = "/add_author", method = RequestMethod.GET)
	public String addAuthor(AuthorsContext authorsContext) {
		return "pages/thyme_add_author";
	}
	
	
	
}

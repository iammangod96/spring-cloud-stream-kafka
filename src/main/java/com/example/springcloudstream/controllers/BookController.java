package com.example.springcloudstream.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloudstream.beans.Book;
import com.example.springcloudstream.services.BookService;

@RestController
public class BookController {
	
	Long id = 101L;

	@Autowired
	private BookService bookService;

	@GetMapping("book")
	public void sendBook(@RequestParam("book") String message) {
		Book book = Book.builder().name(message).id(id++).build();
		bookService.sendMessage(book);
	}
}

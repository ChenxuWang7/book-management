package com.example.bookmanagement.service;

import java.util.List;

import com.example.bookmanagement.model.Book;

public interface BookService {
	void save(Book book);
	Book get(int id);
	void delete(int id);
	List<Book> get();
}

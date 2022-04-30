package com.example.bookmanagement.dao;

import java.util.List;

import com.example.bookmanagement.model.Book;

public interface BookDAO {
	
	void save(Book book);
	Book get(int id);
	void delete(int id);
	List<Book> get();
}

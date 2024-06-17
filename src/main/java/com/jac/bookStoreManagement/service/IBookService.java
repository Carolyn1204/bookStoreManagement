package com.jac.bookStoreManagement.service;

import java.util.List;

import com.jac.bookStoreManagement.entity.Book;

public interface IBookService {

	List<Book> findAll();

	Book findById(int theId);

	void save(Book theBook);

	void deleteById(int theId);

}

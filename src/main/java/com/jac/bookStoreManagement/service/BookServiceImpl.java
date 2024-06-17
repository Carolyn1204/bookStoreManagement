package com.jac.bookStoreManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jac.bookStoreManagement.dao.BookRepository;
import com.jac.bookStoreManagement.entity.Book;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> findAll() {

		return bookRepository.findAll();
	}

	@Override
	public Book findById(int theId) {
		Optional<Book> result = bookRepository.findById(theId);

		Book theBook = null;

		if (result.isPresent()) {
			theBook = result.get();
		} else {
			throw new RuntimeException("Did not find the book with Id: " + theId);
		}

		return theBook;
	}

	@Override
	public void save(Book theBook) {

		bookRepository.save(theBook);

	}

	@Override
	public void deleteById(int theId) {

		bookRepository.deleteById(theId);

	}

}

package com.jac.bookStoreManagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jac.bookStoreManagement.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	public List<Book> findAll();

}

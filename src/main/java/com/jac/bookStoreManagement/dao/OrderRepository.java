package com.jac.bookStoreManagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jac.bookStoreManagement.entity.BookOrderDTO;
import com.jac.bookStoreManagement.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	@Query("SELECT new com.jac.bookStoreManagement.entity.BookOrderDTO(o.orderId, o.bookId, b.title, o.customerName, b.price, o.purchasedDate) FROM Order o JOIN Book b ON o.bookId = b.bookId WHERE o.customerName = :customerName")
	List<BookOrderDTO> findBookOrdersByCustomerName(@Param("customerName") String customerName);
	
	@Query("SELECT new com.jac.bookStoreManagement.entity.BookOrderDTO(o.orderId, o.bookId, b.title, o.customerName, b.price, o.purchasedDate) FROM Order o JOIN Book b ON o.bookId = b.bookId")
	List<BookOrderDTO> findAllBookOrders();

}

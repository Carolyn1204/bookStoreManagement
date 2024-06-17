package com.jac.bookStoreManagement.service;

import java.util.List;

import com.jac.bookStoreManagement.entity.BookOrderDTO;
import com.jac.bookStoreManagement.entity.Order;

public interface IOrderService {
	
	
	
	
	
	void saveOrder(Order theOrder);

	List<BookOrderDTO> getBookOrdersByCustomerName(String customerName);

	List<BookOrderDTO> getAllBookOrders();

}

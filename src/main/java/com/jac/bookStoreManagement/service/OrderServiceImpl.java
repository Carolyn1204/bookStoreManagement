package com.jac.bookStoreManagement.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jac.bookStoreManagement.dao.OrderRepository;
import com.jac.bookStoreManagement.entity.BookOrderDTO;
import com.jac.bookStoreManagement.entity.Order;

@Service
public class OrderServiceImpl implements IOrderService {
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public List<BookOrderDTO> getBookOrdersByCustomerName(String customerName) {
        return orderRepository.findBookOrdersByCustomerName(customerName);
    }
	
	@Override
	public List<BookOrderDTO> getAllBookOrders() {
        return orderRepository.findAllBookOrders();
    }



	@Override
	public void saveOrder(Order theOrder) {

		orderRepository.save(theOrder);
		
	}

}

package com.jac.bookStoreManagement.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BookOrderDTO {

	private int orderId;
	private int bookId;
	private String title;
	private String customerName;
	private BigDecimal price;
	private Date purchasedDate;

	public BookOrderDTO() {
		super();
	}

	public BookOrderDTO(int orderId, int bookId, String title, String customerName, BigDecimal price,
			Date purchasedDate) {
		super();
		this.orderId = orderId;
		this.bookId = bookId;
		this.title = title;
		this.customerName = customerName;
		this.price = price;
		this.purchasedDate = purchasedDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getPurchasedDate() {
		return purchasedDate;
	}

	public void setPurchasedDate(Date purchasedDate) {
		this.purchasedDate = purchasedDate;
	}

}

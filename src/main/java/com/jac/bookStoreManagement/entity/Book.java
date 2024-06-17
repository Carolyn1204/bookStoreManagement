package com.jac.bookStoreManagement.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "books")
public class Book {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "title", nullable = false, length = 45)
    @NotBlank(message = "Title can't be empty!")
    private String title;

    @Column(name = "isbn", nullable = false, length = 13)
    @NotBlank(message = "ISBN can't be empty!")
    private String isbn;

    @Column(name = "author", nullable = false, length = 45)
    @NotBlank(message = "Author can't be empty!")
    private String author;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    @NotNull(message = "Price can't be empty!")
    private BigDecimal price;

    @Column(name = "published_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    @NotNull(message = "Date can't be empty!")
    private Date publishedDate;

    @Column(name = "summary", nullable = false, length = 255)
    @NotBlank(message = "Summary can't be empty!")
    private String summary;
    
    @Column(name = "img", nullable = true, length = 255)
    private String img;

	public Book() {
		super();
	}

	public Book(Integer bookId, String title, String isbn, String author, BigDecimal price, Date publishedDate, String summary, String img) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
		this.publishedDate = publishedDate;
		this.summary = summary;
		this.img = img;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	
    
	
	
    
}

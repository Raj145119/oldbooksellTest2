package com.oldBookSell.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="sell_order_request")
@SequenceGenerator(name="seq", initialValue=10001, allocationSize=1)
public class SellOrderRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	private int sell_order_request_id;
	
	@Column(name="book_name")	
    private String book_name;//title
	
	@Column(name="authors")	
    private String authors;
	
	@Column(name="description")	
    private String description;
	
	@Column(name="publisher")	
    private String publisher;
	
	@Column(name="publishedDate")	
    private String publishedDate; 
	
	@Column(name="categories")	
    private String categories;
	
	@Column(name="isbn_type_10")	
    private String isbn_type_10;
	
	@Column(name="isbnNo1")	
    private String isbnNo1; 
	
	@Column(name="isbn_type_13")	
    private String isbn_type_13; 
	
	@Column(name="isbnNo2")	
    private String isbnNo2;
	
	@Column(name="smallThumbnail")	
    private String smallThumbnail;//small image size 
	
	@Column(name="thumbnail")	
    private String thumbnail;//large image size
	
	@Column(name="amount")	
    private String amount;
	
	@Column(name="currencyCode")	
    private String currencyCode;
    
	@Column(name="quantity")	
    private int quantity;
	
	@Column(name="check_status")	
    private Boolean check_status;
	
	@Column(name="user_id")	
    private String user_id;
	
	@Column(name="location")	
    private String location;
	
	public int getSell_order_request_id() {
		return sell_order_request_id;
	}
	public void setSell_order_request_id(int sell_order_request_id) {
		this.sell_order_request_id = sell_order_request_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthors() {
		return authors;
	}
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	
	public String getIsbn_type_10() {
		return isbn_type_10;
	}
	public void setIsbn_type_10(String isbn_type_10) {
		this.isbn_type_10 = isbn_type_10;
	}
	public String getIsbnNo1() {
		return isbnNo1;
	}
	public void setIsbnNo1(String isbnNo1) {
		this.isbnNo1 = isbnNo1;
	}
	public String getIsbn_type_13() {
		return isbn_type_13;
	}
	public void setIsbn_type_13(String isbn_type_13) {
		this.isbn_type_13 = isbn_type_13;
	}
	public String getIsbnNo2() {
		return isbnNo2;
	}
	public void setIsbnNo2(String isbnNo2) {
		this.isbnNo2 = isbnNo2;
	}
	public String getSmallThumbnail() {
		return smallThumbnail;
	}
	public void setSmallThumbnail(String smallThumbnail) {
		this.smallThumbnail = smallThumbnail;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Boolean getCheck_status() {
		return check_status;
	}
	public void setCheck_status(Boolean check_status) {
		this.check_status = check_status;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public SellOrderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
    

}

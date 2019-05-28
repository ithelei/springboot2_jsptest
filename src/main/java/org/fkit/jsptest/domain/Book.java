package org.fkit.jsptest.domain;

import java.io.Serializable;

public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private String image;
	private String author;
	private Double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(Integer id, String title, String image, String author, Double price) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.author = author;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", image=" + image + ", author=" + author + ", price=" + price
				+ "]";
	}
	
	

}
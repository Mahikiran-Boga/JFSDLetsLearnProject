package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookrequests_table")
public class BookRequests 
{   
	
	@Column(name = "cid")
	private int cid;
	@Column(name = "bookName", length = 30,nullable = false)
	@Id
	private String bookName;
	@Column(name = "year", length = 30,nullable = false)
    private String year;
	@Column(name = "author", length = 30,nullable = false)
    private String author;
	@Column(name = "publisher", length = 30,nullable = false)
    private String publisher;
	
	@Column(name="book_status")
	private boolean Status;
	
	
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

}

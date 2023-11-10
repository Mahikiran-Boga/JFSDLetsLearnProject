package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book 
{
	@Id
	private int bid; 
	@Column(length = 30,nullable = false)
	private String bname;
	@Column(length=15,nullable = false)
	private String byear;
	@Column(length = 30,nullable=false)
	private String bauthor;
	@Column(length = 30,nullable = false)
	private String bpublisher;
	@Column(name = "bfileContent", columnDefinition = "LONGBLOB")
	@Lob
	private byte[] bfileContent;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getByear() {
		return byear;
	}
	public void setByear(String byear) {
		this.byear = byear;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getBpublisher() {
		return bpublisher;
	}
	public void setBpublisher(String bpublisher) {
		this.bpublisher = bpublisher;
	}
	public byte[] getBfileContent() {
		return bfileContent;
	}
	public void setBfileContent(byte[] bfileContent) {
		this.bfileContent = bfileContent;
	}
	
	
	

}

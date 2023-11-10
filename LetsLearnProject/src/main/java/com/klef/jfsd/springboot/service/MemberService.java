package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.mail.SimpleMailMessage;

import com.klef.jfsd.springboot.model.Book;
import com.klef.jfsd.springboot.model.BookRequests;
import com.klef.jfsd.springboot.model.Member;

public interface MemberService {
	public String memregistration(Member mem);
	public Member checkmemberlogin(String email,String password);
	public List<Book> viewallbooks();
    public String Addmember(Member mem);
    public String deleteUser(int id);
    public String updateMember(Member mem);
    
    public Member viewmembyid(int mid);
    public String requestabook(BookRequests request);
    public List<BookRequests> viewallBookRequests(); 
    public List<BookRequests> viewallBookRequestsbyid(int mid);
    public Optional<BookRequests> findbookbyname(String bname);
    
   

}

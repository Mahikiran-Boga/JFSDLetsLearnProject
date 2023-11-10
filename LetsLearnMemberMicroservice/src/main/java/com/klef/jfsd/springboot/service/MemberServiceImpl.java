package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Book;
import com.klef.jfsd.springboot.model.BookRequests;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Member;
import com.klef.jfsd.springboot.repository.BookRepository;
import com.klef.jfsd.springboot.repository.BookRequestsRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;
import com.klef.jfsd.springboot.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService
{

	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookRequestsRepository bookRequestsRepository;
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	
	
	public String memregistration(Member mem) 
	{   
		memberRepository.save(mem);
		return "Registration Successful !";
	}

	

	@Override
	public List<Book> viewallbooks() {
		
		return bookRepository.findAll();
	}

	
	
	  @Override
	  public String updateMember(Member mem) {
	      Optional<Member> optionalMember = memberRepository.findById(mem.getId());

	      if (optionalMember.isPresent()) {
	          Member existingMember = optionalMember.get();
	          existingMember.setName(mem.getName());
	          existingMember.setUsername(mem.getUsername());
	          existingMember.setPassword(mem.getPassword());
	          existingMember.setContactno(mem.getContactno());
	          existingMember.setImage(mem.getImage());
	          memberRepository.save(existingMember);
	          return "Member Updated Successfully";
	      } else {
	          return "Member not found with the provided ID";
	      }
	  }

	  @Override
	  public Member viewmembyid(int mid) {
	    
	    Optional<Member> obj=memberRepository.findById(mid);
	    if(obj.isPresent()) {
	      Member mem=obj.get();
	      return mem;
	    }
	    else return null;
	    
	    
	    
	  }

	@Override
	public String requestabook(BookRequests request) 
	{
		 bookRequestsRepository.save(request);
		 return "Book Request Successful !";
	}

	

	@Override
	public List<BookRequests> viewallBookRequestsbyid(int mid) {
		
		return bookRequestsRepository.viewallbookrequestsbyid(mid);
	}



	@Override
	public Member checkmemberlogin(String email, String password) 
	{	  
	return memberRepository.checkmemberlogin(email, password); 
	
	}


	public Book getbookbyName(String filename)
	{
		return bookRepository.getBookbyName(filename);
	}

    
	@Override
	public Optional<BookRequests> findbookbyname(String bname) {
		
		return bookRequestsRepository.findById(bname);
		
	}
	
}

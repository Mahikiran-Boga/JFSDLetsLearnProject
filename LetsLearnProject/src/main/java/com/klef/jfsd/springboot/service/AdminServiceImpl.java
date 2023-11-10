package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.BookRepository;
import com.klef.jfsd.springboot.repository.BookRequestsRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;
import com.klef.jfsd.springboot.repository.MemberRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private MemberRepository memberRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookRequestsRepository bookRequestsRepository;
	
	public Admin checkadminlogin(String email,String pwd )
	{
		return adminRepository.checkadminlogin(email, pwd);
	}
	@Override
	  public long empcount() {
	    return employeeRepository.count();
	  }

	  @Override
	  public long usercount() {
	    return memberRepository.count();
	  }

	  @Override
	  public long bookcount() {
	    return bookRepository.count();
	  }
//	@Override
//	public long countBookRequestsR() {
//		
//		return bookRequestsRepository.countBookRequestsR();
//	}
//	@Override
//	public long countBookRequestsA() {
//		
//		return bookRequestsRepository.countBookRequestsA();
//	}
	@Override
	public long bookrequestscount() {
		
		return bookRequestsRepository.count();
	}
	
	  


}

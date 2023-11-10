package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Member;
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
	@Override
	public String deleteEmp(int id) {
//		employeeRepository.deleteById(id);
//		return "Employee Deleted Successfully !";
		
		Optional<Employee> obj=employeeRepository.findById(id);
		String msg=null;
		if(obj.isPresent()) {
			Employee emp=obj.get();
			employeeRepository.delete(emp);
			msg="Employee Deleted Successfully";
			
		}
		return msg;
		
	}
	
	
	@Override
	public String addemployee(Employee emp) 
	{
		employeeRepository.save(emp);
		return "Employee Added Successfully";
		
	}
	@Override
	public String Addmember(Member mem) {
		memberRepository.save(mem);
		return "Member Added Successfully";
	}

	public String deleteUser(int id)
	{
		Optional<Member> obj=memberRepository.findById(id);
		if(obj.isPresent()) {
			 Member mem=obj.get();
			 memberRepository.delete(mem);
			 return "Member Deleted Successfully !";
			 
		}
		return "Member ID Not Found !";
	}
	
	
	
	public List<Employee> viewallemployees()
	{
		
		List<Employee> emplist=employeeRepository.findAll();
		return emplist;
	}

	@Override
	public int updateempstatus(int eid, boolean status) 
	{
		return adminRepository.updateempstatus(eid, status);
		
	}
	
	
	
	  


}

package com.klef.jfsd.springboot.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.klef.jfsd.springboot.model.Book;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.repository.BookRepository;
import com.klef.jfsd.springboot.repository.BookRequestsRepository;
import com.klef.jfsd.springboot.repository.EmployeeRepository;

import jakarta.transaction.Transactional;


@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
	private EmployeeRepository employeeRepository;
    
    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private BookRequestsRepository bookRequestsRepository;

	public Employee checkemplogin(String email, String password) {
		
		return employeeRepository.checkemplogin(email, password);
	}

	
	public String AddBook(int id ,String bname,String byear, String bauthor,String bpublisher, MultipartFile request) 
	{
		  String fileName = StringUtils.cleanPath(request.getOriginalFilename());
	       String msg=null;
	        try {
	            Book book = new Book();
	            
	            book.setBid(id);
	            book.setBname(bname);
	            book.setByear(byear);
	            book.setBauthor(bauthor);
	            book.setBpublisher(bpublisher);
	            book.setBfileContent(request.getBytes());
	            bookRepository.save(book);
	            msg= "Book Added successfully";
	        } catch (IOException ex)
	        {
	           msg="Failed to Add Book";
	        }
	        return msg;
	}


	public Book getbookbyName(String filename)
	{
		return bookRepository.getBookbyName(filename);
	}

	@Override
	public String addemployee(Employee emp) 
	{
		employeeRepository.save(emp);
		return "Employee Added Successfully";
		
	}


	
	public List<Employee> viewallemployees()
	{
		
		List<Employee> emplist=employeeRepository.findAll();
		return emplist;
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

	  @Transactional
	  @Modifying
	  public String updateEmployee(Employee emp) {
	      Optional<Employee> optionalMember = employeeRepository.findById(emp.getId());

	      if (optionalMember.isPresent()) {
	          Employee e = optionalMember.get();
	          e.setName(emp.getName());
	          e.setUsername(emp.getUsername());
	          e.setEmail(emp.getEmail());
	          e.setContact(emp.getContact());
	          return "Employee Updated Successfully";
	      } else {
	          return "Employee not found with the provided ID";
	      }  
	  }


	  @Override
	  public Employee viewempbyid(int eid) {
	    Optional<Employee> obj=employeeRepository.findById(eid);
	    if(obj.isPresent()) {
	      Employee emp=obj.get();
	      return emp;
	    }
	    else return null;

	  }


	@Override
	public int updatestatus(String bname, boolean status) {
		
		return bookRequestsRepository.updatestatus(status, bname);
	}


	@Override
	public int updateempstatus(int eid, boolean status) 
	{
		return employeeRepository.updateempstatus(eid, status);
		
	}
	
	

 	@Override
 	  @Transactional
 	  @Modifying
 	    public String updateBook(Book updatedBook) {
 	        Optional<Book> optionalBook = bookRepository.findById(updatedBook.getBid());

 	        if (optionalBook.isPresent()) {
 	            Book book = optionalBook.get();
 	            book.setBid(updatedBook.getBid());
 	            book.setBname(updatedBook.getBname());
 	            book.setByear(updatedBook.getByear());
 	            book.setBauthor(updatedBook.getBauthor());
 	            book.setBpublisher(updatedBook.getBpublisher());
 	            return "Book Data Updated Successfully";
 	        } else {
 	            return "Book not found with the provided ID";
 	        }
 	    }
	
	
}

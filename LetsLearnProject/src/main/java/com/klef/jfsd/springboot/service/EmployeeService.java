package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.klef.jfsd.springboot.model.Book;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Member;
public interface EmployeeService
{
public Employee checkemplogin(String email,String password);
public String AddBook(int id ,String bname,String byear, String bauthor,String bpublisher,MultipartFile request);
public Book getbookbyName(String filename);
public String addemployee(Employee emp);
public List<Employee> viewallemployees(); 
public String deleteEmp(int id);
public String updateEmployee(Employee emp);
public Employee viewempbyid(int eid);
public int updatestatus(String eid,boolean status);
public int updateempstatus(int eid,boolean status);
 public String updateBook(Book updatedBook);


}

package com.klef.jfsd.springboot.controller;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;

import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Member;
import com.klef.jfsd.springboot.service.AdminService;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class AdminController
{
	
	@Autowired
	private AdminService adminService;
	
	
	@Autowired
	private AdminService employeeService;

	@GetMapping("/")
	   public ModelAndView admin() {
		   ModelAndView mv=new ModelAndView("adminlogin");
		   return mv;
	   }
	
	
	
	
   @GetMapping("adminlogin")
   public ModelAndView adminlogin() {
	   ModelAndView mv=new ModelAndView("adminlogin");
	   return mv;
   }
   
   @GetMapping("adminhome")
   public ModelAndView adminhome() {
     
     long ecount=adminService.empcount();
     long ccount=adminService.usercount();
     long  bcount=adminService.bookcount();
     long bookReqCount=adminService.bookrequestscount();
     
     ModelAndView mv=new ModelAndView();
     mv.setViewName("adminhome");
     mv.addObject("ecount", ecount);
     mv.addObject("ccount", ccount);
     mv.addObject("bcount", bcount);
     mv.addObject("bookReqCount",bookReqCount);
     
     return mv;
   }
  
   @PostMapping("checkadminlogin")
   public ModelAndView checkadminlogin(HttpServletRequest request) {
	   String email=request.getParameter("email");
	   String pwd=request.getParameter("password");
	   ModelAndView mv=new ModelAndView();

	   Admin admin=adminService.checkadminlogin(email, pwd);
	   if(admin!=null) {
	       HttpSession session=request.getSession();
	       session.setAttribute("email", admin.getEmail());
	       session.setAttribute("uname", admin.getUsername());
	       mv.setViewName("adminhome");
	       long ecount=adminService.empcount();
	       long ccount=adminService.usercount();
	       long  bcount=adminService.bookcount();
	       mv.addObject("ecount", ecount);
	       mv.addObject("ccount", ccount);
	       mv.addObject("bcount", bcount);
	       return mv;

	       
	   }
	   else {
		   mv.setViewName("adminlogin");
		   mv.addObject("message", "Invalid Credentials !");
		   
		   
	   }
	   return mv;
   }
   
   @GetMapping("addemp")
   public ModelAndView addemployee() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("addemployee");
	   return mv;
   }
   
   
   @GetMapping("viewallemps")
   public ModelAndView viewallemps() {
	   ModelAndView mv=new ModelAndView();
	   List<Employee> emplist=adminService.viewallemployees();
	   mv.setViewName("deleteemp");
	   mv.addObject("emplist", emplist);
	  
	   return mv;
   }
   
   
   @GetMapping("adduser")
   public ModelAndView addMember() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("adduser");
	   return mv;
   }
   
   @PostMapping("addemployee")
   public ModelAndView addemployee(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView();
	   String name=request.getParameter("name");
	   String joineddate=request.getParameter("date");
	   String gender=request.getParameter("gender");
	   String username=request.getParameter("username");
	   String contact=request.getParameter("contactno");
	   String email=request.getParameter("email");
	   
	   Employee emp=new Employee();
	   emp.setName(name);
	   emp.setUsername(username);
	   emp.setEmail(email);
	   emp.setGender(gender);
	   emp.setJoinedDate(joineddate);
	   emp.setPassword(username);
	   emp.setContact(contact);
	   
	  String s= adminService.addemployee(emp);
	  mv.setViewName("addemployee");
	  mv.addObject("message", s);
	   return mv;
   }
   
   @PostMapping("addmember")
   public ModelAndView addMember(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView();
	   String id=request.getParameter("mid");
	   int eid=Integer.parseInt(id);
	   String name=request.getParameter("name");
	   String gender=request.getParameter("gender");
	   String uname=request.getParameter("username");
	   String contact=request.getParameter("contactno");
	   String email=request.getParameter("email");
	   String pwd=id;
	   String cp=id;
	   
	   Member mem=new Member();
	   mem.setId(eid);
	   mem.setName(name);
	   mem.setUsername(uname);
	   mem.setEmail(email);
	   mem.setPassword(pwd);
	   mem.setGender(gender);
	   mem.setContactno(contact);
	   
	   
	  String msg=adminService.Addmember(mem);
	  mv.addObject("message", msg);
	  mv.setViewName("adduser");
	  return mv;
	   
   }
   
   
   @GetMapping("/delete/{id}")
   public String delete(@PathVariable("id") int id)
   {
	   
	   adminService.deleteEmp(id);
	  
	   return "redirect:/viewallemps";
   }
   
   @GetMapping("deleteuser")
   public ModelAndView deleteuser() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("deleteuser");
	   return mv;
   }
   
   @PostMapping("delete")
   public ModelAndView deleteu(HttpServletRequest request) {
	   String id=request.getParameter("employeeId");
	   int eid=Integer.parseInt(id);
	   ModelAndView mv=new ModelAndView();
	   String msg=adminService.deleteUser(eid);
	   mv.setViewName("deleteuser");
	   mv.addObject("message",msg);
	   return mv;
   }
   
   @GetMapping("empaction")
   public ModelAndView empaction(@RequestParam("employee_id") int eid,@RequestParam("employee_status") boolean status)
   {
	   ModelAndView mv=new ModelAndView();
	   int n=adminService.updateempstatus(eid, status);
	   mv.setViewName("deleteemp");
	   List<Employee> br=employeeService.viewallemployees();
	   mv.addObject("emplist", br);
	   if(n>0)
	    {
	      mv.addObject("message", "Employee Status Updated !!");
	    }
	  
	    
	    return mv;
	   
	 }
   

}

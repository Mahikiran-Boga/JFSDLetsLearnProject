package com.klef.jfsd.springboot.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Book;
import com.klef.jfsd.springboot.model.BookRequests;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Member;
import com.klef.jfsd.springboot.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("emp")
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping("/")
	   public ModelAndView login()
	   {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("login");
		   return mv;
	   }
	   @GetMapping("emplogin")
	   public ModelAndView emploginpage()
	   {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("login");
		   return mv;
	   }
   
	  @GetMapping("forgotpassword")
	   public ModelAndView forgotpassword() {
		   ModelAndView mv=new ModelAndView();
		   mv.setViewName("forgotPassword");
		   return mv;
	   }
	   
	
   @GetMapping("login")
   public ModelAndView loginpage()
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("login");
	   return mv;
   }
	
   @PostMapping("checkemplogin")
   public ModelAndView checkemplogin(HttpServletRequest request) {
       ModelAndView mv = new ModelAndView();
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       String userEnteredCaptcha = request.getParameter("captcha");
       
       HttpSession session = request.getSession();
       String storedCaptcha = (String) session.getAttribute("captchaCode");
       
       Employee emp = employeeService.checkemplogin(email, password);
       if(!userEnteredCaptcha.equals(storedCaptcha)) {
    	   mv.setViewName("login");
           mv.addObject("message", "Invalid Captcha!!");
       }
       else if (emp!=null && userEnteredCaptcha.equals(storedCaptcha)) {
         
               session.setAttribute("empid", emp.getId());
               session.setAttribute("empemail", emp.getEmail());
               session.setAttribute("empuname", emp.getUsername());
               mv.setViewName("employeehome");
               return mv;
           
       } 
       else {
           mv.setViewName("login");
           mv.addObject("message", "Invalid Credentials!!");
       }
       return mv;
   }

   
   
   
   
 
   @GetMapping("employeehome")
   public ModelAndView employeehome() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("employeehome");
	   return mv;
   }
   
   
   
   @GetMapping("addabook")
   public ModelAndView addabook() {
	   ModelAndView mv=new ModelAndView("addabook");
	   return mv;
   }
   
   
  
   
   @PostMapping("/upload")
   public ModelAndView uploadAssignment(@RequestParam("bookId") int bookId,
                                                  @RequestParam("bookName") String bookName,
                                                  @RequestParam("year") String year,
                                                  @RequestParam("author") String author,
                                                  @RequestParam("publisher") String publisher,
                                                  @RequestParam("book") MultipartFile book)
   {
	   
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("addabook");
       String response = employeeService.AddBook(bookId, bookName, year, author, publisher, book);
       //return ResponseEntity.status(HttpStatus.OK).body(response);
       mv.addObject("message", response);
       return mv;
   }
   
   

  
   @GetMapping("viewallrequests")
   public ModelAndView viewallBookRequests() {
	   ModelAndView mv=new ModelAndView("viewallrequests");
	   List<BookRequests> br=employeeService.viewallBookRequests();
	   mv.addObject("reqdata", br);
	   return mv;
   }
   
   
   
   
   @GetMapping("updateemployee")
   public ModelAndView updateemployee(HttpServletRequest request) {
     ModelAndView mv=new ModelAndView();
     mv.setViewName("updateemployee");
     HttpSession session=request.getSession();
     session.setAttribute("empid", session.getAttribute("empid"));
     int id=(int) session.getAttribute("empid");   
     Employee emp=employeeService.viewempbyid(id);
     mv.addObject("empdata",emp);
     return mv;
   }
   
   
   
   
   
   @PostMapping("updateempl")
   public ModelAndView updateempl(HttpServletRequest request){
     
        String msg=" ";
     
        ModelAndView mv = new ModelAndView();
      
        HttpSession session = request.getSession();
        mv.addObject("empid", session.getAttribute("empid"));
        int id = (int) session.getAttribute("empid");
        
        try {
          String name = request.getParameter("name");
          String username = request.getParameter("username");
          String contactno = request.getParameter("contactno");
          String email=request.getParameter("email");
          
          Employee e=new Employee();
          e.setId(id);
          e.setName(name);
          e.setUsername(username);
          e.setContact(contactno);
          e.setEmail(email);
          
          employeeService.updateEmployee(e);
          Employee updatedEmp = employeeService.viewempbyid(id);
          
          session.setAttribute("empdata", updatedEmp);
          
          mv.addObject("empdata", updatedEmp);
          mv.setViewName("updateemployee");
          mv.addObject("message"," Employee Profile Updated");

          
        }
        catch(Exception e) {
          msg = e.getMessage();
          
          mv.setViewName("displayeerror");
           mv.addObject("message",e);
        }
        
        return mv;
     
     
   }
   
   
   
   
   @GetMapping("action")
   public ModelAndView requestaction(@RequestParam("bname") String bname,@RequestParam("status") boolean status)
   {
	   ModelAndView mv=new ModelAndView();
	   int n=employeeService.updatestatus(bname, status);
	   mv.setViewName("viewallrequests");
	   List<BookRequests> br=employeeService.viewallBookRequests();
	   mv.addObject("reqdata", br);
	   if(n>0)
	    {
	      mv.addObject("message", "Request Updated and Sent to Let's learn Member !");
	    }
	    else
	    {
	      mv.addObject("message", "Request Rejected !");
	    }
	    
	    return mv;
	   
	 }
   
  


   
}

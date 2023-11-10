package com.klef.jfsd.springboot.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Book;
import com.klef.jfsd.springboot.model.BookRequests;
import com.klef.jfsd.springboot.model.Employee;
import com.klef.jfsd.springboot.model.Member;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.EmailManager;
import com.klef.jfsd.springboot.service.EmployeeService;
import com.klef.jfsd.springboot.service.MemberService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class ClientController
{
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private EmailManager emailManager;
	
   @GetMapping("/")	
   public ModelAndView index() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("index");
	   return mv;
   }
   
   @GetMapping("home")
   public ModelAndView homepage() {
	   ModelAndView mv=new ModelAndView("index");
	   return mv;
   }
   
   @GetMapping("updatebook")
   public ModelAndView updatebook(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView("updatebook");
	   HttpSession session = request.getSession();
       Integer empid = (Integer) session.getAttribute("empid"); // Retrieve empid as Integer
       mv.addObject("empid", empid); // Add empid as Integer to the ModelAndView
	   return mv;
   }
	
   @GetMapping("emplogin")
   public ModelAndView loginpage()
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("login");
	   return mv;
   }
   @GetMapping("memlogin")
   public ModelAndView memloginpage()
   {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("memlogin");
	   return mv;
   }
	
  @GetMapping("contactus")
  public ModelAndView contactus() {
	  ModelAndView mv=new ModelAndView("contactus");
	  return mv;
	  
  }
   
   @GetMapping("about")
   public ModelAndView aboutpage() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("about");
	   return mv;
   }
   
   @GetMapping("newarrivals")
   public ModelAndView newarrivalspage() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("newarrivals");
	   return mv;
   }
   
   @GetMapping("memberreg")
   public ModelAndView memberregistration() {
	   ModelAndView mv=new ModelAndView("memberreg");
	   return mv;
   }
   
   @GetMapping("forgotpassword")
   public ModelAndView forgotpassword() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("forgotPassword");
	   return mv;
   }
   
   
   
   @PostMapping("register")
   public ModelAndView register(HttpServletRequest request,@RequestParam("profile") MultipartFile file)throws IOException, SerialException, SQLException
   {
	   ModelAndView mv=new ModelAndView();
	       String msg=null;
	       String mid=request.getParameter("sid");
	       int id = Integer.parseInt(mid);
		   String name=request.getParameter("name");
		   String gender=request.getParameter("gender");
		   String username=request.getParameter("username");
		   String contact=request.getParameter("contact");
		   String email=request.getParameter("email");
		   String pwd=username;
		   
		   byte[] bytes = file.getBytes();
			  Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
		  
			    	Member mem=new Member();
			    	mem.setId(id);
			    	mem.setName(name);
			    	mem.setGender(gender);
			    	mem.setEmail(email);
			     	mem.setUsername(username);
			    	mem.setContactno(contact);
			    	mem.setPassword(username);
			    	mem.setImage(blob);			    	
			    	msg=memberService.memregistration(mem);
			    	String fileName = "invite.html"; // Correct file name
			    	String filePath = request.getServletContext().getRealPath("/" + fileName);
			    	
					String fromEmail = "mahikiran.b@gmail.com"; // Set your email
		            String toEmail = email; // Use the user's email from the booking
		            String subject = "Let's Learn Community!";
		            String text ="You are Welcome !  Successfully Registered with Let's Learn !!";
		            String password=" Your Account Password is "+ pwd +".  Kindly Don't share with anyone !";

		            String htmlContent = new String(Files.readAllBytes(Paths.get(filePath)));
		            htmlContent = htmlContent.replace("[name]", name);
		            htmlContent = htmlContent.replace("[text]", text);
		            htmlContent=htmlContent.replace("[password]", password);
	          
		            emailManager.sendEmail(fromEmail, toEmail, subject, text,htmlContent);
		            mv.setViewName("memlogin");
					mv.addObject("message", msg);
					
             
	
		   mv.setViewName("memberreg");
		   mv.addObject("message", msg);
		   
	  
	   return mv;
	   
   }
   
   
   @GetMapping("displayprofile")
   public ResponseEntity<byte[]> displayprofileimage(@RequestParam("id") int id) throws IOException, SQLException
   {
     Member mem =  memberService.viewmembyid(id);
     byte [] imageBytes = null;
     imageBytes = mem.getImage().getBytes(1,(int) mem.getImage().length());

     return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imageBytes);
   }

   
   
   
   
   
   
   @GetMapping("employeehome")
   public ModelAndView employeehome() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("employeehome");
	   return mv;
   }
   
   @GetMapping("bookbarrows")
   public ModelAndView bookbarrows() {
	   ModelAndView mv=new ModelAndView("bookbarrows");
	   return mv;
   }
   
   @GetMapping("addabook")
   public ModelAndView addabook(HttpServletRequest request) {
       ModelAndView mv = new ModelAndView("addabook");
       HttpSession session = request.getSession();
       Integer empid = (Integer) session.getAttribute("empid"); // Retrieve empid as Integer
       mv.addObject("empid", empid); // Add empid as Integer to the ModelAndView
       return mv;
   }
   
   @GetMapping("deletebook")
   public ModelAndView deletebook() {
	   ModelAndView mv=new ModelAndView("deletebook");
	   return mv;
   }
   
   @PostMapping("checkmemlogin")
   public ModelAndView checklogin(HttpServletRequest request)
   {
	   ModelAndView mv=new ModelAndView();
	   String email=request.getParameter("email");
	   String password=request.getParameter("password");
	   String userEnteredCaptcha = request.getParameter("captcha");
	   Member mem=memberService.checkmemberlogin(email, password);
	   HttpSession session =request.getSession();
	   String storedCaptcha = (String) session.getAttribute("captchaCode");
	    if(mem!=null && userEnteredCaptcha.equals(storedCaptcha))
	    {
		   session.setAttribute("memid", mem.getId());
		   session.setAttribute("memuname",mem.getUsername());
		   mv.setViewName("memberhome");
	   }
	   else {
		   mv.setViewName("memlogin");
		   mv.addObject("message", "Invalid Credentials !!");
	   }
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
   
   
   
   
   @GetMapping("book/{filename}")
   public ModelAndView viewbookDetails( @PathVariable("filename") String filename) {
	   ModelAndView mv=new ModelAndView();
      Book book=employeeService.getbookbyName(filename);
      
      if(book!=null) {
    	  mv.setViewName("bookdetails");
    	  mv.addObject("book", book);
    	  return mv;
      }
      else {
    	  String msg="Book Not Found";
    	  mv.setViewName("booknotfound");
    	  mv.addObject("book", msg);
      }
      
      return mv;
   }
   
   
   
   
   @GetMapping("/download/{filename}")
   public ResponseEntity<byte[]> downloadBook(@PathVariable("filename") String fileName) {
       Book book = employeeService.getbookbyName(fileName);

       if (book != null) {
           byte[] response = book.getBfileContent();
           return ResponseEntity.ok()
                   .contentType(MediaType.parseMediaType("application/pdf"))
                   .header(
                           HttpHeaders.CONTENT_DISPOSITION,
                           "attachment; filename=\"" + fileName +".pdf"+ "\""
                   )
                   .body(response);
       } else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
       }
   }
   
   

   @GetMapping("memberhome")
   public ModelAndView memberhome() {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("memberhome");
	   return mv;
   }
   
   
   @GetMapping("findabook")
   public ModelAndView findabook() {
	   ModelAndView mv=new ModelAndView("findabook");
	   return mv;
	   
   }
   
 
   @GetMapping("updateprofile")
   public ModelAndView updateProfile(HttpServletRequest request)
   {
     ModelAndView mv=new ModelAndView();
     mv.setViewName("updateprofile");

     HttpSession session=request.getSession();
     session.setAttribute("memid", session.getAttribute("memid"));
     
   
     int id=(int) session.getAttribute("memid");
     
     Member mem=memberService.viewmembyid(id);
     mv.addObject("memdata",mem);
     return mv;
   }
   
   
   @PostMapping("update")
   public ModelAndView updateAction(HttpServletRequest request){
       String msg = null;
       ModelAndView mv = new ModelAndView();
       HttpSession session = request.getSession();
       int id = (int) session.getAttribute("memid");

       try {
           String name = request.getParameter("name");
           String username = request.getParameter("username");
           String pwd = request.getParameter("pwd");
           String contactno = request.getParameter("contact");
           

           Member mem = new Member();
           mem.setId(id); 
           mem.setName(name);
           mem.setUsername(username);
           mem.setPassword(pwd);
           mem.setContactno(contactno);
          
           memberService.updateMember(mem);
           
           Member updatedMem = memberService.viewmembyid(id);
           
           session.setAttribute("memdata", updatedMem);
           
           mv.addObject("memdata", updatedMem);
           mv.addObject("message", "Profile Updated Successfully");
           mv.setViewName("updateprofile");

           return mv;
       } 
       catch (Exception e) {
           msg = e.getMessage();
           mv.setViewName("displayerror");
           mv.addObject("message", e);
           return mv;
       }
   }


   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   @GetMapping("requestabook")
   public ModelAndView requestabook(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView();
	   HttpSession session = request.getSession();
       Integer empid = (Integer) session.getAttribute("memid"); 
       mv.addObject("memid", empid); 
	   mv.setViewName("requestabook");
	   return mv;
   }
   
   @GetMapping("viewallbooks")
   public ModelAndView viewallbooks(@RequestParam(defaultValue = "1") int page,HttpServletRequest request) {
       ModelAndView mv = new ModelAndView();
       HttpSession session = request.getSession();
       Integer empid = (Integer) session.getAttribute("memid"); 
       mv.addObject("memid", empid); 
       int itemsPerPage = 8; // Number of products per page
       List<Book> allBooks = memberService.viewallbooks();
       int totalBooks = allBooks.size();
       int totalPages = (int) Math.ceil((double) totalBooks / itemsPerPage);

       // Calculate start and end index for the current page
       int startIndex = (page - 1) * itemsPerPage;
       int endIndex = Math.min(startIndex + itemsPerPage, totalBooks);
       
       // Get the subset of books for the current page
       List<Book> booksSubset = allBooks.subList(startIndex, endIndex);

       mv.setViewName("viewallbooks");
       mv.addObject("bdata", booksSubset); // Passing the subset of books to the view
       mv.addObject("currentPage", page);
       mv.addObject("totalPages", totalPages);
       return mv;
   }
   @GetMapping("admin")
   public ModelAndView adminlogin() {
	   ModelAndView mv=new ModelAndView("adminlogin");
	   return mv;
   }
   
   @GetMapping("adminhome")
   public ModelAndView adminhome(HttpServletRequest request) {
       ModelAndView mv=new ModelAndView();
	   HttpSession session = request.getSession();
       String uname = (String) session.getAttribute("uname"); 
       mv.addObject("uname", uname);   
     long ecount=adminService.empcount();
     long ccount=adminService.usercount();
     long  bcount=adminService.bookcount();
     long bookReqCount=adminService.bookrequestscount();
     
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
   public ModelAndView addemployee(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView();
	   HttpSession session = request.getSession();
       String uname = (String) session.getAttribute("uname"); 
       mv.addObject("uname", uname);   
	   mv.setViewName("addemployee");
	   return mv;
   }
   
   
   @GetMapping("viewallemps")
   public ModelAndView viewallemps(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView();
	   HttpSession session = request.getSession();
       String uname = (String) session.getAttribute("uname"); 
       mv.addObject("uname", uname);   
	   List<Employee> emplist=employeeService.viewallemployees();
	   mv.setViewName("deleteemp");
	   mv.addObject("emplist", emplist);
	  
	   return mv;
   }
   
   
   @GetMapping("adduser")
   public ModelAndView addMember1(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView();
	   HttpSession session = request.getSession();
       String uname = (String) session.getAttribute("uname"); 
       mv.addObject("uname", uname);   
	   mv.setViewName("adduser");
	   return mv;
   }
   
   @PostMapping("addemployee")
   public ModelAndView addemployeereg(HttpServletRequest request) {
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
	   emp.setStatus(true);
	   
	  String s= employeeService.addemployee(emp);
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
	   
	   
	  String msg=memberService.Addmember(mem);
	  mv.addObject("message", msg);
	  mv.setViewName("adduser");
	  return mv;
	   
   }
   
   
   @GetMapping("/delete/{id}")
   public String delete(@PathVariable("id") int id)
   {
	   
	   employeeService.deleteEmp(id);
	  
	   return "redirect:/viewallemps";
   }
   
   @GetMapping("deleteuser")
   public ModelAndView deleteuser(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView();
	   HttpSession session = request.getSession();
       String uname = (String) session.getAttribute("uname"); 
       mv.addObject("uname", uname);   
	   mv.setViewName("deleteuser");
	   return mv;
   }
   
   @PostMapping("delete")
   public ModelAndView deleteu(HttpServletRequest request) {
	   String id=request.getParameter("employeeId");
	   int eid=Integer.parseInt(id);
	   ModelAndView mv=new ModelAndView();
	   String msg=memberService.deleteUser(eid);
	   mv.setViewName("deleteuser");
	   mv.addObject("message",msg);
	   return mv;
   }

   @PostMapping("request")
   public ModelAndView requestBook(HttpServletRequest request) 
   {
	   ModelAndView mv=new ModelAndView("requestabook");
	   HttpSession session = request.getSession();
       int id = (int) session.getAttribute("memid");
       
       String bname=request.getParameter("bookName");
       String year=request.getParameter("year");
       String author=request.getParameter("author");
       String publisher=request.getParameter("publisher");
       Optional<BookRequests> obj=memberService.findbookbyname(bname);
       if(!obj.isPresent()) {
       BookRequests br=new BookRequests();
       br.setCid(id);
       br.setBookName(bname);
       br.setYear(year);
       br.setPublisher(publisher);
       br.setStatus(false);
       br.setAuthor(author);
       
       String msg=memberService.requestabook(br);
       mv.addObject("memid",id);
       mv.addObject("message", msg);
       }else {
           mv.addObject("memid",id);
           mv.addObject("message", "Request For Book is Already Sent Before !!");
       }
       return mv;
   }
   
   @GetMapping("viewallrequests")
   public ModelAndView viewallBookRequests(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView("viewallrequests");
	   HttpSession session=request.getSession();
       Integer empid = (Integer) session.getAttribute("empid"); // Retrieve empid as Integer
	   List<BookRequests> br=memberService.viewallBookRequests();
	   mv.addObject("reqdata", br);
	   return mv;
   }
   
   
   
   

   @GetMapping("updateemployee")
   public ModelAndView updateemployee(HttpServletRequest request) {
     ModelAndView mv=new ModelAndView();
     mv.setViewName("updateemployee");
     HttpSession session = request.getSession();
     Integer empid = (Integer) session.getAttribute("empid"); // Retrieve empid as Integer
     
     mv.addObject("empid", empid); // Add empid as Integer to the ModelAndView
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
	   List<BookRequests> br=memberService.viewallBookRequests();
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
   
   @GetMapping("viewmyrequests")
   public ModelAndView viewmyrequests(HttpServletRequest request) {
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("viewmyrequests");
	   HttpSession session =request.getSession();
	   session.setAttribute("mid",session.getAttribute("memid"));
       int id = (int) session.getAttribute("mid");
	   List<BookRequests> br=memberService.viewallBookRequestsbyid(id);
	   mv.addObject("reqdata", br);
	   return mv;
	   
   }
   
  
   @GetMapping("empaction")
   public ModelAndView empaction(@RequestParam("employee_id") int eid,@RequestParam("employee_status") boolean status)
   {
	   ModelAndView mv=new ModelAndView();
	   int n=employeeService.updateempstatus(eid, status);
	   mv.setViewName("deleteemp");
	   List<Employee> br=employeeService.viewallemployees();
	   mv.addObject("emplist", br);
	   if(n>0)
	    {
	      mv.addObject("message", "Employee Status Updated !!");
	    }
	  
	    
	    return mv;
	   
	 }
   
   
   
   
   @GetMapping("emplogout")
   public String emplogout(HttpServletRequest request, HttpServletResponse response) {
       request.getSession().invalidate();
       return "redirect:/emplogin"; 
   }
   
   
   @GetMapping("memlogout")
   public String memlogout(HttpServletRequest request, HttpServletResponse response) {
       // Invalidate session and redirect to login page
       request.getSession().invalidate();
       return "redirect:/memlogin"; // Redirect to your login page URL
   }
  
   
   @GetMapping("adminlogout")
   public String adminlogout(HttpServletRequest request, HttpServletResponse response) {
       // Invalidate session and redirect to login page
       request.getSession().invalidate();
       return "redirect:/admin"; // Redirect to your login page URL
   }
   
   
   @PostMapping("updatebookdata")
   public ModelAndView updateBookData(HttpServletRequest request) {
       ModelAndView mv = new ModelAndView();
       String msg = "";

       try {
           String bId = request.getParameter("bookId");
           int bookId = Integer.parseInt(bId);
           String bookName = request.getParameter("bookName");
           String year = request.getParameter("year");
           String author = request.getParameter("author");
           String publisher = request.getParameter("publisher");

           Book updatedBook = new Book();
           updatedBook.setBid(bookId);
           updatedBook.setBname(bookName);
           updatedBook.setByear(year);
           updatedBook.setBauthor(author);
           updatedBook.setBpublisher(publisher);

           String result = employeeService.updateBook(updatedBook);

           mv.addObject("bookData", updatedBook);
           mv.setViewName("updatebook");
           mv.addObject("message", result);
       } catch (Exception e) {
         msg = e.getMessage();
           
           mv.setViewName("displayerror");
            mv.addObject("message",e);
       }

       return mv;
   }
  
   

   
}

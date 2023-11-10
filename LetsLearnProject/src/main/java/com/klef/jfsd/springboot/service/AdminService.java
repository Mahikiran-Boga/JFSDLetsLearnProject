package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Employee;

public interface AdminService {
public Admin checkadminlogin(String email,String pwd );
public long empcount();
public long usercount();
public long bookcount();
//public long countBookRequestsR();
//public long countBookRequestsA();
public long bookrequestscount();



}

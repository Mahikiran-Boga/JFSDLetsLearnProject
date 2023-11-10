package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.klef.jfsd.springboot.model.BookRequests;
@Repository
public interface BookRequestsRepository extends JpaRepository<BookRequests, String>{
	
	   @Query("update BookRequests set Status=?1 where bookName=?2")
	   @Modifying
	   @Transactional
	   public int updatestatus(boolean status,String bname);
	   
	   @Query("select b from BookRequests b where cid=?1")
	   public List<BookRequests> viewallbookrequestsbyid(int mid);
	   
	   @Query("select count(*) from BookRequests where Status=false")
	   public Long countBookRequestsR();
	   
	   @Query("select count(*) from BookRequests where Status=true")
	   public Long countBookRequestsA();
	   
	   

}

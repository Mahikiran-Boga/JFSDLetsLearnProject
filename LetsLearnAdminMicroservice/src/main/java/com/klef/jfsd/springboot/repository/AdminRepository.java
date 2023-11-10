package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.klef.jfsd.springboot.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>
{
	 @Query("select a from Admin a where email=?1 and password=?2")
     public Admin checkadminlogin(String email,String password);
	 
	 
	   @Query("update Employee e set e.status=?2 where e.id=?1")
	   @Modifying
	   @Transactional
	   public int updateempstatus(int eid ,boolean status);
}

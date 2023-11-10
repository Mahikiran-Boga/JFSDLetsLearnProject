package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>
{
	@Query("select m from Member m where email=?1 and password=?2")
	public Member checkmemberlogin(String email,String password);
	
	
	

}

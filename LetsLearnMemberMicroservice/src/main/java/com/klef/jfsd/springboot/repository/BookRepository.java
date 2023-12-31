package com.klef.jfsd.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>
{
	@Query("select b from Book b where b.bname=?1")
	public Book getBookbyName(String bookName);
	@Query("select b.bid,b.bname,b.bauthor,b.bpublisher,b.byear,b.bfileContent from Book b")
	public List<Book> viewallbooks();
	
}

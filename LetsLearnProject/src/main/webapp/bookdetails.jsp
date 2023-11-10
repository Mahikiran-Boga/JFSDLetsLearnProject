<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Book ID:${book.bid}</h1>
<h1>Book Name:${book.bname}</h1>
<h1>Book Author:${book.bauthor}</h1>

<a href="/download/${book.bname}">Click to Download</a>


 

</body>
</html>
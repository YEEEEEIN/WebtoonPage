<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<!-- 왼쪽 div -->
			<div class="d-flex">
				<a class="navbar-brand" href="<c:url value="/home"/>">홈</a> 
				<a class="navbar-brand" href="<c:url value="/webtoons"/>">웹툰 목록</a> 
				<a class="navbar-brand" href="<c:url value="/webtoons/add"/>">웹툰 등록</a>
			</div>

			<div class="d-flex">
				<div class="form-inline">
					<form class="form-inline" role="search" action="/controller/webtoons/webtoon">
						<input class="form-control me-2" name="name" type="search" placeholder="웹툰 제목을 입력하세요" aria-label="검색" />
						<button class="btn btn-outline-success" type="submit">검색</button>
					</form>
				</div>
			
				<button type="button" class="btn btn-outline-success">로그인</button>
			</div>
		</div>
	</nav>

	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">${hello}</h1>
		</div>
	</div>

	<div class="container">
		<div class="text-center">
			<h3>${strapline}</h3>
		</div>
	</div>
	
	<footer class="container">
	<hr>
	<p>&copy; Webtoon</p>
	</footer>
	

</body>
</html>
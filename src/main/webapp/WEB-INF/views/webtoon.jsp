<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
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
				<a class="navbar-brand" href="<c:url value="./add"/>">웹툰 등록</a>
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
			<h1 class="display-3">웹툰 정보</h1>
		</div>
	</div>

	<div class="container">
		<div class="row">
				<div class="col-md-12">				
					<p><img src=${pageContext.request.contextPath}/resources/img/${webtoon.imagPath } ></p>			
					<h3>${webtoon.name}</h3>
					<p>${webtoon.description}
					<br>
					<p><b>웹사이트: </b><span class = "badge badge-info">${webtoon.website}</span>
					<p><b>작가명: </b>${webtoon.author}
					<p><b>개봉요일: </b>${webtoon.releaseDay} 
					<p><b>장르: </b>${webtoon.genre}
					<p><b>순위: </b>${webtoon.ranking} 
					<p><b>좋아요 수: </b>${webtoon.hits} 
					<br>
					<br>
					<a href="<c:url value="/webtoons"/>" class="btn btn-secondary">웹툰 목록 &raquo;</a>
				</div>
		</div>
		<hr>
		<footer> <p> &copy; Book INFO </p> </footer>
	</div>
</body>
</html>
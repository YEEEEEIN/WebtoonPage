<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>웹툰 목록</title>

  <style>
        /* 사용자 이름 스타일 */
        .username {
            color: white;
            font-weight: bold;
            margin-right: 10px;
        }
    </style>
    
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
				
				 	<div class="d-flex">
            <sec:authorize access="isAuthenticated()">
                <!-- 사용자가 인증된 경우 로그인 정보를 표시 -->
                <p class="username">사용자 <sec:authentication property="principal.username" />님이 로그인하셨습니다.</p>
                <!-- 로그아웃 버튼 표시 -->
                <form class="form-inline" action="${pageContext.request.contextPath}/logout" method="GET">
                    <button class="btn btn-outline-success" type="submit">로그아웃</button>
                </form>
            </sec:authorize>
            <sec:authorize access="isAnonymous()">
                <!-- 사용자가 인증되지 않은 경우 로그인 버튼 표시 -->
                <a class="btn btn-outline-success" href="${pageContext.request.contextPath}/login">로그인</a>
            </sec:authorize>
        </div>
		</div>
	</nav>

	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">웹툰 목록</h1>
		</div>
	</div>

	<div class="container">
		<div class="row" align="center">
			<c:forEach items="${webtoonList }" var="webtoon">
				<div class="col-md-4">
					<p><img src=${pageContext.request.contextPath}/resources/img/${webtoon.imagPath } ></p>
					<a href="/controller/webtoons/webtoon?name=${webtoon.name}">
					    <h3>${webtoon.name}</h3>
					</a>
					<p>${webtoon.author}
						<br> ${webtoon.releaseDay} | ${webtoon.ranking}위 | ${webtoon.genre}
					<p align=left>${fn:substring(webtoon.description, 0, 70)}
						...
						<!-- 길이가 60 이상이면 ...으로 줄여라 -->
					<br>
					<br>
				</div>
			</c:forEach>

		</div>
	</div>
	<footer class="container">
		<hr>
		<p>&copy; Webtoon</p>
	</footer>

    
</body>
</html>
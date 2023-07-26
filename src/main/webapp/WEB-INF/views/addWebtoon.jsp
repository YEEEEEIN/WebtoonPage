<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<link href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>insert book</title>
</head>
<body>

	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<!-- 왼쪽 div -->
			<div class="d-flex">
				<a class="navbar-brand" href="<c:url value='/home'/>">홈</a> 
				<a class="navbar-brand" href="<c:url value='/webtoons'/>">웹툰 목록</a> 
				<!--  <a class="navbar-brand" href="/controller/webtoons">웹툰 목록</a> -->
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
   
   <!-- 전광판 -->
   <div class="jumbotron">
      <div class="container">
         <h1 class="display-3">웹툰 등록</h1>
      </div>
   </div>
   
   <div class="container">
   	<form:form modelAttribute="NewWebtoon" class="form-horizontal" enctype="multipart/form-data">
      <fieldset>
      <legend>${addTitle}</legend>
         
         <div class="form-group row">
            <label class="col-sm-2 control-label">웹툰명</label>
            <div class="col-sm-3">
               <form:input path="name" class="form-control" />
            </div>
         </div>

				<div class="form-group row">
					<label class="col-sm-2 control-label">이미지 업로드</label>
					<div class="col-sm-3">
						<form:input path="file" type="file" class="form-control" />
					</div>
				</div>

				<div class="form-group row">
            <label class="col-sm-2 control-label">웹사이트</label>
            <div class="col-sm-3">
               <form:input path="website" class="form-control" />
            </div>
         </div>
         
         <div class="form-group row">
            <label class="col-sm-2 control-label">작가명</label>
            <div class="col-sm-3">
               <form:input path="author" class="form-control" />
            </div>
         </div>
         
         <div class="form-group row">
            <label class="col-sm-2 control-label">상세설명</label>
            <div class="col-sm-3">
               <form:textarea path="description" cols="50" rows="3" class="form-control" />
            </div>
         </div>
         
         <div class="form-group row">
            <label class="col-sm-2 control-label">개봉요일</label>
            <div class="col-sm-3">
               <form:input path="releaseDay" class="form-control" />
            </div>
         </div>
         
         <div class="form-group row">
            <label class="col-sm-2 control-label">장르</label>
            <div class="col-sm-3">
               <form:input path="genre" class="form-control" />
            </div>
         </div>
         
         <div class="form-group row">
            <label class="col-sm-2 control-label">순위</label>
            <div class="col-sm-3">
               <form:input path="ranking" class="form-control" />
            </div>
         </div>
         
         <div class="form-group row">
            <label class="col-sm-2 control-label">좋아요</label>
            <div class="col-sm-3">
               <form:input path="hits" class="form-control" />
            </div>
         </div>
  
         <div class="form-group row">
            <div class="col-sm-offset-2 col-sm-10">
               <input type="submit" class="btn btn-primary" value="등록" />
            </div>
         </div>
      
      
      </fieldset>
      
      </form:form>
      
      <hr>
      <footer>
         <p>&copy; Book Market</p>
      </footer>
   </div>

</body>
</html>
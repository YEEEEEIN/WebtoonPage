package com.kopo.domain;

import org.springframework.web.multipart.MultipartFile;

/*
도메인: 데이터 모델, 객체 정보 저장

퍼시스턴스 계층: 데이터 액세스 계층, 데이터 처리

서비스 계층: 비즈니스 계층, 애플리케이션이 제공하는 전반적 서비스를 처리, 프레젠테이션 계층과 퍼시스턴스 계층을 연결하는 역할

프레젠테이션 계층: 애플리케이션 최종 접점
- 사용자 에게 데이터를 입력받거나, 결과를 웹으로 전달해주는 계층
- 처리 & 결과 담당
 */
public class Webtoon {
	private String name; // 웹툰명
	private String imagPath; // 이미지 경로
	private String author; // 작가명
	private String website; // 웹사이트
	private String releaseDay; // 개봉요일
	private String genre; // 장르
	private String description; // 상세설명
	private String ranking; // 순위
	private int hits; // 좋아요 수
	private MultipartFile file;	// 이미지 파일
	
	public Webtoon(String name, String imagPath) { // 일반생성자
		super();
		this.name = name;
		this.imagPath = imagPath;
	}
	
	public Webtoon() { // 기본생성자
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagPath() {
		return imagPath;
	}
	public void setImagPath(String imagPath) {
		this.imagPath = imagPath;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public String getReleaseDay() {
		return releaseDay;
	}
	public void setReleaseDay(String releaseDay) {
		this.releaseDay = releaseDay;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}



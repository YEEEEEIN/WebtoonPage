package com.kopo.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kopo.domain.Webtoon;

public interface WebtoonRepository {
	// 전체 웹툰 목록 반환
	List<Webtoon> getAllWebtoonList();
	
	// 매개변수와 동일한 종류의 웹툰만 반환 - 요일별
	List<Webtoon> getWebtoonListByReleaseDay(String releaseDay);

	// website & releaseDay 가 동일한 웹툰만 반환
	// EX url) localhost:8080/controller/books/filter/bookFilter;publisher=네이버;category=IT전문서 ---> 수정해야 함
	// 위 URL을 입력하면 부합하는 목록만 반환되도록 개발
	Set<Webtoon> getWebtoonListByFilter(Map<String, List<String>> filter);
	
	// 웹툰 이름을 입력하면 해당 단어가 들어있는 웹툰 목록 반환
	Webtoon getWebtoonByName(String name);
	
	// 새로운 웹툰 등록
	void setNewWebtoon(Webtoon webtoon);
}

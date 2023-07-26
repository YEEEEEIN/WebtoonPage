package com.kopo.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kopo.domain.Webtoon;
import com.kopo.repository.WebtoonRepository;

@Service
public class WebtoonServiceImpl implements WebtoonService {
	
	@Autowired // WebtoonRepository에 자동으로 연결 -> getter,setter 사용 안해도 됨
	private WebtoonRepository webtoonRepository;
	
	/*
	 @Autowired 애너테이션을 사용하지 않을 경우 setter을 정의해줘야 함
	 
	 public void setWebtoonRepository(WebtoonRepository webtoonRepository){
	 	this.webtoonRepository = webtoonRepository;
	 }
	 */
	
	@Override
	public List<Webtoon> getAllWebtoonList() {
		return webtoonRepository.getAllWebtoonList();
	}

	@Override
	public List<Webtoon> getWebtoonListByReleaseDay(String releaseDay) {
		List<Webtoon> webtoonsByReleaseDay = webtoonRepository.getWebtoonListByReleaseDay(releaseDay);
		return webtoonsByReleaseDay;
	}

	@Override
	public Set<Webtoon> getWebtoonListByFilter(Map<String, List<String>> filter) {
		Set<Webtoon> webtoonByFilter = webtoonRepository.getWebtoonListByFilter(filter);
		return webtoonByFilter;
	}

	@Override
	public Webtoon getWebtoonByName(String name) {
		Webtoon webtoonName = webtoonRepository.getWebtoonByName(name);
		return webtoonName;
	}

	@Override
	public void setNewWebtoon(Webtoon webtoon) {
		webtoonRepository.setNewWebtoon(webtoon);
	}
}

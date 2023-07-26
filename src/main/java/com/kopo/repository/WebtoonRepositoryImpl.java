package com.kopo.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.kopo.domain.Webtoon;

@Repository
public class WebtoonRepositoryImpl implements WebtoonRepository {
	private List<Webtoon> listOfWebtoons = new ArrayList<Webtoon>();
	
	public WebtoonRepositoryImpl() {
		Webtoon Webtoon1 = new Webtoon("소녀의 세계", "img1.jpg");
		Webtoon1.setWebsite("naver");
		Webtoon1.setAuthor("모랑지");
		Webtoon1.setReleaseDay("월요일");
		Webtoon1.setGenre("드라마");
		Webtoon1.setDescription("완벽해 보이지만 사실 외로웠던 백조들과 맘씨 착한 오리가 만나 여러 갈등을 함께 겪으며 진짜 친구가 되어가는 소녀들의 찐 우정물");
		Webtoon1.setRanking("2");
		Webtoon1.setHits(1125218);
		
		Webtoon Webtoon2 = new Webtoon("마루는 강쥐", "img2.jpg");
		Webtoon2.setWebsite("naver");
		Webtoon2.setAuthor("모죠");
		Webtoon2.setReleaseDay("화요일");
		Webtoon2.setGenre("개그");
		Webtoon2.setDescription("우리 집 강아지 마루가 사람이 되었다, 그것도 5살 아이로! 강아지 + 어린아이의 무한 에너지와 호기심을 지닌 사고뭉치 강쥐 탄생! 마루야~! 또 어디가!!! 유쾌한 이웃들과 우당탕탕 즐거운 마루의 나날들");
		Webtoon2.setRanking("1");
		Webtoon2.setHits(475559);	
		
		Webtoon Webtoon3 = new Webtoon("내가 죽기로 결심한 것은", "img3.jpg");
		Webtoon3.setWebsite("naver");
		Webtoon3.setAuthor("YUJU");
		Webtoon3.setReleaseDay("수요일");
		Webtoon3.setGenre("로맨스");
		Webtoon3.setDescription("태권도 국가대표 선발전을 앞두고 부상을 입은 고3 지오는 뒤늦은 사춘기를 맛보는 중이다.  온갖 찌질한 생각이 드는 와중에 만나게 된 차결은 살랑살랑 웃어대며 지오를 완전히 홀려 버리는데, 맘 놓고 홀리기엔 차결의 주변 사람들이 어쩐지 위험하다.  머리로는 경계해야 하는 걸 알지만, 결을 향한 관심은 멈출 수가 없다. 얘… 좋아해도 되는 걸까?");
		Webtoon3.setRanking("4");
		Webtoon3.setHits(609198);
		
		Webtoon Webtoon4 = new Webtoon("신혼일기", "img4.jpg");
		Webtoon4.setWebsite("naver");
		Webtoon4.setAuthor("자까");
		Webtoon4.setReleaseDay("목요일");
		Webtoon4.setGenre("일상");
		Webtoon4.setDescription("이젠 갠플이 아니라 팀플이다! 조별 과제와 차원이 다른 인생을 건 팀플이 시작된다. 1인가구에서 2인가구로 성장한 자까 작가의 결혼 이야기.");
		Webtoon4.setRanking("1");
		Webtoon4.setHits(282279);
		
		Webtoon Webtoon5 = new Webtoon("재혼 황후", "img5.jpg");
		Webtoon5.setWebsite("naver");
		Webtoon5.setAuthor("히어리");
		Webtoon5.setReleaseDay("금요일");
		Webtoon5.setGenre("로맨스");
		Webtoon5.setDescription("동대제국의 완벽한 황후였던 나비에. ​황제인 남편이 정부를 황후로 만들려는 것을 알고 이혼을 택한다. 그리고 결심한다. 이곳에서 황후가 될 수 없다면 다른 곳에서 황후가 되겠다고. 인기 웹소설 '재혼 황후'가 웹툰화되다!");
		Webtoon5.setRanking("1");
		Webtoon5.setHits(922803);
		
		Webtoon Webtoon6 = new Webtoon("세레나", "img6.jpg");
		Webtoon6.setWebsite("naver");
		Webtoon6.setAuthor("정이나");
		Webtoon6.setReleaseDay("토요일");
		Webtoon6.setGenre("로맨스");
		Webtoon6.setDescription("\"너는 절대로 내 세레니티의 주인이 될 수 없어.\" 세레니티 가문의 유일한 상속자가 된 세레나. 위태로워진 가문을 살리기 위해, 그녀의 할머니는 그녀를 왕국에서 가장 증오하는 남자와 결혼시켜버렸다. 무너져가던 세레나를 위로할 수 있는 건 오직 그녀의 애첩 프리드릭 뿐. 아름답고 찬란했던 세레니티의 그 여름날, 뜨거운 증오와 사랑으로 얽혀버린 세 사람의 이야기.");
		Webtoon6.setRanking("1");
		Webtoon6.setHits(361115);
		
		Webtoon Webtoon7 = new Webtoon("자매전쟁", "img7.jpg");
		Webtoon7.setWebsite("naver");
		Webtoon7.setAuthor("기맹기");
		Webtoon7.setReleaseDay("일요일");
		Webtoon7.setGenre("드라마");
		Webtoon7.setDescription("단 하나로 인정받고 싶었던 두 소녀, 예술고등학교 1등과 2등을 앞다투는 '원리온'과 '추해라'. '진짜'가 되기 위한 천재 소녀들의 치명적인 전쟁이 시작된다.");
		Webtoon7.setRanking("2");
		Webtoon7.setHits(314300);
		
		Webtoon Webtoon8 = new Webtoon("소녀재판", "img8.jpg");
		Webtoon8.setWebsite("naver");
		Webtoon8.setAuthor("루즌아");
		Webtoon8.setReleaseDay("일요일");
		Webtoon8.setGenre("드라마");
		Webtoon8.setDescription("학교에서 아무것도 아니었던 소녀의 예측불허 재판이 시작된다! 평범한 박가을은 소위 '잘나가는 그룹'에 속하는 한유현의 비밀스러운 사건을 목격하고 이를 이용해 한유현을 협박해서 본인이 동경했던 그룹에 속하고 싶어하는데...");
		Webtoon8.setRanking("5");
		Webtoon8.setHits(377713);
		
		Webtoon Webtoon9 = new Webtoon("백수세끼", "img9.jpg");
		Webtoon9.setWebsite("naver");
		Webtoon9.setAuthor("치즈");
		Webtoon9.setReleaseDay("월요일");
		Webtoon9.setGenre("드라마");
		Webtoon9.setDescription("백수 시절 내 곁을 지켜줬던 그녀... 돌아와 주면 안 되겠니? 음식 메뉴마다 담겨 있는 우리들의 연애 흑역사!");
		Webtoon9.setRanking("5");
		Webtoon9.setHits(478389);
			
		listOfWebtoons.add(Webtoon1);
		listOfWebtoons.add(Webtoon2);
		listOfWebtoons.add(Webtoon3);
		listOfWebtoons.add(Webtoon4);
		listOfWebtoons.add(Webtoon5);
		listOfWebtoons.add(Webtoon6);
		listOfWebtoons.add(Webtoon7);
		listOfWebtoons.add(Webtoon8);
		listOfWebtoons.add(Webtoon9);	
	}
	
	@Override
	public List<Webtoon> getAllWebtoonList() {
		return listOfWebtoons;
	}
	
	@Override
	public List<Webtoon> getWebtoonListByReleaseDay(String releaseDay) {
		List<Webtoon> webtoonsByReleaseDay = new ArrayList<Webtoon>();
		for (int i = 0; i < listOfWebtoons.size(); i++) {
			Webtoon webtoon = listOfWebtoons.get(i);
			if (releaseDay.equalsIgnoreCase(webtoon.getReleaseDay()))
				webtoonsByReleaseDay.add(webtoon);
		}
		return webtoonsByReleaseDay;
	}
	// 구현중
	@Override
	public Set<Webtoon> getWebtoonListByFilter(Map<String, List<String>> filter) {
		// website & genre 가 동일한 웹툰만 반환
		Set<Webtoon> webtoonsByWebsite = new HashSet<Webtoon>();
		Set<Webtoon> webtoonsByReleaseDay = new HashSet<Webtoon>();
		
		Set<String> webtoonsByFilter = filter.keySet();
		
		if (webtoonsByFilter.contains("website")) {
			for (int i = 0; i < filter.get("website").size(); i++) {
				String websiteStr = filter.get("website").get(i);
				for (int j = 0; j < listOfWebtoons.size(); j++) {
					Webtoon webtoon = listOfWebtoons.get(j);
					
					if (websiteStr.equalsIgnoreCase(webtoon.getWebsite())) {
						webtoonsByWebsite.add(webtoon);
					}
				}
			}
			
			if (webtoonsByFilter.contains("releaseDay")) {
				for (int i = 0; i < filter.get("releaseDay").size(); i++) {
					String releaseDayStr = filter.get("releaseDay").get(i);
					List<Webtoon> list = getWebtoonListByReleaseDay(releaseDayStr); // 만들어 놓은 메서드 활용
					webtoonsByReleaseDay.addAll(list);
				}
			}
			webtoonsByReleaseDay.retainAll(webtoonsByWebsite);
		}
		return webtoonsByReleaseDay;
	}

	@Override
	public Webtoon getWebtoonByName(String name) {
		Webtoon webtoonInfo = null;
		for(int i = 0; i < listOfWebtoons.size(); i++) {
			Webtoon webtoon = listOfWebtoons.get(i);
			if(webtoon != null && webtoon.getName() != null && webtoon.getName().contains(name)) {
				webtoonInfo = webtoon;
				break;
			}
		}
		
		if(webtoonInfo == null) {
			throw new IllegalArgumentException("관련된 도서를 찾을 수 없습니다 : " + webtoonInfo);
		}
		return webtoonInfo;
	}

	@Override
	public void setNewWebtoon(Webtoon webtoon) {
		listOfWebtoons.add(webtoon);
		
	}

}

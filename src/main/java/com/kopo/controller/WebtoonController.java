package com.kopo.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kopo.domain.Webtoon;
import com.kopo.service.WebtoonService;

@Controller
@RequestMapping("/webtoons")
public class WebtoonController {
	@Autowired
	private WebtoonService webtoonService;
	
	@RequestMapping
	public String requestWebtoonList(Model model) {
		List<Webtoon> list = webtoonService.getAllWebtoonList();
		model.addAttribute("webtoonList", list);
		return "webtoons";
	
	}
	
	@GetMapping("/all")
	public String requestAllWebtoon(Model model) {
		List<Webtoon> list = webtoonService.getAllWebtoonList();
		model.addAttribute("webtoonList", list);
		return "webtoons";
	}	

	
	/*
	// @GetMapping("/webtoons/{category}/publisher/{publisher}")
	// requestMethod(@PathVariable String category, => 넘어온 경로변수를 활용
	@GetMapping("/{releaseDay}")
	public String requestWebtoonsByReleaseDay(@PathVariable("releaseDay") String webtoonReleaseDay, Model model) {
		List<Webtoon> webtoonsByReleaseDay = webtoonService.getWebtoonListByReleaseDay(webtoonReleaseDay);
		model.addAttribute("bookList", webtoonsByReleaseDay);
		return "webtoons";
	}
	
	// localhost:8080/controller/books/filter/bookFilter;publisher=네이버;category=IT전문서
	@GetMapping("/filter/{webtoonFilter}")
	public String requestWebtoonsByFilter(@MatrixVariable(pathVar = "webtoonFilter") Map<String, List<String>> webtoonFilter, Model model) {
		Set<Webtoon> webtoonsByFilter = webtoonService.getWebtoonListByFilter(webtoonFilter);
		model.addAttribute("webtoonList", webtoonsByFilter);
		return "webtoons";
	}
	*/
	
	
	@GetMapping("/webtoon")
	public String requestWebtoonByName(@RequestParam("name") String webtoonName, Model model) {
		Webtoon webtoonByName = webtoonService.getWebtoonByName(webtoonName);
		model.addAttribute("webtoon", webtoonByName);
		return "webtoon";
	}

	@GetMapping("/add")
	// public String requestAddBookForm(Book book) {
	public String requestAddWebtoonForm(@ModelAttribute("NewWebtoon") Webtoon webtoon) {
		 /*
		 * 네비게이션 바, jumbotron, footer 적용한 jsp 페이지 만들기 bookid name unitprice author
		 * description <- textarea publisher category unitinstock releaseDate condition
		 * <- radiobutton
		 */
		return "addWebtoon";
	}

	@PostMapping("/add")
	public String submitAddNewWebtoon(@ModelAttribute("NewWebtoon") Webtoon webtoon, @RequestParam("file") MultipartFile file) {
		// 이미지 파일을 저장할 경로 설정
	    String uploadDir = "C:\\Users\\예인\\sts_workspace\\WebtoonPage\\src\\main\\webapp\\resources\\img\\";
	    
		try {
			// 파일을 지정된 경로에 저장
			String fileName = file.getOriginalFilename();
			File f = new File(uploadDir + fileName);
			file.transferTo(f);

			// 이미지 파일 경로를 웹툰 객체에 저장
			String imageUrl = fileName;
			webtoon.setImagPath(imageUrl);

			// 웹툰 등록 서비스 호출
			webtoonService.setNewWebtoon(webtoon);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "redirect:/webtoons";

	}

		/*
		 * 1. redirect - 요청 URL로 응답 뷰를 이동 - 이때 이동할 URL에 다시 요청을 시도 -> 최초 요청은 무효 : 폼에서
		 * 데이터를 입력받는 시스템, 세션 DB에 변화가 생가는 요청
		 * 
		 * 2. forward - 최초 요청 URL을 유지 -> 응답 뷰 페이지를 표현 - 현재 페이지에서 이동할 URL로 정보가 그대로 전달 ->
		 * 최초 요청 정보가 유효 - 실제 웹페이지가 변경됐지만 사용자는 알 수 없음 : 시스템 변화가 없는 단순 조회, 등등 사용
		 * 
		 */
	

	@ModelAttribute
	public void addAttribute(Model model) {
		model.addAttribute("addTitle", "신규 웹툰 등록");
	}
	
	

}

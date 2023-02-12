package com.eunmi.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eunmi.board.vo.BoardVO;
import com.webjjang.util.PageObject;

// 자동 생성 - @Controller, @Service, @repository, @Component, 
//			@RestController - Ajax, @Advice - 예외처리
//		단, servlet-context.xml에서 component-scan 태그에서 base-package안에 작성되어 있어야 한다.
@Controller
@RequestMapping("/board")
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);

	private Board 
	
	// 게시판 리스트
	@GetMapping("/list.do")
	public String list(PageObject pageObject) throws Exception {
		log.info("게시판 리스트 처리");
		return "board/list";
	}

	// 게시판 글보기
	@GetMapping("/view.do")
	public String view(long no, int inc) throws Exception {
		log.info("게시판 글보기 - no : " + no + ", inc : " + inc);
		return "board/view";
	}

	// 게시판 글쓰기 폼
	@GetMapping("/write.do")
	public String writeForm() throws Exception {
		log.info("게시판 글쓰기 폼");
		return "board/write";
	}

	// 게시판 글쓰기 처리
	@PostMapping("/write.do")
	public String write(BoardVO vo) throws Exception {
		log.info("게시판 글쓰기 처리 - vo : " + vo);
		return "redirect:list.do";
	}

	// 게시판 글수정 폼
	@GetMapping("/update.do")
	public String updateForm(long no) throws Exception {
		log.info("게시판 수정 처리 - no : " + no);
		return "board/update";
	}

	// 게시판 글수정 처리
	@PostMapping("/update.do")
	public String update(BoardVO vo) throws Exception {
		log.info("게시판 수정 처리 - vo : " + vo);
		return "redirect:view.do?no=10&inc=0";
	}

	// 게시판 글삭제
	@GetMapping("/delete.do")
	public String delete(long no) throws Exception {
		log.info("게시판 글삭제 처리 - no : " + no);
		return "redirect:list.do";
	}

}

package com.eunmi.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webjjang.util.PageObject;

// 자동 생성 - @Controller, @Service, @repository, @Component, 
//			@RestController - Ajax, @Advice - 예외처리
//		단, servlet-context.xml에서 component-scan 태그에서 base-package안에 작성되어 있어야 한다.
@Controller
@RequestMapping("/board")
public class BoardController {
	
	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@GetMapping("/list.do")
	public String list(PageObject pageObject) throws Exception {
		
		log.info("게시판 리스트 처리");
		
		return "board/list";
	}
	
	@GetMapping("/write.do")
	public String write(PageObject pageObject) throws Exception {
		
		log.info("게시판 리스트 처리");
		
		return "board/write";
	}
	
}

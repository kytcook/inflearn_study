package com.eunmi.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.eunmi.myspace.Service;
import com.webjjang.util.PageObject;

public class BoardListServiceImpl implements Service{

	private static final Logger log = LoggerFactory.getLogger(BoardListServiceImpl.class);
	
	@Override
	public Object service(Object obj) throws Exception {

		PageObject pageObject = (PageObject) obj;
		
		log.info("pageObject - " + pageObject);
		
		return null;
	}

}

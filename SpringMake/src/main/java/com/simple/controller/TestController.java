package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String home() {
		
		return "/WEB-INF/jsp/home.jsp";
		//디스패처 서블릿으로 돌아갈 경로
				//"화면의 경로가 들어갈수있슴. 직접 적을수있슴";
	}
	
	
	
	
	
}

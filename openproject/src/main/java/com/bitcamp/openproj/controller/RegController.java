package com.bitcamp.openproj.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.openproj.model.Member;
import com.bitcamp.openproj.service.MemberRegService;

@Controller
@RequestMapping("/regform")
public class RegController {

	@Inject
	private MemberRegService regService;
	
	@RequestMapping(method=RequestMethod.GET) 
	public String memberregform() {		
		return "member/regform";
	}
	

	@RequestMapping(method=RequestMethod.POST) 
	public String memberReg(HttpServletRequest request) {
		
		Member member = new Member();
		member.setEmail(request.getParameter("email"));
		member.setPassword(request.getParameter("password"));
		member.setName(request.getParameter("name"));
		
		regService.memberReg(member);
				
		return "member/insert";
	}
}

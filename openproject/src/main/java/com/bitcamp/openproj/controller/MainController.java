package com.bitcamp.openproj.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.openproj.model.Member;
import com.bitcamp.openproj.service.MemberRegService;
import com.bitcamp.openproj.service.MemberViewService;

@Controller
public class MainController {
	
	@Inject
	private MemberRegService regService;
	
	@Inject
	private MemberViewService viewService;	
	
	

	@RequestMapping("/loginform")
	public String memberloginform() {				
		return "member/loginform";
	}
	

	@RequestMapping("/login")
	public String memberLogin(HttpServletRequest request) {

		Member member = new Member();
		member.setEmail(request.getParameter("email"));
		member.setPassword(request.getParameter("password"));
		member.setName(request.getParameter("name"));
		
		regService.memberReg(member);
				
		return "member/login";
	}	
			
	
	@RequestMapping("/memberlist")
	public String selectList(Model model) {
		
		List<Member> members = viewService.selectList();
		
		model.addAttribute("members", members);
		
		return "member/list";
	}

	


}


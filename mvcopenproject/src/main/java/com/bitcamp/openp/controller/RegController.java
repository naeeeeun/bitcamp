package com.bitcamp.openp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.openp.dao.MemberDao;
import com.bitcamp.openp.model.Member;
import com.bitcamp.openp.service.MemberRegService;


@Controller
@RequestMapping("/memberReg")
public class RegController {

	@Autowired
	MemberRegService service = new MemberRegService();
	
	@RequestMapping(method=RequestMethod.GET)
	public String getForm() {
		return "member/regForm";
	}


	@RequestMapping(method=RequestMethod.POST)
	public String memberReg(
			HttpServletRequest request,
			Model model) {		
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String photo = request.getParameter("photo");
		
		Member member = new Member();
		member.setEmail(email);
		member.setPassword(password);
		member.setName(name);
		member.setPhoto(photo);
		
		service.insertMember(member);
		
		model.addAttribute("result", member);
	
		return "member/memberReg";
	}
	
	
	
}

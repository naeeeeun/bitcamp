package com.bitcamp.openp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitcamp.openp.model.Member;
import com.bitcamp.openp.service.MemberLoginService;


@Controller
@RequestMapping("/memberLogin")
public class LoginController {

	@Autowired
	MemberLoginService service = new MemberLoginService();
	
	@RequestMapping(method=RequestMethod.GET)
	public String getForm(HttpSession session) {
		if(session.getAttribute("loginInfo") == null)			
			return "member/loginForm";
		else
			return "member/memberLogin";
	}


	@RequestMapping(method=RequestMethod.POST)
	public String memberReg(
			HttpServletRequest request,
			Model model,
			HttpSession session) {		
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Member member = new Member();
		member.setEmail(email);
		member.setPassword(password);
		
		String result = service.selectMemberById(member);
		String returnpage = null;
		
		System.out.println("result="+result);
		System.out.println("password="+password);
		

		
		if(password.equals(result)) {
			returnpage = "member/memberLogin";
			session.setAttribute("loginInfo", "");
		}
		else
			returnpage = "member/memberLoginFailed";
		
		return returnpage;
	}
	
	
}

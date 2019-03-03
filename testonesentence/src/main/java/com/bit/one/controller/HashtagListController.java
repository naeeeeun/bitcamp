package com.bit.one.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.one.service.HashtagListService;


@Controller
public class HashtagListController {

	@Autowired
	HashtagListService service = new HashtagListService();
	
	@RequestMapping("/memberList")
	public String getMemberlist(Model model, HttpServletRequest request) {
		int userIdx = 1;
		List<String> memberlist = service.genrePreference(userIdx);
		model.addAttribute("memberlist", memberlist);
		
		return "member/memberList";
		}
	}

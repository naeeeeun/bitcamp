package com.bit.one.preference.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.one.preference.service.HashtagListService;


@Controller
public class HashtagListController {

	@Autowired
	HashtagListService service = new HashtagListService();
	
	@RequestMapping("/hashtagList")
	public String getMemberlist(Model model, HttpServletRequest request) {
		int userIdx = 2;
		List<String> hashtaglist = service.genrePreference(userIdx);
		model.addAttribute("hashtaglist", hashtaglist);
		
		return "preference/hashtagList";
		}
	}

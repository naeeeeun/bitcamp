package com.bit.one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.one.dao.HashtagDao;

@Service
public class HashtagListService {

	@Autowired
	private HashtagDao dao;
	
	public List<String> genrePreference(int userIdx) {	
		return dao.selectHashtagList(userIdx);
	}
	
}
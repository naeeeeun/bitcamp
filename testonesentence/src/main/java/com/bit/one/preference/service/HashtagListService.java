package com.bit.one.preference.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.one.preference.dao.HashtagDao;

@Service
public class HashtagListService implements IHashtagListService{

	@Autowired
	private HashtagDao dao;
	
	@Override
	public List<String> genrePreference(int userIdx) {
		return dao.selectHashtagList(userIdx);
	}


	
}

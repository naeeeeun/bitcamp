package com.bitcamp.openp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.openp.dao.MemberDao;
import com.bitcamp.openp.model.Member;

@Service
public class MemberRegService {

	@Autowired
	private MemberDao dao;
	
	public int insertMember(Member member) {
		return dao.insertMember(member);
	}
	
	public int insertMemberKey(Member member) {
		return dao.insertMemberKey(member);
	}	
	
}

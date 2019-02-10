package com.bitcamp.openproj.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.bitcamp.openproj.dao.MemberDao;
import com.bitcamp.openproj.model.Member;

@Service
public class MemberRegService {
	
	@Inject
	private SqlSessionTemplate template;
	
	private MemberDao dao;
	
	public int memberReg(Member member) {
		
		dao = template.getMapper(MemberDao.class);
		
		return dao.insertMember(member);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

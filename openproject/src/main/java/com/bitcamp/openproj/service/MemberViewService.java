package com.bitcamp.openproj.service;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.bitcamp.openproj.dao.MemberDao;
import com.bitcamp.openproj.model.Member;

@Service
public class MemberViewService {
	
	@Inject
	private SqlSessionTemplate template;
	
	private MemberDao dao;
		
	public Member selectById(String email) {
		
		dao = template.getMapper(MemberDao.class);
		
		return dao.selectById(email);		
	}
	
	public List<Member> selectList(){
		dao = template.getMapper(MemberDao.class);
		return dao.selectList();
	}
	

	
	
}

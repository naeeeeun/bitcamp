package com.bitcamp.openproj.service;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.bitcamp.openproj.dao.MemberDao;

@Service
public class LoginService {

	@Inject
	private SqlSessionTemplate template;
	
	private MemberDao dao;
	
}

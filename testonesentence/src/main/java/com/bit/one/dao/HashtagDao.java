package com.bit.one.dao;

import java.util.List;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class HashtagDao {
	
	@Inject
	private SqlSessionTemplate sqlSession;
	
	private String namespace="com.bit.one.mapper.mybatis.mapper";

	
	public List<String> selectHashtagList(int userIdx) {
		return sqlSession.selectList(namespace+".selectHashtagList", userIdx);
	}

	
}
package com.bit.one.following.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.bit.one.following.model.Following;


@Repository
public class FollowingDao implements IFollowingDao{

	@Inject
	private SqlSessionTemplate sqlSession;
	
	private String namespace="com.bit.one.preference.mapper.mybatis.mapper";
	
	@Override
	public Following selectFollower(Following following) {
		return sqlSession.selectOne(namespace+".selectFollower", following);
	}

	@Override
	public int insertFollower(Following following) {
		return sqlSession.update(namespace+".insertFollower", following);
	}

	@Override
	public int deleteFollower(Following following) {
		return sqlSession.update(namespace+".deleteFollower", following);
	}

	
}
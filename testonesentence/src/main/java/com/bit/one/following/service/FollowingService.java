package com.bit.one.following.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.one.following.dao.FollowingDao;
import com.bit.one.following.model.Following;

@Service
public class FollowingService {

	@Autowired
	private FollowingDao dao;
	
	public Following checkFollowingState(Following following) {
		return dao.selectFollower(following);
	}
	
	public int startFollowing(Following following) {	
		return dao.insertFollower(following);
	}
	
	public int unfollowing(Following following) {	
		return dao.deleteFollower(following);
	}
	
}

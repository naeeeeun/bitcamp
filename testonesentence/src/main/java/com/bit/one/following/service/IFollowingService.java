package com.bit.one.following.service;

import com.bit.one.following.model.Following;


interface IFollowingService {
	
	public Following checkFollowingState(Following following);	
	public int startFollowing(Following following);	
	public int unfollowing(Following following);
	
}

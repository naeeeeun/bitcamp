package com.bit.one.following.dao;

import com.bit.one.following.model.Following;

interface IFollowingDao {

	public Following selectFollower(Following following);	
	public int insertFollower(Following following);	
	public int deleteFollower(Following following);
	
}
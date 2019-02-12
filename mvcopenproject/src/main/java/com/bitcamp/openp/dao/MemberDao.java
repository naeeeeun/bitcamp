package com.bitcamp.openp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.bitcamp.openp.model.Member;



@Repository
public class MemberDao {

	@Autowired
	private JdbcTemplate template;
	
	public int insertMember(Member member) {
		
		String sql = "insert into member (email, password, name, photo)"
											+ "value(?,?,?,?)";
		
		String email = member.getEmail();
		String password = member.getPassword();
		String name = member.getName();
		String photo = member.getPhoto();
		
		int resultCnt = template.update(sql, email, password, name, null);		
		
		return resultCnt;		
	}
	

	public String selectMemberById(Member member) {
		
		
		String sql = "select password from member where email=?";	
		String email = member.getEmail();		
		String result = template.queryForObject(sql, String.class, email);		

		return result;		
	}	
		

	
	
	
	
	
	
	
	
	
	public int insertMemberKey(Member member) {
		
		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		int resultCnt = template.update(
				new PreparedStatementCreator() {
					
					@Override
					public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
						
						String sql = "insert into member (email, password, name, photo)"
								+ "value(?,?,?,?)";
					
						PreparedStatement pstmt 
						= con.prepareStatement(sql, new String[] {"id"});
						
						pstmt.setString(1, member.getEmail());
						pstmt.setString(2, member.getPassword());
						pstmt.setString(3, member.getName());
						pstmt.setString(4, member.getPhoto());
						
						return pstmt;
					}
				}, keyHolder);
		
		Number keyValue = keyHolder.getKey();
		member.setId(keyValue.intValue());
		
		return resultCnt;
	}
	
	
}
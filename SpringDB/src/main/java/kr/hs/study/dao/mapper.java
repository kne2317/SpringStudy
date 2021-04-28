package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class mapper implements RowMapper<LoginDTO> {

	public LoginDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoginDTO bean = new LoginDTO();
		bean.setUserid(rs.getString("userid"));
		bean.setUserpassword(rs.getInt("userpass"));
		return bean;
	}
	
	
	

}

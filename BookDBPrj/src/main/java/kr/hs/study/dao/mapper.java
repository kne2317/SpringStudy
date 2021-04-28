package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

public class mapper implements RowMapper<BookDTO>{

	public BookDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}

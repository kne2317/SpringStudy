package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.MovieDTO;

public class mapper implements RowMapper<MovieDTO>{

	public MovieDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return null;
	}


}

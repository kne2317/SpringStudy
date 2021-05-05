package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.MovieDTO;

@Component
public class MovieDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	//private mapper mapper;
	
	public void insert_data(MovieDTO dto) {
		String sql = "insert into movie values(?, ?, ?, ?)";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getGenre(), dto.getRelease(), dto.getDirector());
	}

	public void update_data(MovieDTO dto) {
		String sql = "update movie set price=? where title=?";
		jdbcTemplate.update(sql, dto.getRating(), dto.getTitle());
	}
	
	public void delete_data(MovieDTO dto) {
		String sql = "delete from movie where title=?";
		jdbcTemplate.update(sql, dto.getTitle());
	}
	
//	public List<MovieDTO> select_data() {
//		String sql = "select * from login";
//		List<MovieDTO> list = jdbcTemplate.query(sql, mapper.class);
//		
//		return list;
//	}
}



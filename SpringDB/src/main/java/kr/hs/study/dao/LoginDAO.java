/*
 * 실제 DB에 접속해서 작업
 * insert, select 등의 쿼리를 처리
 */

package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

@Component
public class LoginDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	/*@Autowired
	private mapper mapper;*/
	// 추가
	public void insert_data(LoginDTO dto) {
		String sql = "insert into login values(?,?)";
		jdbcTemplate.update(sql, dto.getUserid(), dto.getUserpassword());
	}
	
	// 수정 id가 kim인 애의 비밀번호를 2222로 변경
	public void update_data(LoginDTO dto) {
		String sql = "update login set userpass=? where userid=?";
		jdbcTemplate.update(sql, dto.getUserpassword(), dto.getUserid());
	}
	
	// 삭제 id가 kim인 계정을 삭제
	public void delete_data(LoginDTO dto) {
		String sql = "delete from login where userid=?";
		jdbcTemplate.update(sql, dto.getUserid());
	}
	
	// 가져오기
	/*public List<LoginDTO> select_data() {
		String sql = "select * from login";
		List<LoginDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}*/
	
}

package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

import kr.hs.study.dto.MovieDTO;
import kr.hs.study.dao.MovieDAO;

@Configuration
public class JavaConfig {
	@Bean
	@Scope("prototype")
	public MovieDTO MovieDTO() {
		return new MovieDTO();
	}
	
	@Bean
	public MovieDAO MovieDAO() {
		return new MovieDAO();
	}

	@Bean
	public BasicDataSource source() {
		// 디비 접속 정보 입력
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("scott");
		source.setPassword("tiger");
		return source;
		
	}
	
	// 디비 접속정보를 jdbcTemplate로 넘긴다.
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
}

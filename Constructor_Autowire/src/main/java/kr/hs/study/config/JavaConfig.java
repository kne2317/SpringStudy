package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;

@Service
public class JavaConfig {
	
	
	@Bean
	public DataBean1 d2() {
		return new DataBean1();
	}
	
	@Bean
	public TestBean1 java1(DataBean1 d1, DataBean1 d2) {
		return new TestBean1(d1, d2);
	}

}

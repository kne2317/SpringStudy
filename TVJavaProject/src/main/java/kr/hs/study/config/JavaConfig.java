package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import kr.hs.study.beans.AppleSpeaka;
import kr.hs.study.beans.LgTV;
import kr.hs.study.beans.SamsungTV;
import kr.hs.study.beans.SonySpeaka;

@Service
public class JavaConfig {

	
	/*
	@Bean
	public SonySpeaka ss() {
		SonySpeaka ss = new SonySpeaka();
		ss.setPrice(1000);
		return ss;
	}

	@Bean
	public AppleSpeaka as() {
		return new AppleSpeaka(500);
	}
	*/
	
	
	@Bean
	public SamsungTV st() {
		SamsungTV st = new SamsungTV();
		st.setPrice(3000);
		SonySpeaka ss = new SonySpeaka();
		ss.setPrice(1000);
		st.setSpeaka(ss);
		return st;
	}
	
	@Bean
	public LgTV lt() {
		return new LgTV(2000, new AppleSpeaka(500));
	}

}

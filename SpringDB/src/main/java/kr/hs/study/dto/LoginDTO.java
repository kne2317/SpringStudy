/*
 * 
 */
package kr.hs.study.dto;

import java.beans.JavaBean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LoginDTO {

	private String userid;
	private int userpassword;
	
	public LoginDTO() {
		super();
	}

	public LoginDTO(String userid, int userpassword) {
		super();
		this.userid = userid;
		this.userpassword = userpassword;
	}

	
	
	

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(int userpassword) {
		this.userpassword = userpassword;
	}
	
	
	
}

package kr.hs.study.main;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.LoginDAO;
import kr.hs.study.dto.LoginDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		LoginDTO bean1 = ctx.getBean("LoginDTO", LoginDTO.class);
		bean1.setUserid("kim");
		bean1.setUserid("lee");
		bean1.setUserpassword(1111);
		

		LoginDTO bean2 = ctx.getBean("LoginDTO", LoginDTO.class);
		bean2.setUserid("kim");
		bean2.setUserpassword(2222);
		
		LoginDTO bean3 = ctx.getBean("LoginDTO", LoginDTO.class);
		bean3.setUserid("Lee");
		bean3.setUserpassword(2222);
		
		
		
		
		
		LoginDAO dao = ctx.getBean("LoginDAO", LoginDAO.class);
		
		// dao.insert_data(bean1);
		// System.out.println("데이터 저장완료");
		
		
		// dao.update_data(bean2);
		// System.out.println("데이터 수정완료");
		
		
		// dao.delete_data(bean3);
		// System.out.println("데이터 삭제완료");
		
		/*
		List<LoginDTO> list = dao.select_data();
		for(LoginDTO dto : list) {
			System.out.print(dto.getUserid() + "    ");
			System.out.println(dto.getUserpassword());
		}*/
		
		
		
		ctx.close();
		
	}

}

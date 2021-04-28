package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.BookDAO;
import kr.hs.study.dto.BookDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		BookDTO bean1 = ctx.getBean("BookDTO", BookDTO.class);
		bean1.setTitle("해리포터");
		bean1.setAuthor("J.K. 롤링");
		bean1.setPrice(33000);
		bean1.setEmail("harry potter");
		
		BookDTO bean2 = ctx.getBean("BookDTO", BookDTO.class);
		bean2.setTitle("트와일라잇");
		bean2.setAuthor("스테파니 메이어");
		bean2.setPrice(13000);
		bean2.setEmail("Twilight");
		
		BookDTO bean3 = ctx.getBean("BookDTO", BookDTO.class);
		bean3.setTitle("해리포터");
		bean3.setPrice(29700);
		
		BookDTO bean4 = ctx.getBean("BookDTO", BookDTO.class);
		bean4.setTitle("해리포터");
		
		
		BookDAO dao = ctx.getBean("BookDAO", BookDAO.class);
		//dao.insert_data(bean1);
		//dao.insert_data(bean2);
		
		//dao.update_data(bean3);
		
		//dao.delete_data(bean4);
		
		//List<LoginDTO> list = dao.select_data();
		
		System.out.println("완료");
		ctx.close();
		
	}

}

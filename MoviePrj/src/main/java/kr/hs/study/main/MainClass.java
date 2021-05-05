package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.MovieDAO;
import kr.hs.study.dto.MovieDTO;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		MovieDAO dao = ctx.getBean("MovieDAO", MovieDAO.class);
		
		MovieDTO bean1 = ctx.getBean("MovieDTO", MovieDTO.class);
		bean1.setTitle("명량");
		bean1.setGenre("액션");
		bean1.setRelease("2014.07.30");
		bean1.setDirector("김한민");
		
		MovieDTO bean2 = ctx.getBean("MovieDTO", MovieDTO.class);
		bean2.setTitle("극한직업");
		bean2.setGenre("코미디");
		bean2.setRelease("2019.01.23");
		bean2.setDirector("이병헌");
		
		MovieDTO bean3 = ctx.getBean("MovieDTO",MovieDTO.class);
		bean3.setTitle("신과함께");
		bean3.setGenre("판타지");
		bean3.setRelease("2017.12.20");
		bean3.setDirector("김용화");

		dao.insert_data(bean1);
		
		System.out.println("끝");
		ctx.close();
		
	}

}

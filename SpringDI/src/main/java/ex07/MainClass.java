package ex07;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex01.SpringTest;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext atx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		
		SpringTest test=atx.getBean(SpringTest.class);
		test.test();
		
		Hotel h =atx.getBean(Hotel.class);
		h.getChef().cooking();
		
		DatabaseDev dao = atx.getBean(DatabaseDev.class);
		System.out.println(dao.getUid());
		
		MemberDAO da= atx.getBean(MemberDAO.class);
		System.out.println(da.getDs().getUid());
		
		
	}
}

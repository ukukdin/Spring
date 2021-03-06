package ex03;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		//		DatabaseDev dev =new DatabaseDev();
		//		
		//		dev.setUrl("....");
		//		dev.setUid("....");
		//		dev.setUpw("..");
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("application-context.xml");

		DatabaseDev dev =ctx.getBean(DatabaseDev.class);
		MemberDAO ds = ctx.getBean(MemberDAO.class);
		
		
		System.out.println(dev);
		System.out.println(ds);
		System.out.println(ds.getDs().getUpw());
		System.out.println(ds.getDs().getUid());
		System.out.println(ds.getDs().getUrl());
		System.out.println(dev.getUid());
		System.out.println(dev.getUpw());
		System.out.println(dev.getUrl());

		//1.application-context에memberDAO 의 의존관걔를 나타내고
		//main 에서 get bean 메서드를 통해서 값을 출력해보세요
	}
}

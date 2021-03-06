package ex05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		//Computer에 키보드, 마우스, 모니터를 자동주입 명령으로
		//주입하고 메인에서 확인.

		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("Autowired-context.xml");
		Computer ct = ctx.getBean(Computer.class);
		ct.computerInfo();
		
//		Keyboard kb =ctx.getBean(Keyboard.class);
//		
//		System.out.print("키보드 브랜드는: ");
//		kb.info();
//		Monitor mt =ctx.getBean(Monitor.class);
//		System.out.print("모니터 브랜드는: ");
//		mt.info();
//		Mouse ms =ctx.getBean(Mouse.class);
//		System.out.print("마우스 브랜드는: ");
//		ms.info();
	}
}

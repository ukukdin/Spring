package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("Autowired-context.xml");
		
		Airplane ar = ctx.getBean(Airplane.class);
		ar.getBattery().energy();
//		Battery bat =ctx.getBean(Battery.class);
//		bat.energy();
}
}

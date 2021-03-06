package ex07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.SpringTest;
import ex02.Chef;
import ex02.Hotel;
import ex03.DatabaseDev;
import ex03.MemberDAO;

@Configuration//자바 파일을 xml을 대신해서 설정파일로 쓴다. 
public class JavaConfig {

	//<bean class="ex01.SpringTest" scope="prototype"></bean>
	@Bean
	public SpringTest test(){

		return new SpringTest();
	}
	/*
	 * //<bean class="ex02.Chef" id="c">
	 * </bean> <bean class="ex02.Hotel" id="h">
	 * <constructor-arg ref="c" />
	 */
	@Bean
	public Chef chef() {

		return new Chef();
	}
	@Bean
	public Hotel hotel() {
		return new Hotel(chef());
	}


	////	<bean id="dev" class="ex03.DatabaseDev">
	//	<property name="url" value="locatlhost:1521" />
	//	<property name="uid" value="hr" />
	//	<property name="upw" value="hr" />
	//</bean>

	@Bean
	public DatabaseDev dev() {
		DatabaseDev dev = new DatabaseDev();
	
		dev.setUid("localHost:1521");
		dev.setUpw("hr");
		dev.setUrl("hr");
		
		return dev;
	}
	@Bean
	public MemberDAO dao() {
		MemberDAO dao = new MemberDAO();
//		dao.getDs().getUid();
//		dao.getDs().getUpw();
//		dao.getDs().getUrl();
		
		
		dao.setDs(dev());
		
		return dao;
	}



}

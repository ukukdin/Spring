package ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Printer {
	/*
	 *@Autowired - > 자동주입 타입 -> 이름
	 *	@Autowired(required=false)
	 *스프링이 빈을 주입할때 주입할 빈이 없으면 에러를 발생시키는데, 
	 *이를 무시하고 지나가는 옵션입니다.
	 *@qualifier
	 *컨테이너에 동일한 객체가 여러개 있을때 이름(아이디이름)으로 강제 연결하는 어노테이션
	 */
	
	
	@Autowired(required=false)
	@Qualifier("bbb")
	private Document doc;
	
	//기본 생성자 만들어야함  없으면 xml파일에 에러가 뜰수있다.(가령 constructor arg를 만들어얗암)
	public Printer() {
		// TODO Auto-generated constructor stub
	}
	
	public Printer(Document doc) {
		super();
		this.doc = doc;
	}
	

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}
	
	
}

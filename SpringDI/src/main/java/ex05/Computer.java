package ex05;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	
	
	@Autowired(required=false)
	//qulifier("아이디 값을 주고 여기다가 적어도됩")
	private Mouse mouse;
	@Autowired(required=false)
	private Keyboard kb;
	@Autowired(required=false)
	private Monitor monitor;
	
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}
	//@Autowired(required=false)이렇게 해도는데 대부분 멤버변수에 주는 편이 일반적이다. 
	public Computer(Mouse mouse, Keyboard kb, Monitor monitor) {
		super();
		this.mouse = mouse;
		this.kb = kb;
		this.monitor = monitor;
	}
	
	
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Keyboard getKb() {
		return kb;
	}

	public void setKb(Keyboard kb) {
		this.kb = kb;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	
	
}

package ex03;

public class MemberDAO {

	//멤버변수로 private dev
	private DatabaseDev ds;
	//setter 메서드
	public void setDs(DatabaseDev ds) {
		
		this.ds =ds;
		
	}
	//getter메서드
	public DatabaseDev getDs() {
		return ds;
	}
	
}

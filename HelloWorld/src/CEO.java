
public class CEO extends Employee {
	public String company;
	
	
	// print() 메소드 오버라이딩
	public void print() {
		System.out.println("CEO" + this.name + "의 회사는 " + this.company  +
				" 이고 나이는 " + this.age + " 입니다.");
	}
}

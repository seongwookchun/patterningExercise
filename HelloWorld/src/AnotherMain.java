
public class AnotherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Manager 객체 생성
		Manager lee = new Manager();
		
		// 변수 설정
		lee.name = "하이언";
		lee.age = 30;
		lee.jobOfManage = "프로젝트 매니저";
		
		// Overriding 된 Manager 객체의 print() 호출
		lee.print();
		
		// CEO 객체 생성
		CEO kim = new CEO();
		
		// 변수 설정
		kim.name = "Brian Coax";
		kim.age = 45;
		kim.company = "Tesla Inc.";
		
		kim.print();
		
		
		// CEO 객체 생성, 다형성 확인 목적
//		CEO park = new Employee();
//		
//		// 변수 설정
//		park.name = "Brian Coax";
//		park.age = 45;
//		park.jobOfManage = "프로젝트 매니저";
//		park.company = "Tesla Inc.";
//        
//		park.print();
	}

}


public class AnotherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Manager ��ü ����
		Manager lee = new Manager();
		
		// ���� ����
		lee.name = "���̾�";
		lee.age = 30;
		lee.jobOfManage = "������Ʈ �Ŵ���";
		
		// Overriding �� Manager ��ü�� print() ȣ��
		lee.print();
		
		// CEO ��ü ����
		CEO kim = new CEO();
		
		// ���� ����
		kim.name = "Brian Coax";
		kim.age = 45;
		kim.company = "Tesla Inc.";
		
		kim.print();
		
		
		// CEO ��ü ����, ������ Ȯ�� ����
//		CEO park = new Employee();
//		
//		// ���� ����
//		park.name = "Brian Coax";
//		park.age = 45;
//		park.jobOfManage = "������Ʈ �Ŵ���";
//		park.company = "Tesla Inc.";
//        
//		park.print();
	}

}

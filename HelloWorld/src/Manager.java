
public class Manager extends Employee{
	
	
	String jobOfManage;
	
	// print() �޼ҵ� �������̵�
	public void print() {
		System.out.println("����� �̸��� " + this.name + "�̰�, ���̴� "
				+ this.age + "�Դϴ�.");
		System.out.println("������ " + this.name + "��(��) "
				+ this.jobOfManage + " ����Դϴ�.");
	}
}

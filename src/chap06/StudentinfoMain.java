package chap06;

public class StudentinfoMain {

	public static void main(String[] args) {
//      ��� ������ �޾Ƽ� �����ϰ� ����ϴ� ���α׷�
//		1.������ ����Ͽ� ���� ����
//		2.�迭�� ����Ͽ� ���� ����
//		3.Ŭ������ ����Ͽ� ���� ����
		
		String name1 = "���缮";
		String gender1 = "����";
		String job1 = "������";
		
		String name2 = "������";
		String gender2 = "����";
		String job2 = "����";
		
		String name3 = "���μ�";
		String gender3 = "����";
		String job3 = "���";
		
		System.out.println(name1);
		System.out.println(gender1);
		System.out.println(job1);
		System.out.println(name2);
		System.out.println(gender2);
		System.out.println(job2);
		System.out.println(name3);
		System.out.println(gender3);
		System.out.println(job3);
		
		System.out.println("\n----------�迭 ��� -----------\n");
		
		String[][] person = new String[5][3];
		person[0][0] = "���缮";
		person[0][1] = "����";
		person[0][2] = "������";
		person[1][0] = "������";
		person[1][1] = "����";
		person[1][2] = "����";
		person[2][0] = "���μ�";
		person[2][1] = "����";
		person[2][2] = "���";
		
		for (int i = 0; i < person.length; i++) {
			for (int j = 0;j < person[i].length; j++) {
				System.out.println(person[i][j]);
			}
		}
		
		
		System.out.println("\n----------Ŭ���� ��� -----------\n");
		printPersonInfo(person);
		
			
		}
	public static void printPersonInfo(String[][] person) {
		for (int i = 0; i < person.length; i++) {
			for (int j = 0;j < person[i].length; j++) {
				System.out.println(person[i][j]);}
		}
	}
}



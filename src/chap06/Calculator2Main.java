package chap06;

public class Calculator2Main {

	public static void main(String[] args) {
//		��Ģ ������ �ϴ� ���α׷��� �ۼ�
//		+, -, *, /
		int a;
		int b;
//		int result;
		a = 10;
		b = 20;
		
//		result = a + b;
//		System.out.println("a + b = " + result);
//		
//		result = a - b;
//		System.out.println("a - b = " + result);
//		
//		result = a * b;
//		System.out.println("a * b = " + result);
//		
//		a = 30;
//		b = 5;
//		result = a / b;
//		System.out.println("a / b = " + result);


		
		add(a,b);
		minus(a,b);
		multi(a,b);
		div(30,5);
	}

//	�ڹ��� �޼��� ����
//	�ڹٽ�ũ��Ʈ�ʹ� �޸� ���� �����ڿ� ��ȯ Ÿ�� �Է��ؾ� ��
//	�Ű� ���� �Է� �� �Ű������� ������ Ÿ���� �Է��ؾ� ��
//	�޼���� �̷��� �ߺ� ����Ǵ� �κ��� ���� ��Ƽ� �ҽ��ڵ带 �����ϰ� ǥ���ϱ� ���� ���
//	�ڹٽ�ũ��Ʈ������ 4���� �Լ� ���İ� ������
	
	public static void add(int x,int y) {
		int result = x + y;
		System.out.println("�� ���� ���� : " + result);
	}
	
	public static void minus(int x,int y) {
		int result = x - y;
		System.out.println("�� ���� ���� : " + result);
	}
	
	public static void multi(int x,int y) {
		int result = x * y;
		System.out.println("�� ���� ���� : " + result);
	}
	
	public static void div(int x,int y) {
		double result = (double)x / (double)y;
		System.out.println("�� ���� �������� : " + result);
	}
	
	
	
}

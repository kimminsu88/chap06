package chap06;

public class Calculator3 {

	public void plus(int x,int y) {
		int result = x + y;
		System.out.println("�� ���� ���� : " + result);
	}
	
	public void minus(int x,int y) {
		int result = x - y;
		System.out.println("�� ���� ���� : " + result);
	}
	
	public void multi(int x,int y) {
		int result = x * y;
		System.out.println("�� ���� ���� : " + result);
	}
	
	public void divide(int x,int y) {
		double result = (double)x / (double)y;
		System.out.println("�� ���� �������� : " + result);
	}
}

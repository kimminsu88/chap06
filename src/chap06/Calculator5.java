package chap06;

// �޼��� �����ε��� ������ �̸��� �޼�������� �������� �޼��带 �����Ͽ� ��G�ϴ°�
// �Ű������� Ÿ���� �ٸ��ų�, �Ű������� ������ �ٸ��ų�, �Ű������� ������ �ٸ��� ������ �̸��� �޼��带 ������ ������ �� ����
public class Calculator5 {
	public void plusInteger(int x,int y) {
		int result = x +y;
		System.out.println("�� ������ ���� : " + result);
	}
    
	public void plusDouble(double x,double y) {
		double result = x +y;
		System.out.println("�� �Ǽ��� ���� : " + result);
	}
	
	public void plus(int x,int y) {
		int result = x +y;
		System.out.println("�� ������ ���� : " + result);
	}
	public void plus(int x, int y, int z) {
		int result = x + y + z;
		System.out.println("�� ������ ���� : " + result);
	}
	public void plus(double x, double y) {
		double result = x +y;
		System.out.println("�� �Ǽ��� ���� : " + result);
	}
}

package chap06;

// ��ü�� ���α׷� ������ �� 1���� �����Ͽ� ����ϴ� ����� �̱����̶� ��
// �ڱ� �ڽ��� Ŭ���� Ÿ���� ���� �ʵ�� ������ ����
// Ŭ���� ���ο��� ��ü�� ����
// Ŭ���� �����ڿ� private ���� �����ڸ� ����Ͽ� �ܺο��� ������ ȣ���� ����
// �ܺο��� ���� ������ �޼��带 �����ϰ� �ش� �޼��忡�� ���� �ʵ带 ��ȯ��

// �ܺο����� �ش� Ŭ���� ���ο��� �̸� ������ ��ü�� ����� ���� �ְ�, ��ü�� ���� �������� ����
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}

}

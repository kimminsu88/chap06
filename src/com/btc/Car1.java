package com.btc;

public class Car1 {
//	���������� private ��� �� �ܺ� ���� ����
	private int speed;
	private boolean stop; //boolean Ÿ���� �ʱⰪ false
	
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}

	public boolean itStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}

package com.btc;

public class Car1Ex {

	public static void main(String[] args) {
		Car1 myCar = new Car1();
		
		myCar.setSpeed(-50);
		
		System.out.println("����ӵ�: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("����ӵ�: " + myCar.getSpeed());
		
		if(!myCar.itStop()) {
			myCar.setStop(true);
		}
		System.out.println("����ӵ�: " + myCar.getSpeed());

	}

}

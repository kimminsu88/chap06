package com.btc;

import com.btc.hankook.*;
import com.btc.hyundai.Engine;
import com.btc.kumho.*;

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
//	동일한 패키지 내에 클래스가 존재하지 않을 경우 해당 클래스를 사용하려면 패키지 명까지 포함하여 클래스명을 입력해야만 사용할 수 있음
//	import로 클래스를 미리 로드할 경우 만약 동일한 클래스명을 가지고 있는 클래스가 존재한다면 해당 클래스를 사용하기 위해서 패키지명을 포함한 전체클래스명을 입력해야 함
	com.btc.hankook.Tire tire3 = new com.btc.hankook.Tire();
	com.btc.kumho.Tire tire4 = new com.btc.kumho.Tire();
}

package com.gcm.test;

import android.content.Context;
import android.content.Intent;


public class GCMIntentService extends MyJobIntentService {

	public GCMIntentService() {
		super();
		setTextString("테스트2");
	}
	

	@Override
	public boolean test() {
		// MyJobIntentService 의 test() 메소드를 오버라이드해서 재정의 하였지면 false 로 리턴이 안됨
		return false;
	}
}

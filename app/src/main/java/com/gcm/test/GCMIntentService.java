package com.gcm.test;


import com.safeon.pushlib.MyJobIntentService;

public class GCMIntentService extends MyJobIntentService {


	public GCMIntentService() {
		super();
		setTextString("테스트스트링");
	}

	@Override
	public boolean test() {
		return false;
	}
}

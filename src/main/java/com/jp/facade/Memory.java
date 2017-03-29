package com.jp.facade;

public class Memory implements Component {
	@Override
	public void startUp() {
		System.out.println("startup Memory");
		
	}

	@Override
	public void shutDown() {
		System.out.println("shutdown Memory");	
	}
}

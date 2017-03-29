package com.jp.facade;

public class Cpu implements Component {

	@Override
	public void startUp() {
		System.out.println("startup CPU");
		
	}

	@Override
	public void shutDown() {
		System.out.println("shutdown CPU");	
	}

}

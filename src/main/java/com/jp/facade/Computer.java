package com.jp.facade;

public class Computer implements Component {
	Component cpu=new Cpu();
	Component memory= new Memory();
	
	@Override
	public void startUp() {
		cpu.startUp();
		memory.startUp();
	}

	@Override
	public void shutDown() {
		memory.shutDown();
		cpu.shutDown();
	}

}

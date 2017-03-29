package com.jp.abstractfactory;

public class ServerCPUFactory extends CPUFactory {

	@Override
	CPU createCpu() {
		CPU cpu=new IntelXeonCpu();
		return cpu;
	}


}

package com.jp.abstractfactory;

public class PCCPUFactory extends CPUFactory {

	@Override
	CPU createCpu() {
		CPU cpu=new IntelCoreCpu();
		return cpu;

	}


}

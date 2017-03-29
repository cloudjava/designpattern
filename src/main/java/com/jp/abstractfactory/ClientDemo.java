package com.jp.abstractfactory;

public class ClientDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// build a server
		CPUFactory fac = new ServerCPUFactory();
		CPU server=fac.createCpu();
		server.doCalulate();
		//build a pc
		CPUFactory fac2 =new PCCPUFactory();
		CPU pc=fac2.createCpu();
		pc.doCalulate();
	}

}

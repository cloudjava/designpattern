package com.jp.facade;
/**
 * Facade is to reduce complexities
 * startup a computer step :cpu startup,memory startup,disk startup
 * shutdown a computer step :disk shutdown,memory shutdown,cpu shutdown
 * for a user ,what he/she should learn is computer.startup, computer.shutdown
 * then hidden details
 * @author wesley
 *
 */
public class FacadeTest {

	public static void main(String[] args) {
		Component computer=new Computer();
		computer.startUp();
		System.out.println("computer is running");
		computer.shutDown();

	}

}

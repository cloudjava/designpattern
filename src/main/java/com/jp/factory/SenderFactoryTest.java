package com.jp.factory;

/**
 * Factory is an instance producer In Factory pattern, we create object without
 * exposing the creation logic to the client and refer to newly created object
 * using a common interface.
 * 
 * @author wesley
 * @since 2015-11-3
 */
public class SenderFactoryTest {

	public static void main(String[] args) {
		SenderFactory.getSender("sms").send("this is my content");
	}

}

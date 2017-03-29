package com.jp.singleton;

public class Invoker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonObject obj1=SingletonObject.getInstance();
		System.out.println("==============="+obj1);
		SingletonObject obj2=SingletonObject.getInstance();
		System.out.println("==============="+obj2);
	}

}

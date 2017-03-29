package com.jp.singleton;

public class SingletonObject {

	private static SingletonObject singletonObject=new SingletonObject();
	private SingletonObject(){
		System.out.println("private create obj");
	}
	public  static SingletonObject getInstance(){
		return singletonObject;
	}
}

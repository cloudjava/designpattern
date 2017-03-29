package com.jp.singleton;

public class MultiThreadInvoker implements Runnable{

	public static void main(String[] args) {
		for (int i=0;i<=10;i++){
			Thread t = new Thread(new MultiThreadInvoker());
			t.start();
		}


	}

	@Override
	public void run() {
		SingletonObject obj1=SingletonObject.getInstance();
		System.out.println(Thread.currentThread().getName()+"==============="+obj1);
	}

}

package com.jp.factory;

public class SmsSender implements Sender {

	@Override
	public void send(String content) {
		System.out.println("send "+content+" by sms");

	}

}

package com.jp.factory;

public class MailSender implements Sender {

	@Override
	public void send(String content) {
		System.out.println("send "+content+" by mail");
	}

}

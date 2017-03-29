package com.jp.factory;

public class SenderFactory {

	static Sender getSender(String type) {
		if (type.equalsIgnoreCase("mail")) {
			return new MailSender();
		} else if (type.equalsIgnoreCase("sms")) {
			return new SmsSender();
		} else {
			return null;
		}
	}
}

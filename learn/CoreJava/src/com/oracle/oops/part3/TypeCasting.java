package com.oracle.oops.part3;

public class TypeCasting {
	public static void main(String[] args) {
		receive(new TextMessage());
		System.out.println("-----------------");
		receive(new WhatsAppMessage());
		
	}
	static void receive(Message msg) {
		msg.info();
		if(msg instanceof WhatsAppMessage) {
		WhatsAppMessage whatsApp = (WhatsAppMessage)msg;
		whatsApp.getStatus();
		}
		if(msg instanceof TextMessage) {
			TextMessage whatsApp = (TextMessage)msg;
			whatsApp.getStatus();
		}
		
	}
}

class Message{
	void info() {
		System.out.println("u have message");
	}
}

class TextMessage extends Message{
	void info() {
		super.info();
		System.out.println("You have a Txt message");
	}

	public void getStatus() {
		System.out.println("u have a msg from President");
		
	}
}

class WhatsAppMessage extends Message{
	void info() {
		super.info();
		System.out.println("You have a WhatsApp message");
	}
	void getStatus() {
		System.out.println("u have a msg from God");
	}
	
}

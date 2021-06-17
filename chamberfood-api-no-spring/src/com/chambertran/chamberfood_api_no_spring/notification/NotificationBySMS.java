package com.chambertran.chamberfood_api_no_spring.notification;

import com.chambertran.chamberfood_api_no_spring.models.Client;

public class NotificationBySMS implements Notifier {
	
	@Override
	public void notify(Client client, String message) {
		// TODO - para uma app correta, aqui deveria entrar um comando de enviar mensagens por um serviço de SMS
		System.out.printf("Notifying %s by sms via mobile # %s: %s\n",
				client.getName(), client.getMobile(), message);
	}
}

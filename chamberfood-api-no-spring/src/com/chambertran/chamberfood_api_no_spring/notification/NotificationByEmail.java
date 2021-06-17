package com.chambertran.chamberfood_api_no_spring.notification;

import com.chambertran.chamberfood_api_no_spring.models.Client;

public class NotificationByEmail implements Notifier {
	
	@Override
	public void notify(Client client, String message) {
		// TODO - para uma app correta, aqui deveria entrar um comando de enviar mensagens por um servidor de e-mails
		System.out.printf("Notifying %s via email address %s: %s\n",
				client.getName(), client.getEmail(), message);
	}
}

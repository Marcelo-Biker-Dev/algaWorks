package com.chambertran.chamberfood.notification;

import org.springframework.stereotype.Component;

import com.chambertran.chamberfood.models.Client;

@Component
public class NotificationByEmail {
	

 	
	
	public void notify(Client client, String message) {
		// TODO - para uma app correta, aqui deveria entrar um comando de enviar mensagens por um servidor de e-mails
		System.out.printf("Notifying %s via email address %s: %s\n",
				client.getName(), client.getEmail(), message);
	}
}

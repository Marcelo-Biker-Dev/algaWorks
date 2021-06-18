package com.chambertran.chamberfood.services;

import org.springframework.stereotype.Component;

import com.chambertran.chamberfood.models.Client;
import com.chambertran.chamberfood.notification.NotificationByEmail;

@Component
public class ClientActivation {
	
	private NotificationByEmail notifier;
	
	public void activateClient(Client client) {
		client.activate();
		notifier.notify(client, "Your registration is active!");
	}
}

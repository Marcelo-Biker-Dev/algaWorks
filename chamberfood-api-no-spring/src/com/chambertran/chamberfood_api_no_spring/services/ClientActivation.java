package com.chambertran.chamberfood_api_no_spring.services;

import com.chambertran.chamberfood_api_no_spring.models.Client;
import com.chambertran.chamberfood_api_no_spring.notification.Notifier;

public class ClientActivation {
	
	private Notifier notifier;
	
	public ClientActivation(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void activateClient(Client client) {
		client.activate();
		notifier.notify(client, "Your registration is active!");
	}
}

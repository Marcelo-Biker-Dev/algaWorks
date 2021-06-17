package com.chambertran.chamberfood_api_no_spring;

import com.chambertran.chamberfood_api_no_spring.models.Client;
import com.chambertran.chamberfood_api_no_spring.notification.NotificationByEmail;
import com.chambertran.chamberfood_api_no_spring.notification.NotificationBySMS;
import com.chambertran.chamberfood_api_no_spring.notification.Notifier;
import com.chambertran.chamberfood_api_no_spring.services.ClientActivation;

public class Entrance {

	public static void main(String[] args) {
		
		Client John = new Client("John", "john@paranaue.com", "555.555.999");
		Client Mary = new Client("Mary", "mary@paranaue.com", "555.555.998");
		
		Notifier notifier = new NotificationByEmail();
		
		ClientActivation activation = new ClientActivation(notifier);
		activation.activateClient(Mary);
		activation.activateClient(John);
	}
}

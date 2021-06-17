package com.chambertran.chamberfood_api_no_spring.notification;

import com.chambertran.chamberfood_api_no_spring.models.Client;

public interface Notifier {
	
	void notify(Client client, String message);

}

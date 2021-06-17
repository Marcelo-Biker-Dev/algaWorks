package com.chambertran.chamberfood_api_no_spring.services;

import com.chambertran.chamberfood_api_no_spring.models.Client;
import com.chambertran.chamberfood_api_no_spring.models.Product;
import com.chambertran.chamberfood_api_no_spring.notification.Notifier;

public class InvoiceIssuance {
	
	private Notifier notifier;
	
	public InvoiceIssuance(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void issueInvoice(Client client, Product product) {
		// TODO - para uma app correta, aqui deveria entrar um comando de emissão de invoices
		notifier.notify(client, "Invoice for product "
				+ product.getName() + "was issued!");
	}
}

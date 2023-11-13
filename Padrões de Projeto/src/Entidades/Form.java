package Entidades;

import Interfaces.Interface;


public class Form {
	
	private String name;
	private String subscription;
	private String date;
	private Interface validator;
	
	public Form(String name, String subscription, String date) {
		super();
		this.name = name;
		this.subscription = subscription;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public String getSubscription() {
		return subscription;
	}

	public String getDate() {
		return date;
	}

	public void setValidator(Interface validator) {
		this.validator = validator;
	}
	
	public void valid(String field) {
		System.out.println(this.name + " " + validator.valid(this.name));
	}
}
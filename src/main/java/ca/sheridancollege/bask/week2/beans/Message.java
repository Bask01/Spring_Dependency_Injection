package ca.sheridancollege.bask.week2.beans;

import org.springframework.stereotype.Component;

@Component
public class Message {
	
	private String message = "Dependency Injection Demo!";
	


	public Message() {
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
	
	
	
	
}

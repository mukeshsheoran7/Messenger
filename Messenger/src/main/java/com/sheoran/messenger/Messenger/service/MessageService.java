package com.sheoran.messenger.Messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sheoran.messenger.Messenger.database.DatabaseClass;
import com.sheoran.messenger.Messenger.model.Message;

public class MessageService {
	
private Map<Integer, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1, new Message(1, "Hello World", "koushik"));
		messages.put(2, new Message(2, "Hello Jersey", "koushik"));
	}
	
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
	
	public Message getMessage(Integer id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(Integer id) {
		return messages.remove(id);
	}

}

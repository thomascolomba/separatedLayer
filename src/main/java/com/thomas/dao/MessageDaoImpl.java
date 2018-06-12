package com.thomas.dao;

import java.util.HashMap;

import com.thomas.businessLayer.businessObject.Message;

public class MessageDaoImpl {
	private static HashMap<String, Message> messages;// = new HashMap<>();
	static
    {
		messages = new HashMap<String, Message>();
		messages.put("msg1", new Message("msg1", "myFirstMessage"));
		messages.put("msg2", new Message("msg2", "mySecondMessage"));
    }
	
	public static Message getMessage(String messageName) {
		return messages.get(messageName);
	}
	
	public static void setMessage(Message message) {
		messages.put(message.getName(), message);
	}
}

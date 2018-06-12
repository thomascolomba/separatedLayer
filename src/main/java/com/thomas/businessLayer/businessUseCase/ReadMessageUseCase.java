package com.thomas.businessLayer.businessUseCase;

import com.thomas.businessLayer.businessObject.Message;
import com.thomas.dao.MessageDaoImpl;

public class ReadMessageUseCase {
	public static Message readMessage(String messageName) {
		return MessageDaoImpl.getMessage(messageName);
	}

	public static void writeMessage(Message message) {
		MessageDaoImpl.setMessage(message);
	}
}

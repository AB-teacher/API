package com.montran.api.service;

import com.montran.api.database.DatabaseAccess;
import com.montran.api.model.Message;
import java.util.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class MessageService {
	
	private Map<Integer,Message> msgList = DatabaseAccess.getMessages();
	public MessageService(){
		msgList.put(1, new Message(1,"Hello World","anjali"));
		msgList.put(2, new Message(2,"This is Mumbai","supriya"));
		msgList.put(3, new Message(3,"Montran","Manjula"));
	}
	
	public Message getMessage(int id) {
		return msgList.get((Integer )id);
	}
	
	
	public List<Message> getAllMessages() {
		
		return (new ArrayList<Message> (this.msgList.values()));
	}
	
	public Message addMessage(Message m1) {
		m1.setId(msgList.size()+1);
		msgList.put(m1.getId(), m1);
		return m1;
	}
	
	public Message updateMessage(Message updateMessage) {
		if (updateMessage.getId() <=0) {
			return null;
		}
		msgList.put(updateMessage.getId(), updateMessage);
		return updateMessage;
	}
	
	public Message removeMessage(int id) {
		return msgList.remove((Integer) id);
	}
	
	public List<Message> getAllMessagesForYear(int year) {
		Calendar cal = Calendar.getInstance();
		List<Message> allMessages = new ArrayList<> ();
		for (Message msg:msgList.values()) {
			cal.setTime(msg.getCreatedDate());
			if(year == cal.get(Calendar.YEAR)) {
				allMessages.add(msg);
			}
		}
		return allMessages;
	}
	
	public List<Message> getAllmessagesPaginated(int startNo, int size){
		List<Message> allMessages = new ArrayList<> (msgList.values());
		
		if(startNo + size > msgList.size() ) {
			return allMessages;
		}
		return allMessages.subList(startNo, startNo+ size);
	}
	
}

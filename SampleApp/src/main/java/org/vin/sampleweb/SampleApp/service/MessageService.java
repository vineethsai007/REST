package org.vin.sampleweb.SampleApp.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.vin.sampleweb.SampleApp.database.DatabaseClass;
import org.vin.sampleweb.SampleApp.model.Message;

	

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	/*public  MessageService() {
		messages.put(1L, new Message(1,"Hello World","vineeth"));
		messages.put(2L, new Message(2,"Jersey sucks","vinz"));
	}*/
	public MessageService() {
		  if (messages.size()==0) 
		  {
		   messages.put(1L,new Message(1L,"Hello World","vineeth"));
		   messages.put(2L,new Message(2L,"Hello Jersey","vinz"));
		  }
		  }
	
	public List<Message> getAllMessages(){
		
		//Messages.values();
//		Message m1 = new Message(123L,"Hello MF","Vin");
//		Message m2 = new Message(124L,"Jersey Sucks","Vin");
//		Message m3 = new Message(125L,"Tomcat is such a pussy","Mano");
//		List<Message> list = new ArrayList<>();
//		list.add(m1);
//		list.add(m2);
//		list.add(m3);
		return new ArrayList<Message>(messages.values());
//		//this whole thing return hard-coded list of messages
}

	public Message getMessage(long id) {
		return messages.get(id);
	}
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);//messages.size +1 so that new element message with increment
		messages.put(message.getId(),message);//adding id just generated to the map i.e. to message
		return message;//message that is added is being returned
	}
	
	public Message updateMessage(Message message) {//accepting a message
		if(message.getId()<=0) {//message should have an id set
		return null;
	}
	messages.put(message.getId(),message);//if id has a value we do put
	return message;
	}
	public Message removeMessage(long id) {
		return messages.remove(id);
	}


}



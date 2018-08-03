package org.vin.sampleweb.SampleApp.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vin.sampleweb.SampleApp.model.Message;
import org.vin.sampleweb.SampleApp.service.MessageService;



//fake back-end to create messages list

@Path("/messages")
public class MessageResource {

	MessageService messageService= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		
		return messageService.getAllMessages();
		 
	}
}
 
	
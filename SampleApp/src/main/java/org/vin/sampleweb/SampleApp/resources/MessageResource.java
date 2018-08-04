package org.vin.sampleweb.SampleApp.resources;


import java.util.List;

//import javax.websocket.server.PathParam; use this for string return types
import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vin.sampleweb.SampleApp.model.Message;
import org.vin.sampleweb.SampleApp.service.MessageService;



//fake back-end to create messages list

@Path("/messages") // this goes to url with /messages
public class MessageResource {

	MessageService messageService= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		
		return messageService.getAllMessages();
		 
	}
	
	
	@GET
	@Path("{messageId}")//string here
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessage(@PathParam("messageId") long id) { 
		return messageService.getMessage(id);
		//long here //jersey performs string to long conversion internally
	}
	
}
 
	
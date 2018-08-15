package org.vin.sampleweb.SampleApp.resources;


import java.util.List;

//import javax.websocket.server.PathParam; use this for string return types
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vin.sampleweb.SampleApp.model.Message;
import org.vin.sampleweb.SampleApp.service.MessageService;



//fake back-end to create messages list

@Path("/messages")// this goes to url with /messages; for collection url
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)


public class MessageResource {

	MessageService messageService= new MessageService();
	
	@GET
//	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		
		return messageService.getAllMessages();
		 
	}
	//we can remove produces and consumes for resource uri by adding them to collection url.
	@POST
//  @Produces(MediaType.TEXT_PLAIN) for initial output later in application we use app_json
//  @Produces(MediaType.APPLICATION_JSON)
//  @Consumes(MediaType.APPLICATION_JSON) //the input typed must be converted 
	//to an instance of message i.e why we use consumes. to say this method consumes json
	public Message addMessage(Message message) {
		return messageService.addMessage(message);
		//return "POST WORKS!!";
	}
	
	@PUT
	@Path("{messageId}")//string here
//  @Consumes(MediaType.APPLICATION_JSON)
//  @Produces(MediaType.APPLICATION_JSON)
//  public Message updateMessage(Message message) { implementing path param to get id from uri without the need for mentioning id again
	public Message updateMessage(@PathParam("messageId") long id,Message message) {
		//add pathparam to get the id
		message.setId(id); //this is for the message to be updated based on the id specified in url but not 
		//based on what is inside the message content
		return messageService.updateMessage(message);
	}
	
	@DELETE
	@Path("/{messageId}")
//  @Produces(MediaType.APPLICATION_JSON)
	public void  deleteMessage(@PathParam("messageId") long id) {
		messageService.removeMessage(id);
	}
	
	
	@GET
	@Path("{messageId}")//string here
//	@Produces(MediaType.APPLICATION_JSON) commenting because mentioned in collection url
	public Message getMessage(@PathParam("messageId") long id) { 
		return messageService.getMessage(id);
		//long here //jersey performs string to long conversion internally
	}
	
}
 
	
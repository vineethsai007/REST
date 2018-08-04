package org.vin.sampleweb.SampleApp.dummy;

public class Dummy {
	/*@Path("/test") // goes into this method if url is /messages/test // this a hardcode
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {    //java allows method path annotations in this case i.e. /test
		return "test";
	}*/
	//to try same with variable instead of hardcoded to use variable we use curly braces asshown below
	
	/*@GET
	@Path("/{messagesId}") // goes into this method if url is /messages/messageId // this variable path param
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("messagesId") String messagesId) {    //java allows method path annotations in this case i.e. /test
		//messageService.getMessage(messageId);//inject that value of pathparam to this method so as to access element associated with it
		return "got path param" + messagesId; //pathparam introduction to be able to capture the messageId from url and then parse to get relevant message
	}	*/
	

}

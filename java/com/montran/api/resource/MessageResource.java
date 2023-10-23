package com.montran.api.resource;


import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.montran.api.model.Message;
import com.montran.api.service.*;

@Path("/messages")
public class MessageResource {
	
//	@GET
//	@Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
//	public String getId() {
//		return "Hello World";
//	}
	MessageService msgServ = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	
	public List<Message> getMessages(@QueryParam("year") int year){
		if (year >0) {
			return msgServ.getAllMessagesForYear(year);
		}
		return msgServ.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") Integer messageId){
		
		return msgServ.getMessage(messageId);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message newMsg) {
		return msgServ.addMessage(newMsg);
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") Integer messageId, Message newMsg) {
		newMsg.setId(messageId);
		return msgServ.updateMessage(newMsg);
	}
	
	
}

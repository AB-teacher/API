package com.montran.api.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	private int id;
	private String message;
	private Date createdDate;
	private String author;
	private int reviewer_id;
<<<<<<< HEAD

=======
	private int msgtype;
>>>>>>> ef5ff4d0afa6e0747eb2e39ff589d42feead8e3c
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Message(int id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.createdDate = new Date();
	}

	public Message() {
<<<<<<< HEAD
		System.out.println("ore wa Shubham Ghule");
		System.out.println("After creaged branch ssg1421");
=======
		System.out.println("hi");
>>>>>>> ef5ff4d0afa6e0747eb2e39ff589d42feead8e3c
	}

}
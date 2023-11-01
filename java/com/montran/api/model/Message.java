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

	private int age;

	private String rev_author;


	private int temp;
	
	public int getTemp() {
		return temp;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}


	
	private int msgtype;

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
	
	public int getReviewerId() {
		return reviewer_id;
	}

	public void setReviewerId(int id) {
		this.reviewer_id = id;
	}

	
	public Message(int id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.createdDate = new Date();
	}

	public Message() {

		System.out.println("message - sharvil");
<<<<<<< HEAD

		System.out.println("HELLO");

=======
<<<<<<< HEAD
		System.out.println("message- Hello sharvil");
=======
=======
		System.out.println("HELLO");
>>>>>>> smm
>>>>>>> d31ce408ea2329ad55224d3016c014d7e827a2a9
>>>>>>> 1b2ee668aedcd75593e4ef279ff87001a3ff23d6
	}

		System.out.println("ore wa Shubham Ghule");
	
		System.out.println("hi");

	}

}

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
	private String rev_author;

=======
<<<<<<< HEAD
	// <<<<<<< HEAD
=======
<<<<<<< HEAD
	private int temp;
	
	public int getTemp() {
		return temp;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
=======
<<<<<<< HEAD
>>>>>>> 24c68de4e013c3c682c1e360489e605e3e594ace

	// =======
	private int msgtype;
<<<<<<< HEAD

	// >>>>>>> ef5ff4d0afa6e0747eb2e39ff589d42feead8e3c
=======
>>>>>>> ef5ff4d0afa6e0747eb2e39ff589d42feead8e3c
>>>>>>> 0a7d1507c6224ffc256e258318c14cbd6a09ae62
>>>>>>> 24c68de4e013c3c682c1e360489e605e3e594ace
>>>>>>> 8a79eb4893388548f48b869153edb29b6c16edee
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
	// <<<<<<< HEAD

	// =======
	public int getReviewerId() {
		return reviewer_id;
	}

	public void setReviewerId(int id) {
		this.reviewer_id = id;
	}

	// >>>>>>> 1889ca452374ce6cc73a7ef210868160590e6845
	public Message(int id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.createdDate = new Date();
	}

	public Message() {
<<<<<<< HEAD
<<<<<<< HEAD
		// <<<<<<< HEAD
=======
<<<<<<< HEAD
		System.out.println("message - sharvil");
<<<<<<< HEAD
		System.out.println("message- Hello sharvil");
=======
=======
		System.out.println("HELLO");
>>>>>>> smm
>>>>>>> d31ce408ea2329ad55224d3016c014d7e827a2a9
	}
	
	
	
=======
<<<<<<< HEAD
>>>>>>> 24c68de4e013c3c682c1e360489e605e3e594ace
		System.out.println("ore wa Shubham Ghule");
		// =======
		System.out.println("hi");
		// >>>>>>> ef5ff4d0afa6e0747eb2e39ff589d42feead8e3c
	}

>>>>>>> 0a7d1507c6224ffc256e258318c14cbd6a09ae62
}

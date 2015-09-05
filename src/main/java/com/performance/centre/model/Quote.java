package com.performance.centre.model;

public class Quote implements IModel {

	private String quote;
	private String topic;
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String author;

	public Quote(String author, String quote,String topic) {
		this.quote = quote;
		this.author = author;
		this.topic = topic;
	}
	public Quote(){
		super();
	}

}

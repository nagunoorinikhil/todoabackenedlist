package com.example.demo;

public class TodoListAll {
	
	int id;
	String value;
	boolean completed;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public TodoListAll(int id, String value, boolean completed) {
		super();
		this.id = id;
		this.value = value;
		this.completed = completed;
	}
	@Override
	public String toString() {
		return "TodListAll [id=" + id + ", value=" + value + ", completed=" + completed + "]";
	}
	
	

}

package com.learning.chaitanya.models;

public class Item {
	
	private int _id;
	private String _text;
	
	public Item(int id, String text) {
		this._id = id;
		this._text = text;
	}
	

	public int getId() {
		return this._id;
	}

	public String getText() {
		return this._text;
	}

}

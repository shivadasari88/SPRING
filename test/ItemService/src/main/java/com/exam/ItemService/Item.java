package com.exam.ItemService;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {

	@Id
	private int id;
	private String itemName;
	private int price;
	private int stock;
	
	public Item() {};
	
	public Item(int id, String itemName, int price, int stock) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.stock = stock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}

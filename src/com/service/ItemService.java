package com.service;

import java.util.Set;

import com.Item;

public interface ItemService {

	public void addItem(Item item);
	public Set<Item> getAllItems();
	
}

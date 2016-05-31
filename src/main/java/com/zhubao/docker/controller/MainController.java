package com.zhubao.docker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhubao.docker.model.Item;
import com.zhubao.docker.model.User;

@RestController
public class MainController {

	@Autowired
	private StoreIntegration storeIntegration;
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public User getUser() throws Exception {
		System.out.println("==== api work here! ====");
		return storeIntegration.getStores();
	}
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public List<Item> getUserItems() throws Exception {
		List<Item> items = new ArrayList<Item>();
		Item item = new Item();
		item.setUserId(2);
		item.setId(1);
		item.setName("Plane");
		item.setDescription("This is a plane");
		
		Item item2 = new Item();
		item2.setUserId(2);
		item2.setId(2);
		item2.setName("Blalala");
		item2.setDescription("This is blalala");
		
		items.add(item);
		items.add(item2);
		
		return items;
	}
	
}

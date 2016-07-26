package com.zhubao.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhubao.docker.model.Item;
import com.zhubao.docker.model.User;
import com.zhubao.docker.service.ItemService;

@RestController
public class MainController {

	@Autowired
	private StoreIntegration storeIntegration;
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public User getUser() throws Exception {
		System.out.println("==== api work here! ====");
		return storeIntegration.getStores();
	}
	
	@RequestMapping(value = "/items/{userId}", method = RequestMethod.GET)
	public List<Item> getUserItems(@PathVariable long userId) throws Exception {
		List<Item> items = itemService.findByUserId(userId);
		return items;
	}
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public Iterable<Item> getAllItems() throws Exception {
		Iterable<Item> items = itemService.findAllItems();
		return items;
	}
	
}

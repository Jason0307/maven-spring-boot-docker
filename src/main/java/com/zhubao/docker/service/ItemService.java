package com.zhubao.docker.service;

import java.util.List;

import com.zhubao.docker.model.Item;

public interface ItemService {

	public List<Item> findByUserId(long userId);
	
	public Iterable<Item> findAllItems();
}

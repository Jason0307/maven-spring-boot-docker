package com.zhubao.docker.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhubao.docker.datasource.TargetDataSource;
import com.zhubao.docker.model.Item;
import com.zhubao.docker.repository.ItemRepository;
import org.springframework.stereotype.Service;

import com.zhubao.docker.service.ItemService;

@Service
public class ItemServiceImp implements ItemService {

	@Autowired
	private ItemRepository itemRepository;

	@TargetDataSource("ds2")
	@Override
	public List<Item> findByUserId(long userId) {
		return itemRepository.findByUserId(userId);
	}

	@Override
	public Iterable<Item> findAllItems() {
		return itemRepository.findAll();
	}
}

package com.zhubao.docker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zhubao.docker.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

	public List<Item> findByUserId(long userId);
}

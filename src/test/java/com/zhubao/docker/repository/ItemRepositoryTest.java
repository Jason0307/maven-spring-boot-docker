package com.zhubao.docker.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.zhubao.docker.DockerServiceApplication;
import com.zhubao.docker.model.Item;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DockerServiceApplication.class)
@WebAppConfiguration
public class ItemRepositoryTest {

	@Autowired
	private ItemRepository itemRepository;
	
	public void testAddItem() {
		Item item = new Item();
		item.setDescription("Jason");
		item.setName("");
		itemRepository.save(item);
	}
}

package com.zhubao.docker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.zhubao.docker.DockerServiceApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DockerServiceApplication.class)
@WebAppConfiguration
public class DockerServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}

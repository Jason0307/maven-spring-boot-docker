package com.zhubao.docker.controller;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhubao.docker.model.User;
@Service
public class StoreIntegration {

	@HystrixCommand(fallbackMethod = "defaultStores")
    public User getStores() throws Exception {
		throw new Exception();
//		return new User(1, "Jason");
    }

    public User defaultStores() {
        return new User(2, "Marco");
    }
}

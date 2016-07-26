package com.zhubao.docker.repository;

import org.springframework.data.repository.CrudRepository;

import com.zhubao.docker.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

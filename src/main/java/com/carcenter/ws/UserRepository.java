package com.carcenter.ws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carcenter.ws.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);
}

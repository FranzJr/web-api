package org.learning.jpa.service;

import java.util.List;

import org.learning.jpa.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserService extends MongoRepository<UserEntity, String> {

	public UserEntity findByName(String name);

	public List<UserEntity> findByLastName(String lastName);

}

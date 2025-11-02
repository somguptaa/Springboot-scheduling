package com.som.repo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.som.model.User;

public interface UserRepo extends MongoRepository<User, Integer>{

}

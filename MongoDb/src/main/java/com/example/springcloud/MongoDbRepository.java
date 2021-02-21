package com.example.springcloud;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoDbRepository extends MongoRepository<Users, String> {

}

package com.example.webdemo.resttemplatedemo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.webdemo.resttemplatedemo.entity.MongoEntity;

public interface MongoRepo extends MongoRepository<MongoEntity, Double> {

}

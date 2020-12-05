package com.example.webdemo.resttemplatedemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.webdemo.resttemplatedemo.entity.RestTemplateEntity1;

@Repository
public interface RestTemplateRepo extends JpaRepository<RestTemplateEntity1, String> {

}

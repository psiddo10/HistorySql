package com.example.webdemo.resttemplatedemo.Controller;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.webdemo.resttemplatedemo.Repository.RestTemplateRepo;
import com.example.webdemo.resttemplatedemo.entity.RestTemplateEntity1;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/resttemplate")
public class RestTemplateController {
	
	WebClient webClient=WebClient.builder().baseUrl("https://api2.pocketbits.in").defaultHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE).build();
 
	@Autowired
	private RestTemplateRepo repo;
	private ScheduledExecutorService executor;
	private ScheduledFuture<?> future;
	
	
	@PostMapping("/putdata")
	public List<RestTemplateEntity1> putall()throws EntityExistsException{
		
		Flux<RestTemplateEntity1> mongo =webClient.get().uri("api/v1/ticker").retrieve().bodyToFlux(RestTemplateEntity1.class);

		List<RestTemplateEntity1> mongo1=mongo.collectList().block();
		
		
		
		
		
		return repo.saveAll(mongo1);
	}
	
	
	
	
	@GetMapping("/getdata")
	public List<RestTemplateEntity1> getall(){
		
		Flux<RestTemplateEntity1> mongo =webClient.get().uri("api/v1/ticker").retrieve().bodyToFlux(RestTemplateEntity1.class);

		
		return mongo.collectList().block();
	}
	@PostMapping("/putdata1")
	public List<RestTemplateEntity1> putall1()throws EntityExistsException{
		
		executor = Executors.newSingleThreadScheduledExecutor();
		   
		 
		 future = executor.scheduleAtFixedRate(new Runnable(){


			 @Override
			public void run() {
				 
				
				 
				 Flux<RestTemplateEntity1> mongo=webClient.get().uri("api/v1/ticker").retrieve().bodyToFlux(RestTemplateEntity1.class);
				 
				
				repo.saveAll(mongo.collectList().block());
				
				System.out.println("working"); 
				 
				
			 
			}
			 },0,2,TimeUnit.SECONDS);
		
		 return null; 
	}
}

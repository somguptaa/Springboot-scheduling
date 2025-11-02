package com.som.service;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.som.model.User;
import com.som.repo.UserRepo;

@Service
public class UserService {

	
    @Autowired
    private UserRepo repo;

    private static int counter = 1; //  givign ID as 1 
    
    // Schedule a job to add an object to the database every 10 seconds
    @Scheduled(fixedRate = 10000)
    public void add2DbData() {
        User user = new User();
        user.setId(counter++); // assign to the set id and use ++ for unique ID
        user.setName("user" + new Random().nextInt(456732));
        repo.save(user);
        
        
        // Get current date/time dynamically each run
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Data added at: " + currentDateTime);
    }

    
    // Fetch data from the database every 30 seconds
    @Scheduled(cron = "0/30 * * * * *")
    public void fetchDataFromDb() {
        List<User> users = repo.findAll();
        
        
        // Get current date/time dynamically each run
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Data fetched at: " + currentDateTime);
        System.out.println("Number of records fetched: " + users.size());
        
        
      
        
        
        
    }
    
    
    
    
    
}

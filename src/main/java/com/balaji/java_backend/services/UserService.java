package com.balaji.java_backend.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.balaji.java_backend.models.User;
 

@Service
public class UserService {
    private List<User> allUsers;
    public UserService() {
        allUsers = new ArrayList<>();
        allUsers.add(new User(1, "john", "Male", "/images/john.png"));
        allUsers.add(new User(2, "jane", "Female", "/images/jane.png"));
        
    }
    public List<User> getAllUsers() {
        return allUsers;
    }
    public User getUserById(int id)
    {
        for(int i=0;i<allUsers.size();i++)
        {
            if(allUsers.get(i).getId()==id){
                return allUsers.get(i);
            }
        }
        return null;
    }

}

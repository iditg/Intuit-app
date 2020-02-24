package com.Intuit.facad;

import com.Intuit.database.entities.User;
import com.Intuit.database.repositories.UserRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getById(Integer userId)  {
        return userRepository.findById(userId).orElseThrow(()-> new EntityNotFoundException("user not found"));
    }

}

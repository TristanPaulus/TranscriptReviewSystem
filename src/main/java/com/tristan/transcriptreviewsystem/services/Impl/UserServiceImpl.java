package com.tristan.transcriptreviewsystem.services.Impl;

import com.tristan.transcriptreviewsystem.domain.User;
import com.tristan.transcriptreviewsystem.repositories.UserRepository;
import com.tristan.transcriptreviewsystem.services.Interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/09/06.
 */
@Service
public class UserServiceImpl /*implements UserService*/{

    @Autowired
    private UserRepository repository;

    public User create(User entity) {
        return repository.save(entity);
    }

    public User read(String value) {
        return repository.findOne(value);
    }

    public User update(User entity) {
        return repository.save(entity);
    }

    public void delete(String value) {
        repository.delete(value);
    }

    public List<User> getAll() {
        List<User> userList = new ArrayList<User>();
        Iterable<User> users = repository.findAll();
        for (User user : users) {
            userList.add(user);
        }
        return userList;
    }
}

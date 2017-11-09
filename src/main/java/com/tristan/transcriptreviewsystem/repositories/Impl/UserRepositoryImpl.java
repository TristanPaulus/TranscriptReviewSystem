package com.tristan.transcriptreviewsystem.repositories.Impl;

import com.tristan.transcriptreviewsystem.domain.User;
import com.tristan.transcriptreviewsystem.repositories.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/15.
 */
public class UserRepositoryImpl /*implements UserRepository*/{
/*
    private static UserRepositoryImpl repository = null;
    private Map<String, User> userTable = new HashMap<String, User>( );

    public static UserRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new UserRepositoryImpl();
        return repository;
    }

    public User create(User user) {
        userTable.put(user.getID(), user);
        User savedUser = userTable.get(user.getID());
        return savedUser;
    }

    public User read(String user_id) {
        User savedUser = userTable.get(user_id);
        return savedUser;
    }

    public User update(User user) {
        userTable.put(user.getID(), user);
        User savedUser = userTable.get(user.getID());
        return savedUser;
    }

    public void delete(String user_id) {
        userTable.remove(user_id);
    }

    public List<User> findAll()
    {
        List<User> users = new ArrayList<User>();

        for (String key : userTable.keySet()) {
            users.add(userTable.get(key));
        }
        return users;
    }
    */
}

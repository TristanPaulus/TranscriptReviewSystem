package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.ReviewRecord;
import com.tristan.transcriptreviewsystem.domain.User;
import com.tristan.transcriptreviewsystem.repositories.Impl.UserRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */
public class UserRepositoryTest {

    User user;
    UserRepositoryImpl repository;

    @Before
    public void setUp() throws Exception {

        repository = UserRepositoryImpl.getInstance();

        user = new User.Builder()
                .user_id("U101")
                .password("password123")
                .name("Tristan")
                .build();
    }

    @Test
    public void create() throws Exception {
        User savedUser = repository.create(user);
        assertEquals("Tristan", savedUser.getName());
    }

    @Test
    public void read() throws Exception {
        repository.create(user);
        User savedUser = repository.read("U101");
        assertEquals("Tristan", savedUser.getName());
    }

    @Test
    public void update() throws Exception {

        repository.create(user);

        User updatedUser = new User.Builder()
                .user_id("U101")
                .password("password123")
                .name("Tristan")
                .email("tristan.ipaulus@gmail.com")
                .build();

        User savedUser = repository.update(updatedUser);
        assertEquals("tristan.ipaulus@gmail.com", savedUser.getEmail());
    }

    @Test
    public void delete() throws Exception {

        User savedUser = repository.create(user);
        assertNotNull(savedUser);

        repository.delete("U101");
        savedUser = repository.read("U101");
        assertNull(savedUser);
    }

}
package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */
public class UserRepositoryTest {

    User user;
    UserRepository repository;

    @Before
    public void setUp() throws Exception {

        user = new User.Builder()
                .user_id("U101")
                .passwordkey("password123")
                .firstname("Tristan")
                .build();
    }

    @Test
    public void create() throws Exception {
        User savedUser = (User) repository.save(user);
        assertEquals("Tristan", savedUser.getFirstname());
    }

    @Test
    public void read() throws Exception {
        repository.save(user);
        User savedUser = repository.findOne("U101");
        assertEquals("Tristan", savedUser.getFirstname());
    }

    @Test
    public void update() throws Exception {

        repository.save(user);

        User updatedUser = new User.Builder()
                .user_id("U101")
                .passwordkey("password123")
                .firstname("Tristan")
                .email("tristan.ipaulus@gmail.com")
                .build();

        User savedUser = repository.save(updatedUser);
        assertEquals("tristan.ipaulus@gmail.com", savedUser.getEmail());
    }

    @Test
    public void delete() throws Exception {

        User savedUser = repository.save(user);
        assertNotNull(savedUser);

        repository.delete("U101");
        savedUser = repository.findOne("U101");
        assertNull(savedUser);
    }

    @Test
    public void findAll() throws Exception
    {
        repository.save(user);
        assertEquals(1, repository.count());

    }

}
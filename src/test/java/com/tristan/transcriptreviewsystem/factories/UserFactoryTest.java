package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.ReviewRecord;
import com.tristan.transcriptreviewsystem.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/14.
 */
public class UserFactoryTest {

    Map<String, Object> values;
    ReviewRecord record;
    User user;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("user_id", "U101");
        values.put("password", "password123");
        values.put("name", "Tristan");
        values.put("surname", "Paulus");
        values.put("email", "tristan.ipaulus@gmail.com");
        values.put("record", record);

    }

    @Test
    public void getUser() throws Exception {
        user = UserFactory.getUser(values);

        assertEquals("U101", user.getID());
        assertEquals("password123", user.getPassword());
        assertEquals("Tristan", user.getName());
        assertEquals("Paulus", user.getSurname());
        assertEquals("tristan.ipaulus@gmail.com", user.getEmail());
        assertSame(record, user.getRecord());

    }

}
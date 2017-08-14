package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.Manager;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/14.
 */
public class ManagerFactoryTest {

    Map<String, String> values;
    Manager manager;

    private String manager_id;
    private String name;
    private String surname;
    private String email;
    private String password;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        values.put("manager_id", "M101");
        values.put("name", "Marlin");
        values.put("surname", "Wayans");
        values.put("email", "marlin101@gmail.com");
        values.put("password", "WayansBros");


    }

    @Test
    public void getManager() throws Exception {

        manager = ManagerFactory.getManager(values);

        assertEquals("Marlin", manager.getName());
        assertEquals("Wayans", manager.getSurname());
        assertEquals("M101", manager.getID());

    }

}
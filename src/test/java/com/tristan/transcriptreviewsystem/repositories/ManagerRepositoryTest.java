package com.tristan.transcriptreviewsystem.repositories;

//import com.tristan.transcriptreviewsystem.domain.Manager;
//import com.tristan.transcriptreviewsystem.repositories.Impl.ManagerRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */

/*
public class ManagerRepositoryTest {

    String manager_id;
    String name;
    String surname;
    String email;
    String password;

    Manager manager;
    ManagerRepository repository;

    @Before
    public void setUp() throws Exception {

        Manager m = new Manager.Builder()
                .manager_id("M102")
                .firstname("David")
                .surname("beckham")
                .email("benditlikeme@gmail.com")
                .passwordkey("munited4life")
                .build();

        manager = new Manager.Builder()
                .manager_id("M101")
                .firstname("Frank")
                .surname("Roosevelt")
                .email("fdr@gmail.com")
                .passwordkey("murica")
                .build();

        repository.save(m);

    }
/*
    @Test
    public void create() throws Exception {
        Manager savedManager = (Manager)repository.save(manager);
        assertEquals("M101", savedManager.getID());
    }

    @Test
    public void read() throws Exception {
        repository.save(manager);
        Manager savedManager = (Manager)repository.findOne("M101");
        assertEquals("M101", savedManager.getID());
    }

    @Test
    public void update() throws Exception {

        Manager manager2 = new Manager.Builder()
                .manager_id("M101")
                .firstname("Franklin")
                .surname("Roosevelt")
                .email("fdr@gmail.com")
                .passwordkey("murica")
                .build();

        Manager savedManager = (Manager)repository.save(manager2);
        assertEquals("Franklin", savedManager.getFirstname());
    }

    @Test
    public void delete() throws Exception {
        assertNotNull(repository.findOne("M102"));
        repository.delete("M102");
        Manager m = (Manager)repository.findOne("M102");
        assertNull(m);
    }
*/
//}
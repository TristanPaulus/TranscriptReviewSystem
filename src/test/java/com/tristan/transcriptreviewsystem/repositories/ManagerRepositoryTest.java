package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Manager;
import com.tristan.transcriptreviewsystem.repositories.Impl.ManagerRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */


public class ManagerRepositoryTest {

    String manager_id;
    String name;
    String surname;
    String email;
    String password;

    Manager manager;
    ManagerRepositoryImpl repository;

    @Before
    public void setUp() throws Exception {
        repository = ManagerRepositoryImpl.getInstance();

        Manager m = new Manager.Builder()
                .manager_id("M102")
                .name("David")
                .surname("beckham")
                .email("benditlikeme@gmail.com")
                .password("munited4life")
                .build();

        manager = new Manager.Builder()
                .manager_id("M101")
                .name("Frank")
                .surname("Roosevelt")
                .email("fdr@gmail.com")
                .password("murica")
                .build();

        repository.create(m);

    }

    @Test
    public void create() throws Exception {
        Manager savedManager = repository.create(manager);
        assertEquals("M101", savedManager.getID());
    }

    @Test
    public void read() throws Exception {
        repository.create(manager);
        Manager savedManager = repository.read("M101");
        assertEquals("M101", savedManager.getID());
    }

    @Test
    public void update() throws Exception {

        Manager manager2 = new Manager.Builder()
                .manager_id("M101")
                .name("Franklin")
                .surname("Roosevelt")
                .email("fdr@gmail.com")
                .password("murica")
                .build();

        Manager savedManager = repository.update(manager2);
        assertEquals("Franklin", savedManager.getName());
    }

    @Test
    public void delete() throws Exception {
        assertNotNull(repository.read("M102"));
        repository.delete("M102");
        Manager m = repository.read("M102");
        assertNull(m);
    }

}
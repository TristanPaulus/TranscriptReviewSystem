package com.tristan.transcriptreviewsystem.repositories.Impl;

import com.tristan.transcriptreviewsystem.domain.Manager;
import com.tristan.transcriptreviewsystem.repositories.ManagerRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/15.
 */
public class ManagerRepositoryImpl implements ManagerRepository{

    private static ManagerRepositoryImpl repository = null;
    private Map<String, Manager> managerTable = new HashMap<String, Manager>();

    public static ManagerRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new ManagerRepositoryImpl();

        return repository;
    }

    public Manager create(Manager manager) {
        managerTable.put(manager.getID(), manager);
        Manager savedManager = managerTable.get(manager.getID());
        return savedManager;
    }

    public Manager read(String manager_id) {
        Manager manager = managerTable.get(manager_id);
        return manager;
    }

    public Manager update(Manager manager) {
        managerTable.put(manager.getID(), manager);
        Manager savedManager = managerTable.get(manager.getID());
        return savedManager;
    }

    public void delete(String manager_id) {
        managerTable.remove(manager_id);
    }
}

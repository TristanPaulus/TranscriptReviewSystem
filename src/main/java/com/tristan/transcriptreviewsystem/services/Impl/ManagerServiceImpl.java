/*
package com.tristan.transcriptreviewsystem.services.Impl;

import com.tristan.transcriptreviewsystem.domain.Manager;
import com.tristan.transcriptreviewsystem.repositories.ManagerRepository;
import com.tristan.transcriptreviewsystem.services.Interfaces.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/09/06.
 */
/*
@Service
public class ManagerServiceImpl /*implements ManagerService*//*{

    @Autowired
    private ManagerRepository repository;

    public Manager create(Manager entity){
        return (Manager)repository.save(entity);
    }

    public Manager read(String value){
        return (Manager)repository.findOne(value);
    }

    public Manager update(Manager entity) {
        return (Manager)repository.save(entity);
    }

    public void delete(String value) {
        repository.delete(value);
    }

    public List<Manager> getAll(){
        List<Manager> managerList = new ArrayList<Manager>();
        Iterable<Manager> managers = repository.findAll();
        for(Manager manager : managers){
            managerList.add(manager);
        }
        return managerList;
    }

}
*/
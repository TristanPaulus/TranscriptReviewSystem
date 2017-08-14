package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Manager;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface ManagerRepository {

    Manager create(Manager manager);
    Manager read(String manager_id);
    Manager update(Manager manager);
    void delete(String manager_id);

}

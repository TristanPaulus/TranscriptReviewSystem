package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface UserRepository extends CrudRepository<User, String>{
/*
    User create(User user);
    User read(String user_id);
    User update(User user);
    void delete(String user_id);
    List<User> findAll();
*/
}

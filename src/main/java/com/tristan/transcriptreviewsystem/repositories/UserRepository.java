package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.User;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface UserRepository {

    User create(User user);
    User read(String user_id);
    User update(User user);
    void delete(String user_id);

}

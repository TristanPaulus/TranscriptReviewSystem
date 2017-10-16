package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.User;

import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class UserFactory {

    public static User getUser(Map<String, Object> values)
    {
        User user = new User.Builder()
                .user_id((String) values.get("user_id"))
                .passwordkey((String) values.get("passwordkey"))
                .firstname((String) values.get("firstname"))
                .surname((String) values.get("surname"))
                .email((String) values.get("email"))
                .build();

        return user;
    }

}

package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.ReviewRecord;
import com.tristan.transcriptreviewsystem.domain.User;

import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class UserFactory {

    private String user_id;
    private String password;
    private String name;
    private String surname;
    private String email;
    private ReviewRecord record;

    public static User getUser(Map<String, Object> values)
    {
        User user = new User.Builder()
                .user_id((String) values.get("user_id"))
                .password((String) values.get("password"))
                .name((String) values.get("name"))
                .surname((String) values.get("surname"))
                .email((String) values.get("email"))
                .record((ReviewRecord) values.get("record"))
                .build();

        return user;
    }

}

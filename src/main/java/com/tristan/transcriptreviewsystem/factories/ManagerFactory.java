package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.Manager;

import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class ManagerFactory {

    public static Manager getManager(Map<String, String> values)
    {
        Manager manager = new Manager.Builder()
                .manager_id(values.get("manager_id"))
                .name(values.get("name"))
                .surname(values.get("surname"))
                .email(values.get("email"))
                .password(values.get("password"))
                .build();

        return manager;
    }

}

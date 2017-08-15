package com.tristan.transcriptreviewsystem.domain;

/**
 * Created by Tristan on 2017/08/11.
 */
public class User implements Person{

    private String user_id;
    private String password;
    private String name;
    private String surname;
    private String email;
    private ReviewRecord record;

    public User(Builder b)
    {
        this.user_id = b.user_id;
        this.password = b.password;
        this.name = b.name;
        this.surname = b.surname;
        this.email = b.email;
        this.record = b.record;
    }

    public static class Builder
    {
        private String user_id;
        private String password;
        private String name;
        private String surname;
        private String email;
        private ReviewRecord record;

        public Builder user_id(String value)
        {
            this.user_id = value;
            return this;
        }

        public Builder password(String value)
        {
            this.password = value;
            return this;
        }

        public Builder name(String value)
        {
            this.name = value;
            return this;
        }

        public Builder surname(String value)
        {
            this.surname = value;
            return this;
        }

        public Builder email(String value)
        {
            this.email = value;
            return this;
        }

        public Builder record(ReviewRecord value)
        {
            this.record = value;
            return this;
        }

        public User build()
        {
            return new User(this);
        }

    }

    public String getID() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ReviewRecord getRecord() {
        return record;
    }

    public String getEmail() {
        return email;
    }
}

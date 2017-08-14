package com.tristan.transcriptreviewsystem.domain;

/**
 * Created by Tristan on 2017/08/11.
 */
public class Manager implements Person{

    private String manager_id;
    private String name;
    private String surname;
    private String email;
    private String password;

    public Manager(Builder b)
    {
        this.manager_id = b.manager_id;
        this.name = b.name;
        this.surname = b.surname;
        this.email = b.email;
        this.password = b.password;
    }

    public static class Builder
    {
        private String manager_id;
        private String name;
        private String surname;
        private String email;
        private String password;

        public Builder manager_id(String value)
        {
            this.manager_id = value;
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

        public Builder password(String value)
        {
            this.password = value;
            return this;
        }

        public Manager build()
        {
            return new Manager(this);
        }
    }

    public String getPassword() {
        return password;
    }

    public String getID() {
        return manager_id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}

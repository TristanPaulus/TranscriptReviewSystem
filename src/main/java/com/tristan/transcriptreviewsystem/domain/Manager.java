package com.tristan.transcriptreviewsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Tristan on 2017/08/11.
 */

/*
@Entity
public class Manager implements Person, Serializable, Comparable<Manager>{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String manager_id;
    private String firstname;
    private String surname;
    private String email;
    private String passwordkey;

    public Manager(Builder b)
    {
        this.manager_id = b.manager_id;
        this.firstname = b.firstname;
        this.surname = b.surname;
        this.email = b.email;
        this.passwordkey = b.passwordkey;
    }

    public static class Builder
    {
        private String manager_id;
        private String firstname;
        private String surname;
        private String email;
        private String passwordkey;

        public Builder manager_id(String value)
        {
            this.manager_id = value;
            return this;
        }

        public Builder firstname(String value)
        {
            this.firstname = value;
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

        public Builder passwordkey(String value)
        {
            this.passwordkey = value;
            return this;
        }

        public Manager build()
        {
            return new Manager(this);
        }
    }

    public String getPasswordkey() {
        return passwordkey;
    }

    public String getID() {
        return manager_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int compareTo(Manager m) {
        return manager_id.compareTo(m.getID());
    }
}
*/
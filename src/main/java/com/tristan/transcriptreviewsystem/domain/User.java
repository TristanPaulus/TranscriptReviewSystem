package com.tristan.transcriptreviewsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Tristan on 2017/08/11.
 */
@Entity
public class User implements Person, Serializable, Comparable<User>{

    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private String user_id;
    private String passwordkey;
    private String firstname;
    private String surname;
    private String email;

    public User()
    {
        /*this.user_id = "test";
        this.passwordkey = "testpasswordkey";
        this.firstname = "testfirstname";
        this.surname = "testsurname";
        this.email = "testemail";*/
    }

    public User(Builder b)
    {
        this.user_id = b.user_id;
        this.passwordkey = b.passwordkey;
        this.firstname = b.firstname;
        this.surname = b.surname;
        this.email = b.email;
    }

    public static class Builder
    {
        private String user_id;
        private String passwordkey;
        private String firstname;
        private String surname;
        private String email;

        public Builder user_id(String value)
        {
            this.user_id = value;
            return this;
        }

        public Builder passwordkey(String value)
        {
            this.passwordkey = value;
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

        public User build()
        {
            return new User(this);
        }

    }

    public String getID() {
        return user_id;
    }

    public String getPasswordkey() {
        return passwordkey;
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

    public int compareTo(User user) {
        return user_id.compareTo(user.getID());
    }
}

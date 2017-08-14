package com.tristan.transcriptreviewsystem.domain;

/**
 * Created by Tristan on 2017/08/11.
 */
public class Participant implements Person{

    private String participant_id;
    private String name;
    private String surname;
    private String email;

    public Participant(Builder b)
    {
        this.participant_id = b.participant_id;
        this.name = b.name;
        this.surname = b.surname;
        this.email = b.email;
    }

    public static class Builder
    {
        private String participant_id;
        private String name;
        private String surname;
        private String email;

        public Builder participant_id(String value)
        {
            this.participant_id = value;
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

        public Participant build()
        {
            return new Participant(this);
        }

    }

    public String getID() {return participant_id;}

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

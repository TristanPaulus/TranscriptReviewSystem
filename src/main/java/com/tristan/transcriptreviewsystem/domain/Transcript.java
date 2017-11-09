package com.tristan.transcriptreviewsystem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Tristan on 2017/08/11.
 */
@Entity
public class Transcript implements Serializable, Comparable<Transcript>{

    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private String transcript_id;
    private String clip;
    private Date date;
//    private User transcriber;
    private String transcriber_id;
    private String text;

    public Transcript()
    {

    }

    public Transcript(Builder b)
    {
        this.transcript_id = b.transcript_id;
        this.clip = b.clip;
        this.date = b.date;
        this.transcriber_id = b.transcriber_id;
        this.text = b.text;
    }

    public static class Builder
    {
        private String transcript_id;
        private String clip;
        private Date date;
        private String transcriber_id;
        private String text;

        public Builder transcript_id(String value)
        {
            this.transcript_id = value;
            return this;
        }

        public Builder transcriber_id(String value)
        {
            this.transcriber_id = value;
            return this;
        }

        public Builder clip(String value)
        {
            this.clip = value;
            return this;
        }

        public Builder date(Date value)
        {
            this.date = value;
            return this;
        }
/*
        public Builder transcriber(User value)
        {
            this.transcriber = value;
            return this;
        }
*/
        public Builder text(String value)
        {
            this.text = value;
            return this;
        }

        public Transcript build()
        {
            return new Transcript(this);
        }

    }

    public String getTranscript_id() {
        return transcript_id;
    }

    public String getClip() {
        return clip;
    }

    public Date getDate() {
        return date;
    }

/*    public User getTranscriber() {
        return transcriber;
    }
*/

    public String getTranscriber_id() {
        return transcriber_id;
    }

    public String getText() {
        return text;
    }

    public int compareTo(Transcript t) {
        return transcript_id.compareTo(t.getTranscript_id());
    }
}

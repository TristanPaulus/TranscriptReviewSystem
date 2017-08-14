package com.tristan.transcriptreviewsystem.domain;

import java.util.Date;

/**
 * Created by Tristan on 2017/08/11.
 */
public class Transcript {

    private String transcript_id;
    private AudioClip clip;
    private Date date;
    private User transcriber;

    public Transcript(Builder b)
    {
        this.transcript_id = b.transcript_id;
        this.clip = b.clip;
        this.date = b.date;
        this.transcriber = b.transcriber;
    }

    public static class Builder
    {
        private String transcript_id;
        private AudioClip clip;
        private Date date;
        private User transcriber;

        public Builder transcript_id(String value)
        {
            this.transcript_id = value;
            return this;
        }

        public Builder clip(AudioClip value)
        {
            this.clip = value;
            return this;
        }

        public Builder date(Date value)
        {
            this.date = value;
            return this;
        }

        public Builder transcriber(User value)
        {
            this.transcriber = value;
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

    public AudioClip getClip() {
        return clip;
    }

    public Date getDate() {
        return date;
    }

    public User getTranscriber() {
        return transcriber;
    }


}

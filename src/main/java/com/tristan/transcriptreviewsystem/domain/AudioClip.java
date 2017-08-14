package com.tristan.transcriptreviewsystem.domain;

/**
 * Created by Tristan on 2017/08/11.
 */
public class AudioClip {

    private String audio_id;
    private String clip_name;
    private double duration;
    private Meeting meeting;

    public AudioClip(Builder b)
    {
        this.audio_id = b.audio_id;
        this.clip_name = b.clip_name;
        this.duration = b.duration;
        this.meeting = b.meeting;
    }

    public static class Builder
    {
        private String audio_id;
        private String clip_name;
        private double duration;
        private Meeting meeting;

        public Builder audio_id(String value)
        {
            this.audio_id = value;
            return this;
        }

        public Builder clip_name(String value)
        {
            this.clip_name = value;
            return this;
        }

        public Builder duration(double value)
        {
            this.duration = value;
            return this;
        }

        public Builder meeting(Meeting value)
        {
            this.meeting = value;
            return this;
        }

        public AudioClip build()
        {
            return new AudioClip(this);
        }
    }

    public String getAudio_id() {
        return audio_id;
    }

    public String getClip_name() {
        return clip_name;
    }

    public double getDuration() {
        return duration;
    }

    public Meeting getMeeting() {
        return meeting;
    }
}

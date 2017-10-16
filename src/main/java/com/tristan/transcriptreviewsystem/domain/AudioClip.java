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
public class AudioClip implements Serializable, Comparable<AudioClip>{

    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private String audio_id;
    private String clip_name;
    private double duration;

    public AudioClip(Builder b)
    {
        this.audio_id = b.audio_id;
        this.clip_name = b.clip_name;
        this.duration = b.duration;
    }

    public static class Builder
    {
        private String audio_id;
        private String clip_name;
        private double duration;

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


    public int compareTo(AudioClip clip) {
        return audio_id.compareTo(clip.getAudio_id());
    }
}

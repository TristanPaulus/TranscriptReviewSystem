package com.tristan.transcriptreviewsystem.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/08/11.
 */
public class Meeting {

    private String meeting_id;
    private String meeting_name;
    private String location;
    private List<Participant> participants;
    private List<AudioClip> clips;

    public Meeting(Builder b)
    {
        this.meeting_id = b.meeting_id;
        this.meeting_name = b.meeting_name;
        this.location = b.location;
        this.participants = b.participants;
        this.clips = b.clips;
    }

    public static class Builder
    {
        private String meeting_id;
        private String meeting_name;
        private String location;
        private List<Participant> participants;
        private List<AudioClip> clips;

        public Builder meeting_id(String value)
        {
            this.meeting_id = value;
            return this;
        }

        public Builder meeting_name(String value)
        {
            this.meeting_name = value;
            return this;
        }

        public Builder location(String value)
        {
            this.location = value;
            return this;
        }

        public Builder participants(List<Participant> value)
        {
            this.participants = new ArrayList<Participant>();
            this.participants = value;
            return this;
        }

        public Builder clips(List<AudioClip> value)
        {
            this.clips = new ArrayList<AudioClip>();
            this.clips = value;
            return this;
        }

        public Meeting build()
        {
            return new Meeting(this);
        }

    }

    public void addParticipant(Participant p)
    {
        this.participants.add(p);
    }

    public void addClip(AudioClip a)
    {
        this.clips.add(a);
    }

    public List<AudioClip> getClips() {
        return clips;
    }

    public String getMeeting_id() {
        return meeting_id;
    }

    public String getMeeting_name() {
        return meeting_name;
    }

    public String getLocation() {
        return location;
    }

    public List<Participant> getParticipants() {
        return participants;
    }


}

package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Meeting;
import com.tristan.transcriptreviewsystem.domain.Participant;
import com.tristan.transcriptreviewsystem.repositories.Impl.MeetingRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */
public class MeetingRepositoryTest {

    List<Participant> participants;
    List<AudioClip> clips;
    Meeting meeting;

    MeetingRepositoryImpl repository;

    @Before
    public void setUp() throws Exception {

        repository = MeetingRepositoryImpl.getInstance();
        participants = new ArrayList<Participant>();
        clips = new ArrayList<AudioClip>();

        meeting = new Meeting.Builder()
                .meeting_id("MT101")
                .meeting_name("State of the Nation Address")
                .location("Parliament")
                .participants(participants)
                .clips(clips)
                .build();
    }

    @Test
    public void create() throws Exception {
        Meeting savedMeeting = repository.create(meeting);
        assertEquals("MT101", savedMeeting.getMeeting_id());
    }

    @Test
    public void read() throws Exception {
        repository.create(meeting);
        Meeting savedMeeting = repository.read("MT101");
        assertEquals("MT101", savedMeeting.getMeeting_id());
    }

    @Test
    public void update() throws Exception {

        repository.create(meeting);

        Meeting meeting2 = new Meeting.Builder()
                .meeting_id("MT101")
                .meeting_name("Visit to Nkandla")
                .location("Nkandla")
                .participants(participants)
                .clips(clips)
                .build();
        Meeting savedMeeting = repository.update(meeting2);

        assertEquals("Visit to Nkandla", savedMeeting.getMeeting_name());

    }

    @Test
    public void delete() throws Exception {

        Meeting m = repository.create(meeting);
        assertNotNull(m);
        repository.delete("MT101");
        m = repository.read("MT101");
        assertNull(m);

    }

}
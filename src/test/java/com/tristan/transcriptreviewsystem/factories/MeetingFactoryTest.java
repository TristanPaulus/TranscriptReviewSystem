package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Meeting;
import com.tristan.transcriptreviewsystem.domain.Participant;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/14.
 */
public class MeetingFactoryTest {

    List<Participant> participants;
    List<AudioClip> clips;

    Map<String, Object> values;
    Meeting meeting;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("meeting_id", "M1012");
        values.put("meeting_name", "State of the Nation address");
        values.put("location", "Parliament");
        values.put("participants", participants);
        values.put("clips", clips);



    }

    @Test
    public void getMeeting() throws Exception {

        meeting = MeetingFactory.getMeeting(values);

        assertEquals("M1012", meeting.getMeeting_id());
        assertEquals("State of the Nation address", meeting.getMeeting_name());
        assertEquals("Parliament", meeting.getLocation());

    }

}
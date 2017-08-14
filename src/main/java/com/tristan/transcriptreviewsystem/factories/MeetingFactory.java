package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Meeting;
import com.tristan.transcriptreviewsystem.domain.Participant;

import java.util.List;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class MeetingFactory {

    public static Meeting getMeeting(Map<String, Object> values)
    {
        Meeting meeting = new Meeting.Builder()
                .meeting_id((String) values.get("meeting_id"))
                .meeting_name((String) values.get("meeting_name"))
                .location((String) values.get("location"))
                .participants((List<Participant>) values.get("participants"))
                .clips((List<AudioClip>) values.get("clips"))
                .build();

        return meeting;
    }

}

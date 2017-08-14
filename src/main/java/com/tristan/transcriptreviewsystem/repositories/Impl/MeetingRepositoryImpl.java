package com.tristan.transcriptreviewsystem.repositories.Impl;

import com.tristan.transcriptreviewsystem.domain.Meeting;
import com.tristan.transcriptreviewsystem.repositories.MeetingRepository;

import java.util.Map;

/**
 * Created by Tristan on 2017/08/15.
 */
public class MeetingRepositoryImpl implements MeetingRepository{

    private static MeetingRepositoryImpl repository = null;
    private Map<String, Meeting> meetingTable;

    public static MeetingRepositoryImpl getInstance()
    {
        if (repository == null)
            repository = new MeetingRepositoryImpl();
        return repository;
    }

    public Meeting create(Meeting meeting) {
        meetingTable.put(meeting.getMeeting_id(), meeting);
        Meeting savedMeeting = meetingTable.get(meeting.getMeeting_id());
        return savedMeeting;
    }

    public Meeting read(String meeting_id) {
        Meeting meeting = meetingTable.get(meeting_id);
        return meeting;
    }

    public Meeting update(Meeting meeting) {
        meetingTable.put(meeting.getMeeting_id(), meeting);
        Meeting savedMeeting = meetingTable.get(meeting.getMeeting_id());
        return savedMeeting;
    }

    public void delete(String meeting_id) {
        meetingTable.remove(meeting_id);
    }
}

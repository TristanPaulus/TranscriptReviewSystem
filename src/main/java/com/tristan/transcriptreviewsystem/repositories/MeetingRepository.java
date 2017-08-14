package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Meeting;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface MeetingRepository {

    Meeting create(Meeting meeting);
    Meeting read(String meeting_id);
    Meeting update(Meeting meeting);
    void delete(String meeting_id);
}

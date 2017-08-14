package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Participant;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface ParticipantRepository {

    Participant create(Participant participant);
    Participant read(String participant_id);
    Participant update(Participant participant);
    void delete(String participant_id);
}

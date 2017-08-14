package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.Participant;

import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class ParticipantFactory {

    public static Participant getParticipant(Map<String, String> values)
    {
        Participant participant = new Participant.Builder()
                .participant_id(values.get("participant_id"))
                .name(values.get("name"))
                .surname(values.get("surname"))
                .email(values.get("email"))
                .build();

        return participant;
    }

}

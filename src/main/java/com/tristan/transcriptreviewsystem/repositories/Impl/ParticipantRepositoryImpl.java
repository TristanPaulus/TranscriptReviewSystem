package com.tristan.transcriptreviewsystem.repositories.Impl;

import com.tristan.transcriptreviewsystem.domain.Participant;
import com.tristan.transcriptreviewsystem.repositories.ParticipantRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/15.
 */
public class ParticipantRepositoryImpl implements ParticipantRepository{

    private static ParticipantRepositoryImpl repository = null;
    private Map<String, Participant> participantTable = new HashMap<String, Participant>();

    public static ParticipantRepositoryImpl getInstance()
    {
        if (repository == null)
            repository = new ParticipantRepositoryImpl();
        return repository;
    }

    public Participant create(Participant participant) {
        participantTable.put(participant.getID(), participant);
        Participant savedParticipant = participantTable.get(participant.getID());
        return savedParticipant;
    }

    public Participant read(String participant_id) {

        Participant participant = participantTable.get(participant_id);
        return participant;
    }

    public Participant update(Participant participant) {
        participantTable.put(participant.getID(), participant);
        Participant savedParticipant = participantTable.get(participant.getID());
        return savedParticipant;
    }

    public void delete(String participant_id) {
        participantTable.remove(participant_id);
    }
}

package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Participant;
import com.tristan.transcriptreviewsystem.repositories.Impl.ParticipantRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */



public class ParticipantRepositoryTest {

    private String participant_id;
    private String name;
    private String surname;
    private String email;

    ParticipantRepositoryImpl repository;
    Participant participant;

    @Before
    public void setUp() throws Exception {

        repository = ParticipantRepositoryImpl.getInstance();

        participant = new Participant.Builder()
                .participant_id("P101")
                .name("Jacob")
                .surname("Zuma")
                .email("bigspear@hotmail.com")
                .build();

    }

    @Test
    public void create() throws Exception {
        Participant savedParticipant = repository.create(participant);
        assertEquals("Jacob", savedParticipant.getName());
    }

    @Test
    public void read() throws Exception {
        repository.create(participant);
        Participant savedParticipant = repository.read("P101");
        assertEquals("Zuma", savedParticipant.getSurname());
    }

    @Test
    public void update() throws Exception {

        Participant participant2 = new Participant.Builder()
                .participant_id("P101")
                .name("Jacob")
                .surname("Zuma")
                .email("bigspearHEHE@hotmail.com")
                .build();

        Participant savedParticipant = repository.update(participant2);
        assertEquals("bigspearHEHE@hotmail.com", savedParticipant.getEmail());

    }

    @Test
    public void delete() throws Exception {
        Participant p = repository.create(participant);
        assertNotNull(p);
        repository.delete("P101");
        Participant p2 = repository.read("P101");
        assertNull(p2);
    }

}
package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.Participant;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/14.
 */
public class ParticipantFactoryTest {

    private String participant_id;
    private String name;
    private String surname;
    private String email;

    Map<String, String> values;
    Participant participant;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        values.put("participant_id", "P101");
        values.put("name", "Tristan");
        values.put("surname", "Paulus");
        values.put("email", "tristan.ipaulus@gmail.com");

    }

    @Test
    public void getParticipant() throws Exception {

        participant = ParticipantFactory.getParticipant(values);

        assertEquals("P101", participant.getID());
        assertEquals("Tristan", participant.getName());
        assertEquals("Paulus", participant.getSurname());
        assertEquals("tristan.ipaulus@gmail.com", participant.getEmail());

    }

}
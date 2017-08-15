package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;
import com.tristan.transcriptreviewsystem.repositories.Impl.TranscriptRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */
public class TranscriptRepositoryTest {

    AudioClip clip;
    Date date;
    User transcriber;

    TranscriptRepositoryImpl repository;
    Transcript transcript;

    @Before
    public void setUp() throws Exception {

        repository = TranscriptRepositoryImpl.getInstance();
        date = new Date();

        transcript = new Transcript.Builder()
                .transcript_id("T101")
                .clip(clip)
                .date(date)
                .transcriber(transcriber)
                .build();

    }

    @Test
    public void create() throws Exception {
        Transcript savedTranscript = repository.create(transcript);
        assertEquals("T101", savedTranscript.getTranscript_id());
    }

    @Test
    public void read() throws Exception {
        repository.create(transcript);
        Transcript savedTranscript = repository.read("T101");
        assertEquals(date, savedTranscript.getDate());
    }

    @Test
    public void update() throws Exception {

        User newTranscriber = new User.Builder()
                .build();

        Transcript newTranscript = new Transcript.Builder()
                .transcript_id("T101")
                .clip(clip)
                .date(date)
                .transcriber(newTranscriber)
                .build();

        repository.create(transcript);

        Transcript savedTranscript = repository.update(newTranscript);

        assertSame(newTranscriber, savedTranscript.getTranscriber());

    }

    @Test
    public void delete() throws Exception {

        Transcript savedTranscript = repository.create(transcript);
        assertNotNull(savedTranscript);

        repository.delete("T101");
        savedTranscript = repository.read("T101");
        assertNull(savedTranscript);
    }

}
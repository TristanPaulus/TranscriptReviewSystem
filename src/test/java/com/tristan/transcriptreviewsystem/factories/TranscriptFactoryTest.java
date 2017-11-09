package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/14.
 */
public class TranscriptFactoryTest {

    AudioClip clip;
    User transcriber;

    Transcript transcript;
    Map<String, Object> values;
    Date date;

    @Before
    public void setUp() throws Exception {

        date = new Date();
        values = new HashMap<String, Object>();
        values.put("transcript_id", "T101");
        values.put("clip", "100");
        values.put("transcriber", transcriber);
        values.put("date", date);
    }

    @Test
    public void getTranscript() throws Exception {
        transcript = TranscriptFactory.getTranscript(values);
        assertEquals("T101", transcript.getTranscript_id());
//        assertSame(clip, transcript.getClip());
//        assertSame(transcriber, transcript.getTranscriber_id());
        assertSame(date, transcript.getDate());
    }

}
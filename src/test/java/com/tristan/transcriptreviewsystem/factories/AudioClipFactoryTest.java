package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Meeting;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/14.
 */
public class AudioClipFactoryTest {

    Map<String, Object> values;
    AudioClip clip;

    private String audio_id;
    private String clip_name;
    private double duration;
    private Meeting meeting;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("audio_id", "AUD_100");
        values.put("clip_name", "State of the nation address(5)");
        values.put("duration", 0.5);
        values.put("meeting", meeting);


    }

    @Test
    public void getAudioClip() throws Exception {

        clip = AudioClipFactory.getAudioClip(values);

        assertEquals("AUD_100", clip.getAudio_id());
        assertEquals("State of the nation address(5)", clip.getClip_name());

    }

}
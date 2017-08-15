package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Meeting;
import com.tristan.transcriptreviewsystem.factories.AudioClipFactory;
import com.tristan.transcriptreviewsystem.repositories.Impl.AudioClipRepositoryImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */
public class AudioClipRepositoryTest {

    Meeting meeting;
    Map<String, Object> values;
    AudioClipRepository repository;
    AudioClip clip;

    @BeforeMethod
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();

        values.put("audio_id", "AUD001");
        values.put("clip_name", "Financial Planning");
        values.put("duration", 1.5);
        values.put("meeting", meeting);

        clip = AudioClipFactory.getAudioClip(values);

        repository = AudioClipRepositoryImpl.getInstance();
    }

    @Test
    public void testCreate() throws Exception {

        AudioClip savedClip = repository.create(clip);
        assertEquals("AUD001", savedClip.getAudio_id());

    }

    @Test(dependsOnMethods = "testCreate")
    public void testRead() throws Exception {

        AudioClip savedClip = repository.create(clip);
        AudioClip readClip = repository.read("AUD001");
        assertEquals("Financial Planning", readClip.getClip_name());

    }

    @Test(dependsOnMethods = "testCreate")
    public void testUpdate() throws Exception {
        AudioClip newClip = new AudioClip.Builder()
                .audio_id("AUD001")
                .clip_name("Financial and political planning")
                .duration(0.5)
                .meeting(meeting)
                .build();

        AudioClip updatedClip = repository.update(newClip);
        assertEquals("Financial and political planning", updatedClip.getClip_name());

    }

    @Test(dependsOnMethods = "testCreate")
    public void testDelete() throws Exception {
        repository.delete("AUD001");
        AudioClip check = repository.read("AUD001");
        assertNull(check);
    }

}
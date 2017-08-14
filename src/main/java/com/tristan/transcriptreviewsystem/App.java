package com.tristan.transcriptreviewsystem;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Meeting;
import com.tristan.transcriptreviewsystem.factories.AudioClipFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String, Object> values;
        AudioClip clip;

        Meeting meeting = new Meeting.Builder()
                .build();

        values = new HashMap<String, Object>();
        values.put("audio_id", "AUD_100");
        values.put("clip_name", "State of the nation address(5)");
        values.put("duration", 0.5);
        values.put("meeting", meeting);

        clip = AudioClipFactory.getAudioClip(values);

        System.out.println(clip.getAudio_id());
        System.out.println(clip.getClip_name());
        System.out.println(clip.getDuration());

    }
}

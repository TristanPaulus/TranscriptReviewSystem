package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Meeting;

import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class AudioClipFactory {

    //String audio_id, String clip_name, double duration, Meeting meeting


    public static AudioClip getAudioClip(Map<String, Object> values)
    {
        AudioClip clip = new AudioClip.Builder()
                .audio_id((String) values.get("audio_id"))
                .clip_name((String) values.get("clip_id"))
                .duration((Double) values.get("duration"))
                .meeting((Meeting) values.get("meeting"))
                .build();

        return clip;
    }

}

package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Meeting;

import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class AudioClipFactory {

    public static AudioClip getAudioClip(Map<String, Object> values)
    {
        AudioClip clip = new AudioClip.Builder()
                .audio_id((String) values.get("audio_id"))
                .clip_name((String) values.get("clip_name"))
                .duration((Double) values.get("duration"))
                .meeting((Meeting) values.get("meeting"))
                .build();

        return clip;
    }

}

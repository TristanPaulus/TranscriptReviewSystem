package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;

import java.util.Date;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class TranscriptFactory {

    public static Transcript getTranscript(Map<String, Object> values)
    {
        Transcript transcript = new Transcript.Builder()
                .transcript_id((String) values.get("transcript_id"))
                .clip((String) values.get("clip"))
                .date((Date) values.get("date"))
                .transcriber_id((String) values.get("transcriber_id"))
                .text((String) values.get("text"))
                .build();

        return transcript;
    }


}

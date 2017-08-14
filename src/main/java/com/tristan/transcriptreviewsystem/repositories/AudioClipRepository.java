package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;

/**
 * Created by Tristan on 2017/08/14.
 */
public interface AudioClipRepository {

    AudioClip create(AudioClip clip);
    AudioClip read(String audio_id);
    AudioClip update(AudioClip clip);
    void delete(String audio_id);

}

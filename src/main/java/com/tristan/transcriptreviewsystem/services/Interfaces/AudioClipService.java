package com.tristan.transcriptreviewsystem.services.Interfaces;

import com.tristan.transcriptreviewsystem.domain.AudioClip;

/**
 * Created by Tristan on 2017/09/06.
 */
public interface AudioClipService {

    public AudioClip create(AudioClip entity);
    public AudioClip read(String value);

}

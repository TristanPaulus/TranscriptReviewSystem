package com.tristan.transcriptreviewsystem.repositories.Impl;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.repositories.AudioClipRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/15.
 */
public class AudioClipRepositoryImpl /*implements AudioClipRepository*/ {
/*
    private static AudioClipRepositoryImpl repository = null;
    private Map<String, AudioClip> clipTable = new HashMap<String, AudioClip>();

    public static AudioClipRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new AudioClipRepositoryImpl();


        return repository;
    }

    public AudioClip create(AudioClip clip) {

        clipTable.put(clip.getAudio_id(), clip);
        AudioClip savedClip = clipTable.get(clip.getAudio_id());
        return savedClip;
    }

    public AudioClip read(String audio_id) {
        AudioClip clip = clipTable.get(audio_id);
        return clip;
    }

    public AudioClip update(AudioClip clip) {

        clipTable.put(clip.getAudio_id(), clip);
        AudioClip savedClip = clipTable.get(clip.getAudio_id());
        return savedClip;
    }

    public void delete(String audio_id) {
        clipTable.remove(audio_id);
    }*/
}

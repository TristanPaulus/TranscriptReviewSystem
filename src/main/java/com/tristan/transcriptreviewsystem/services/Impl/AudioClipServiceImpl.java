package com.tristan.transcriptreviewsystem.services.Impl;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
//import com.tristan.transcriptreviewsystem.domain.Manager;
import com.tristan.transcriptreviewsystem.repositories.AudioClipRepository;
import com.tristan.transcriptreviewsystem.services.Interfaces.AudioClipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/09/06.
 */
@Service
public class  AudioClipServiceImpl /*implements AudioClipService */{

    @Autowired
    private AudioClipRepository repository;

    public AudioClip create(AudioClip entity) {
        return repository.save(entity);
    }

    public AudioClip read(String value) {
        return repository.findOne(value);
    }

    public AudioClip update(AudioClip entity) {
        return repository.save(entity);
    }

    public void delete(String value) {
        repository.delete(value);
    }

    public List<AudioClip> getAll(){
        List<AudioClip> clipList = new ArrayList<AudioClip>();
        Iterable<AudioClip> clips = repository.findAll();
        for(AudioClip clip : clips){
            clipList.add(clip);
        }
        return clipList;
    }
}

package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tristan on 2017/08/14.
 */
public interface AudioClipRepository extends CrudRepository<AudioClip, String>{

    //AudioClip create(AudioClip clip);
    //AudioClip read(String audio_id);
    //-AudioClip update(AudioClip clip);
    //-void delete(String audio_id);

}

package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Transcript;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface TranscriptRepository extends CrudRepository<Transcript, String>{
/*
    Transcript create(Transcript transcript);
    Transcript read(String transcript_id);
    /*Transcript update(Transcript transcript);
    void delete(String transcript_id);
*/


}

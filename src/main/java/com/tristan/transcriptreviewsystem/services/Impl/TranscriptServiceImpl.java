package com.tristan.transcriptreviewsystem.services.Impl;

import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.repositories.TranscriptRepository;
import com.tristan.transcriptreviewsystem.services.Interfaces.TranscriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/09/06.
 */
@Service
public class TranscriptServiceImpl /*implements TranscriptService*/{

    @Autowired
    private TranscriptRepository repository;

    public Transcript create(Transcript entity) {
        return repository.save(entity);
    }

    public Transcript read(String value) {
        return repository.findOne(value);
    }

    public Transcript update(Transcript entity) {
        return repository.save(entity);
    }

    public void delete(String value) {
        repository.delete(value);
    }

    public List<Transcript> getAll() {
        List<Transcript> transcriptList = new ArrayList<Transcript>();
        Iterable<Transcript> transcripts = repository.findAll();
        for (Transcript transcript : transcripts) {
            transcriptList.add(transcript);
        }
        return transcriptList;
    }
}


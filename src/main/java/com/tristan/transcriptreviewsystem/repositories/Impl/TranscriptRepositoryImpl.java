package com.tristan.transcriptreviewsystem.repositories.Impl;

import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.repositories.TranscriptRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/15.
 */
public class TranscriptRepositoryImpl /*implements TranscriptRepository*/ {
/*
    private static TranscriptRepositoryImpl repository = null;
    private Map<String, Transcript> transcriptTable = new HashMap<String, Transcript>();

    public static TranscriptRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new TranscriptRepositoryImpl();
        return repository;
    }

    public Transcript create(Transcript transcript) {
        transcriptTable.put(transcript.getTranscript_id(), transcript);
        Transcript savedTranscript = transcriptTable.get(transcript.getTranscript_id());
        return savedTranscript;
    }

    public Transcript read(String transcript_id) {
        Transcript savedTranscript = transcriptTable.get(transcript_id);
        return savedTranscript;
    }

    public Transcript update(Transcript transcript) {
        transcriptTable.put(transcript.getTranscript_id(), transcript);
        Transcript savedTranscript = transcriptTable.get(transcript.getTranscript_id());
        return savedTranscript;
    }

    public void delete(String transcript_id) {
        transcriptTable.remove(transcript_id);
    }
*/
}

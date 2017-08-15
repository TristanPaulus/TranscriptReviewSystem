package com.tristan.transcriptreviewsystem.repositories.Impl;

import com.tristan.transcriptreviewsystem.domain.ReviewRecord;
import com.tristan.transcriptreviewsystem.repositories.ReviewRecordRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/15.
 */
public class ReviewRecordRepositoryImpl implements ReviewRecordRepository {

    private static ReviewRecordRepositoryImpl repository;
    private Map<String, ReviewRecord> reviewRecordTable = new HashMap<String, ReviewRecord>( );

    public static ReviewRecordRepositoryImpl getInstance()
    {
        if(repository==null)
            repository = new ReviewRecordRepositoryImpl();
        return repository;
    }

    public ReviewRecord create(ReviewRecord record) {
        reviewRecordTable.put(record.getRecord_id(), record);
        ReviewRecord savedRecord = reviewRecordTable.get(record.getRecord_id());
        return savedRecord;
    }

    public ReviewRecord read(String record_id) {
        ReviewRecord savedRecord = reviewRecordTable.get(record_id);
        return savedRecord;
    }

    public ReviewRecord update(ReviewRecord record) {
        reviewRecordTable.put(record.getRecord_id(), record);
        ReviewRecord savedRecord = reviewRecordTable.get(record.getRecord_id());
        return savedRecord;
    }

    public void delete(String record_id) {
        reviewRecordTable.remove(record_id);
    }
}

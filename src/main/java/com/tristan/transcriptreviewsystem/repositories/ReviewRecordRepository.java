package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.ReviewRecord;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface ReviewRecordRepository {

    ReviewRecord create(ReviewRecord record);
    ReviewRecord read(String record_id);
    ReviewRecord update(ReviewRecord record);
    void delete(String record_id);

}

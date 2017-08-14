package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.domain.ReviewRecord;
import com.tristan.transcriptreviewsystem.domain.User;

import java.util.List;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class ReviewRecordFactory {

    public static ReviewRecord getReviewRecord(Map<String, Object> values)
    {
        ReviewRecord record = new ReviewRecord.Builder()
                .record_id((String) values.get("record_id"))
                .user((User) values.get("user"))
                .reviews((List<Review>) values.get("reviews"))
                .punctuation((Double) values.get("punctuation"))
                .grammar((Double) values.get("grammar"))
                .language((Double) values.get("language"))
                .translation((Double) values.get("translation"))
                .loss_of_meaning((Double) values.get("loss_of_meaning"))
                .total((Double) values.get("total"))
                .build();

        return record;
    }

}

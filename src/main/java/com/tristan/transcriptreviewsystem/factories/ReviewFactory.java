package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;

import java.util.Map;

/**
 * Created by Tristan on 2017/08/14.
 */
public class ReviewFactory {

    public static Review getReview(Map<String, Object> values)
    {
        Review review = new Review.Builder()
                .review_id((String) values.get("review_id"))
  //              .transcript((Transcript) values.get("transcript"))
  //              .user((User) values.get("user"))
                .transcriber_id((String) values.get("transcriber_id"))
                .transcriber((String) values.get("transcriber"))
                .audio_clip((String) values.get("audio_clip"))
                .reviewer_id((String) values.get("reviewer_id"))
                .grammar((Integer) values.get("grammar"))
                .language((Integer) values.get("language"))
                .translation((Integer) values.get("translation"))
                .loss_of_meaning((Integer) values.get("loss_of_meaning"))
                .punctuation((Integer) values.get("punctuation"))
                .total((Double) values.get("total"))
                .build();

        return review;
    }

}

package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Review;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface ReviewRepository {

    Review create(Review review);
    Review read(String review_id);
    Review update(Review review);
    void delete(String review_id);
}

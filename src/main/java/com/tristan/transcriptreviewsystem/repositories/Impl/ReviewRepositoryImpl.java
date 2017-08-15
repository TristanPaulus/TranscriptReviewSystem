package com.tristan.transcriptreviewsystem.repositories.Impl;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.repositories.ReviewRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tristan on 2017/08/15.
 */
public class ReviewRepositoryImpl implements ReviewRepository {

    private static ReviewRepositoryImpl repository = null;
    private Map<String, Review> reviewTable = new HashMap<String, Review>();

    public static ReviewRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new ReviewRepositoryImpl();

        return repository;
    }

    public Review create(Review review) {
        reviewTable.put(review.getReview_id(), review);
        Review savedReview = reviewTable.get(review.getReview_id());
        return savedReview;
    }

    public Review read(String review_id) {
        Review savedReview = reviewTable.get(review_id);
        return savedReview;
    }

    public Review update(Review review) {
        reviewTable.put(review.getReview_id(), review);
        Review savedReview = reviewTable.get(review.getReview_id());
        return savedReview;
    }

    public void delete(String review_id) {
        reviewTable.remove(review_id);
    }
}

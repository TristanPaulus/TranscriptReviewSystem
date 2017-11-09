package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Review;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Tristan on 2017/08/15.
 */
public interface ReviewRepository extends CrudRepository<Review, String>{
/*
    Review create(Review review);
    Review read(String review_id);
    Review update(Review review);
    void delete(String review_id);
    List<Review> findAll();
*/
}

package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;
import com.tristan.transcriptreviewsystem.repositories.Impl.ReviewRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */
public class ReviewRepositoryTest {

    Transcript transcript;
    User user;
    ReviewRepositoryImpl repository;
    Review review;

    @Before
    public void setUp() throws Exception {

        repository = ReviewRepositoryImpl.getInstance();

        review = new Review.Builder()
                .review_id("REV101")
                .grammar(1)
                .language(2)
                .translation(3)
                .loss_of_meaning(4)
                .punctuation(5)
                .total(6.0)
                .transcript(transcript)
                .user(user)
                .build();
    }

    @Test
    public void create() throws Exception {

        Review savedReview = repository.create(review);
        assertEquals("REV101", savedReview.getReview_id());

    }

    @Test
    public void read() throws Exception {
        repository.create(review);
        Review savedReview = repository.read("REV101");
        assertEquals(1, savedReview.getGrammar());
    }

    @Test
    public void update() throws Exception {

        repository.create(review);

        Review newReview = new Review.Builder()
                .review_id("REV101")
                .grammar(1)
                .language(2)
                .translation(3)
                .loss_of_meaning(4)
                .punctuation(5)
                .total(10.0)
                .transcript(transcript)
                .user(user)
                .build();

        Review savedReview = repository.update(newReview);
        assertEquals(10.0, savedReview.getTotal(), 0.001);
    }

    @Test
    public void delete() throws Exception {

        Review savedReview = repository.create(review);
        assertNotNull(savedReview);
        repository.delete("REV101");
        savedReview = repository.read("REV101");
        assertNull(savedReview);
    }

}
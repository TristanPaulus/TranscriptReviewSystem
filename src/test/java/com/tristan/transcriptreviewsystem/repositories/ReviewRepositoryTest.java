package com.tristan.transcriptreviewsystem.repositories;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;
import com.tristan.transcriptreviewsystem.repositories.Impl.ReviewRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/15.
 */
public class ReviewRepositoryTest {

    Transcript transcript;
    User user;
    ReviewRepository repository;
    Review review;

    @Before
    public void setUp() throws Exception {


        review = new Review.Builder()
                .review_id("REV101")
                .grammar(1)
                .language(2)
                .translation(3)
                .loss_of_meaning(4)
                .punctuation(5)
                .total(6.0)
                //.transcript(transcript)
                //.user(user)
                .transcriber_id("101")
                .reviewer_id("101")
                .build();
    }

    @Test
    public void create() throws Exception {

        Review savedReview = repository.save(review);
        assertEquals("REV101", savedReview.getReview_id());

    }

    @Test
    public void read() throws Exception {
        repository.save(review);
        Review savedReview = repository.findOne("REV101");
        assertEquals(1, savedReview.getGrammar());
    }

    @Test
    public void update() throws Exception {

        repository.save(review);

        Review newReview = new Review.Builder()
                .review_id("REV101")
                .grammar(1)
                .language(2)
                .translation(3)
                .loss_of_meaning(4)
                .punctuation(5)
                .total(10.0)
                //.transcript(transcript)
                //.user(user)
                .transcriber_id("101")
                .reviewer_id("101")
                .build();

        Review savedReview = repository.save(newReview);
        assertEquals(10.0, savedReview.getTotal(), 0.001);
    }

    @Test
    public void delete() throws Exception {

        Review savedReview = repository.save(review);
        assertNotNull(savedReview);
        repository.delete("REV101");
        savedReview = repository.findOne("REV101");
        assertNull(savedReview );
    }

    @Test
    public void findAll() throws Exception
    {
        repository.save(review);

        assertEquals(1, repository.count());
        //assertEquals("REV101", reviews.get(0).getReview_id());
    }

}
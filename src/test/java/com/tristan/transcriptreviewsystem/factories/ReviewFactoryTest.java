package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/14.
 */
public class ReviewFactoryTest {

    private String review_id;
    private int grammar;
    private int language;
    private int translation;
    private int loss_of_meaning;
    private int punctuation;
    private double total;

    Transcript transcript;
    User user;

    Review review;
    Map<String, Object> values;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("review_id", "R101");
        values.put("grammar", 1);
        values.put("language", 2);
        values.put("translation", 3);
        values.put("loss_of_meaning", 4);
        values.put("punctuation", 5);
        values.put("total", 50.0);
        values.put("transcript", transcript);
        values.put("user", user);
    }

    @Test
    public void getReview() throws Exception {

        review = ReviewFactory.getReview(values);

        assertEquals("R101", review.getReview_id());
        assertEquals(1, review.getGrammar());
        assertEquals(2, review.getLanguage());
        assertEquals(3, review.getTranslation());
        assertEquals(4, review.getLoss_of_meaning());
        assertEquals(5, review.getPunctuation());

        assertSame(transcript, review.getTranscript());
        assertSame(user, review.getUser());

    }

}
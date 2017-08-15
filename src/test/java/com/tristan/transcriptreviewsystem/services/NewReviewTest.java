package com.tristan.transcriptreviewsystem.services;

import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/16.
 */
public class NewReviewTest {

    NewReview nr;
    Map<String, Integer> scores;
    User user;
    Transcript transcript;
    String review_id;

    @Before
    public void setUp() throws Exception {
        nr = new NewReview();
        scores = new HashMap<String, Integer>();

        scores.put("language", 5);
        scores.put("grammar", 5);
        scores.put("loss_of_meaning", 2);
        scores.put("punctuation", 5);
        scores.put("translation", 5);

        review_id = "R101";

    }

    @Test
    public void generateReview() throws Exception {
        double total = nr.calculateTotal(scores);
    }

    @Test
    public void calculateTotal() throws Exception {
        double total = nr.calculateTotal(scores);
        assertEquals(4.8, total, 0.01);
    }

    @Test
    public void invertLoss_of_meaning() throws Exception {
        int num = nr.invertLoss_of_meaning(5);
        assertEquals(1, num);
    }

}
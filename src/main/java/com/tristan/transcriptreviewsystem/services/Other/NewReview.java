package com.tristan.transcriptreviewsystem.services.Other;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.domain.User;
import com.tristan.transcriptreviewsystem.factories.ReviewFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * Created by Tristan on 2017/08/15.
 */
public class NewReview {

    private int grammar;
    private int language;
    private int translation;
    private int loss_of_meaning;
    private int punctuation;
    private double total;

    public Review generateReview(Map<String, Integer> scores, User user, Transcript transcript, String review_id)
    {
        Review newReview;

        double total = calculateTotal(scores);
        Map<String, Object> values = new HashMap<String, Object>();

        values.put("review_id", review_id);
        values.put("transcript", transcript);
        values.put("user", user);
        values.put("grammar",scores.get("grammar"));
        values.put("language",scores.get("language"));
        values.put("translation",scores.get("translation"));
        values.put("loss_of_meaning",scores.get("loss_of_meaning"));
        values.put("punctuation",scores.get("punctuation"));
        values.put("total", total);

        newReview = ReviewFactory.getReview(values);

        return newReview;
    }

    public double calculateTotal(Map<String, Integer> scores)
    {
        double grammar, language, translation, loss_of_meaning, punctuation;
        grammar = (double)scores.get("grammar");
        language = (double)scores.get("language");
        translation = (double)scores.get("translation");
        loss_of_meaning = (double)invertLoss_of_meaning(scores.get("loss_of_meaning"));
        punctuation = (double)scores.get("punctuation");

        return (grammar+language+translation+loss_of_meaning+punctuation)/5;
    }

    public int invertLoss_of_meaning(int loss_of_meaning)
    {
        return (loss_of_meaning - 6) * -1;
    }
}

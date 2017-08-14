package com.tristan.transcriptreviewsystem.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/08/11.
 */
public class ReviewRecord {

    private String record_id;
    private User user;
    private List<Review> reviews;
    private double punctuation;
    private double grammar;
    private double language;
    private double translation;
    private double loss_of_meaning;
    private double total;

    public ReviewRecord(Builder b)
    {
        this.record_id = b.record_id;
        this.user = b.user;
        this.reviews = b.reviews;
        this.punctuation= b.punctuation;
        this.grammar = b.grammar;
        this.language = b.language;
        this.translation = b.translation;
        this.loss_of_meaning = b.loss_of_meaning;
        this.total = b.total;
    }

    public static class Builder
    {
        private String record_id;
        private User user;
        private List<Review> reviews;
        private double punctuation;
        private double grammar;
        private double language;
        private double translation;
        private double loss_of_meaning;
        private double total;

        public Builder record_id(String value)
        {
            this.record_id = value;
            return this;
        }

        public Builder user(User value)
        {
            this.user = value;
            return this;
        }

        public Builder reviews(List<Review> value)
        {
            this.reviews = new ArrayList<Review>();
            this.reviews = value;
            return this;
        }

        public Builder punctuation(double value)
        {
            this.punctuation = value;
            return this;
        }

        public Builder grammar(double value)
        {
            this.grammar = value;
            return this;
        }

        public Builder language(double value)
        {
            this.language = value;
            return this;
        }

        public Builder translation(double value)
        {
            this.translation = value;
            return this;
        }

        public Builder loss_of_meaning(double value)
        {
            this.loss_of_meaning = value;
            return this;
        }

        public Builder total(double value)
        {
            this.total = value;
            return this;
        }

        public ReviewRecord build()
        {
            return new ReviewRecord(this);
        }

    }

    public void addReview(Review r)
    {
        this.reviews.add(r);
    }

    public String getRecord_id() {
        return record_id;
    }

    public User getUser() {
        return user;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public double getPunctuation() {
        return punctuation;
    }

    public double getGrammar() {
        return grammar;
    }

    public double getLanguage() {
        return language;
    }

    public double getTranslation() {
        return translation;
    }

    public double getLoss_of_meaning() {
        return loss_of_meaning;
    }

    public double getTotal() {
        return total;
    }


}

package com.tristan.transcriptreviewsystem.domain;

/**
 * Created by Tristan on 2017/08/11.
 */
public class Review {

    private String review_id;
    private Transcript transcript;
    private User user;
    private int grammar;
    private int language;
    private int translation;
    private int loss_of_meaning;
    private int punctuation;
    private double total;

    public Review(Builder b)
    {
        this.review_id = b.review_id;
        this.transcript = b.transcript;
        this.user = b.user;
        this.grammar = b.grammar;
        this.language = b.language;
        this.translation = b.translation;
        this.loss_of_meaning = b.loss_of_meaning;
        this.punctuation = b.punctuation;
        this.total = b.total;
    }

    public static class Builder
    {
        private String review_id;
        private Transcript transcript;
        private User user;
        private int grammar;
        private int language;
        private int translation;
        private int loss_of_meaning;
        private int punctuation;
        private double total;

        public Builder review_id(String value)
        {
            this.review_id = value;
            return this;
        }

        public Builder transcript(Transcript value)
        {
            this.transcript = value;
            return this;
        }

        public Builder user(User value)
        {
            this.user = value;
            return this;
        }

        public Builder grammar(int value)
        {
            this.grammar = value;
            return this;
        }

        public Builder language(int value)
        {
            this.language = value;
            return this;
        }

        public Builder translation(int value)
        {
            this.translation = value;
            return this;
        }

        public Builder loss_of_meaning(int value)
        {
            this.loss_of_meaning = value;
            return this;
        }

        public Builder punctuation(int value)
        {
            this.punctuation = value;
            return this;
        }

        public Builder total(double value)
        {
            this.total = value;
            return this;
        }

        public Review build()
        {
            return new Review(this);
        }
    }

    public String getReview_id() {
        return review_id;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public User getUser() {
        return user;
    }

    public int getGrammar() {
        return grammar;
    }

    public int getLanguage() {
        return language;
    }

    public int getTranslation() {
        return translation;
    }

    public int getLoss_of_meaning() {
        return loss_of_meaning;
    }

    public int getPunctuation() {
        return punctuation;
    }

    public double getTotal() {
        return total;
    }


}

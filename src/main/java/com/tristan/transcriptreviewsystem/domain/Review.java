package com.tristan.transcriptreviewsystem.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Tristan on 2017/08/11.
 */

@Entity
public class Review implements Serializable, Comparable<Review>{

    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private String review_id;
//    private Transcript transcript;
//    private User user;
    private String transcriber_id;
    private String reviewer_id;
    private String transcriber;
    private String audio_clip;
    private int grammar;
    private int language;
    private int translation;
    private int loss_of_meaning;
    private int punctuation;
    private double total;

    public Review()
    {

    }

    public Review(Builder b)
    {
        this.review_id = b.review_id;
//        this.transcript = b.transcript;
//        this.user = b.user;
        this.transcriber_id = b.transcriber_id;
        this.reviewer_id = b.reviewer_id;
        this.grammar = b.grammar;
        this.language = b.language;
        this.translation = b.translation;
        this.loss_of_meaning = b.loss_of_meaning;
        this.punctuation = b.punctuation;
        this.total = b.total;
        this.transcriber = b.transcriber;
        this.audio_clip = b.audio_clip;
    }

    public static class Builder
    {
        private String review_id;
        //    private Transcript transcript;
        //    private User user;
        private String transcriber_id;
        private String reviewer_id;
        private int grammar;
        private int language;
        private int translation;
        private int loss_of_meaning;
        private int punctuation;
        private double total;
        private String audio_clip;
        private String transcriber;

        public Builder transcriber_id(String value)
        {
            this.transcriber_id = value;
            return this;
        }

        public Builder reviewer_id(String value)
        {
            this.reviewer_id = value;
            return this;
        }

        public Builder review_id(String value)
        {
            this.review_id = value;
            return this;
        }

        public Builder transcriber(String value)
        {
            this.transcriber = value;
            return this;
        }

        public Builder audio_clip(String value)
        {
            this.audio_clip = value;
            return this;
        }
/*
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
*/
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

    public String getTranscriber() {
        return transcriber;
    }

    public String getAudio_clip() {
        return audio_clip;
    }

    public String getReview_id() {
        return review_id;
    }
/*
    public Transcript getTranscript() {
        return transcript;
    }

    public User getUser() {
        return user;
    }*/

    public String getTranscriber_id() {
        return transcriber_id;
    }

    public String getReviewer_id() {
        return reviewer_id;
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

    public int compareTo(Review r) {
        return review_id.compareTo(r.getReview_id());
    }
}

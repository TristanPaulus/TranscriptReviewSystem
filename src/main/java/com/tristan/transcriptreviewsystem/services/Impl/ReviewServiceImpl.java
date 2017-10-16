package com.tristan.transcriptreviewsystem.services.Impl;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.repositories.ReviewRepository;
import com.tristan.transcriptreviewsystem.services.Interfaces.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tristan on 2017/09/06.
 */
@Service
public class ReviewServiceImpl /*implements ReviewService*/{

    @Autowired
    private ReviewRepository repository;

    public Review create(Review entity) {
        return repository.save(entity);
    }

    public Review read(String value) {
        return repository.findOne(value);
    }

    public Review update(Review entity) {
        return repository.save(entity);
    }

    public void delete(String value) {
        repository.delete(value);
    }

    public List<Review> getAll() {
        List<Review> reviewList = new ArrayList<Review>();
        Iterable<Review> reviews = repository.findAll();
        for (Review review : reviews) {
            reviewList.add(review);
        }
        return reviewList;
    }
}


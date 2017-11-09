package com.tristan.transcriptreviewsystem.controller;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.services.Impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tristan on 2017/10/13.
 */

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/review")
public class ReviewController {

    @Autowired
    private ReviewServiceImpl reviewService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Review> getAllReviews(){
        return reviewService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addReview(@RequestBody Review review){
        reviewService.create(review);
    }

    @RequestMapping(value="/find{reviewID}")
    public @ResponseBody Review findReview(@PathVariable String reviewID){
        return reviewService.read(reviewID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateReview(@RequestBody Review review){
        reviewService.update(review);
    }

    @RequestMapping(value="/delete/{reviewID}",  method = RequestMethod.DELETE)
    public void deleteReview(@PathVariable String reviewID){

        reviewService.delete(reviewID);
    }

}

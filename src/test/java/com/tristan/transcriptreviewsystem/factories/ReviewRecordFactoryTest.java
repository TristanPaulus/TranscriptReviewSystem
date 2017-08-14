package com.tristan.transcriptreviewsystem.factories;

import com.tristan.transcriptreviewsystem.domain.Review;
import com.tristan.transcriptreviewsystem.domain.ReviewRecord;
import com.tristan.transcriptreviewsystem.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/08/14.
 */
public class ReviewRecordFactoryTest {

    ReviewRecord record;
    Map<String, Object> values;

    User user;
    List<Review> reviews;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, Object>();
        values.put("record_id", "REC101");
        values.put("punctuation", 1.0);
        values.put("grammar", 2.0);
        values.put("language", 3.0);
        values.put("translation", 4.0);
        values.put("loss_of_meaning", 5.0);
        values.put("total", 6.0);
        values.put("user", user);
        values.put("reviews", reviews);

    }

    @Test
    public void getReviewRecord() throws Exception {
        record = ReviewRecordFactory.getReviewRecord(values);

        assertEquals("REC101", record.getRecord_id());
        assertEquals(1.0, record.getPunctuation(), 0.001);
        assertEquals(2.0, record.getGrammar(), 0.001);
        assertEquals(3.0, record.getLanguage(), 0.001);
        assertEquals(4.0, record.getTranslation(), 0.001);
        assertEquals(5.0, record.getLoss_of_meaning(), 0.001);
        assertEquals(6.0, record.getTotal(), 0.001);

        assertSame(user, record.getUser());
        assertSame(reviews, record.getReviews());

    }

}
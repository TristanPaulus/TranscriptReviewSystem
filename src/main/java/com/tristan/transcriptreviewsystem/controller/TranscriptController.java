package com.tristan.transcriptreviewsystem.controller;

import com.tristan.transcriptreviewsystem.domain.Transcript;
import com.tristan.transcriptreviewsystem.services.Impl.TranscriptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tristan on 2017/10/13.
 */

@Controller
@RequestMapping(path="/transcript")
public class TranscriptController {

    @Autowired
    private TranscriptServiceImpl transcriptService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Transcript> getAllAdministrator(){
        return transcriptService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addTranscript(@RequestBody Transcript transcript){
        transcriptService.create(transcript);
    }

    @RequestMapping(value="/find{transcriptID}")
    public @ResponseBody Transcript findTranscript(@PathVariable String transcriptID){
        return transcriptService.read(transcriptID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateTranscript(@RequestBody Transcript transcript){
        transcriptService.update(transcript);
    }

    @RequestMapping(value="/delete/{transcriptID}",  method = RequestMethod.DELETE)
    public void deleteTranscript(@PathVariable String transcriptID){

        transcriptService.delete(transcriptID);
    }
}

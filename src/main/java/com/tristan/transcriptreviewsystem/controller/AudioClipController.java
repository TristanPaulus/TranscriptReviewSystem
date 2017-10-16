package com.tristan.transcriptreviewsystem.controller;

import com.tristan.transcriptreviewsystem.domain.AudioClip;
import com.tristan.transcriptreviewsystem.services.Impl.AudioClipServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tristan on 2017/10/13.
 */

@Controller
@RequestMapping(path="/audioclip")
public class AudioClipController {

    @Autowired
    private AudioClipServiceImpl clipService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<AudioClip> getAllAudioClips(){
        return clipService.getAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addAudioClip(@RequestBody AudioClip clip){
        clipService.create(clip);
    }

    @RequestMapping(value="/find{clipID}")
    public @ResponseBody AudioClip findAudioClip(@PathVariable String clipID){
        return clipService.read(clipID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateAudioClip(@RequestBody AudioClip clip){
        clipService.update(clip);
    }

    @RequestMapping(value="/delete/{clipID}",  method = RequestMethod.DELETE)
    public void deleteAudioClip(@PathVariable String clipID){

        clipService.delete(clipID);
    }
}

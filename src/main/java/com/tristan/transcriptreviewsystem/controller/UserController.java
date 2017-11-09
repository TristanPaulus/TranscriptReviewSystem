package com.tristan.transcriptreviewsystem.controller;

import com.tristan.transcriptreviewsystem.domain.User;
import com.tristan.transcriptreviewsystem.services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Tristan on 2017/10/13.
 */

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(path="/all", method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers(){
        return userService.getAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userService.create(user);


    }

    @RequestMapping(value="/find{userID}", method = RequestMethod.GET)
    public @ResponseBody User findAudioClip(@PathVariable String userID){
        return userService.read(userID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user){
        userService.update(user);
    }

    @RequestMapping(value="/delete/{userID}",  method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String userID){

        userService.delete(userID);
    }

}

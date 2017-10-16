package com.tristan.transcriptreviewsystem.controller;

//import com.tristan.transcriptreviewsystem.domain.Manager;
//import com.tristan.transcriptreviewsystem.services.Impl.ManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tristan on 2017/10/13.
 */

/*
@Controller
@RequestMapping(path="/manager")
public class ManagerController {

    @Autowired
    private ManagerServiceImpl managerService;

    @GetMapping(path="/all")
    public @ResponseBody
    List<Manager> getAllManagers(){
        return managerService.getAll();

    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addManager(@RequestBody Manager manager){
        managerService.create(manager);
    }

    @RequestMapping(value="/find{managerID}")
    public @ResponseBody Manager findManager(@PathVariable String managerID){
        return managerService.read(managerID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateManager(@RequestBody Manager manager){
        managerService.update(manager);
    }

    @RequestMapping(value="/delete/{managerID}",  method = RequestMethod.DELETE)
    public void deleteManager(@PathVariable String managerID){

        managerService.delete(managerID);
    }
}
*/
package com.cityevents.demo.controller;

import com.cityevents.demo.model.Events;
import com.cityevents.demo.services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2/demo")
public class EventController {
@Autowired
    private EventsService eventsService;
@PostMapping("/newevent")
public Events addEvent(@RequestBody Events events){

    return this.eventsService.addNewEvent(events);
}


@GetMapping("/all")
    public List<Events> getAllEvents(){

    return this.eventsService.getAllEvents();
    }
@DeleteMapping("/delete/{Id}")
    public String deleteEvent(@PathVariable Integer Id) {

        return this.eventsService.deleteEvent(Id);
    }
    @GetMapping ("/{myId}")
    public Optional<Events> getSingleEvent(@PathVariable Integer myId){
    return  this.eventsService.getSingleEvent(myId);
    }
    @PutMapping("/update/{Id}")
    public Events updateEvents(@PathVariable Integer Id,@RequestBody Events lastEvent){
    return  this.eventsService.updateEvents(Id,lastEvent);
    }
@PatchMapping("/latest/{id}")
    public Events updateEventInfo(@PathVariable Integer id,@RequestBody String eventDetails){
    return  this.eventsService.updateEventsInfo(id, eventDetails);
    }
}

package com.cityevents.demo.services;

import com.cityevents.demo.model.Events;
import com.cityevents.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventsService {
    @Autowired
    private EventRepository eventRepository;

    public Events addNewEvent(Events events){
        this.eventRepository.save(events);
        return events;
    }

   public List<Events> getAllEvents(){
        return this.eventRepository.findAll();
    }

    public String deleteEvent(Integer selectedEventId){
        this.eventRepository.deleteById(selectedEventId);
        return "deleted"+selectedEventId;
    }

    public Optional<Events> getSingleEvent(Integer eventId){
        return this.eventRepository.findById(eventId);
    }
    public Events updateEvents(Integer id,Events updatedEvents){
        Events oldEvent = this.eventRepository.findById(id).get();
        oldEvent.setEventName(updatedEvents.getEventName());
        oldEvent.setEventDetails(updatedEvents.getEventDetails());
        oldEvent.setEventDate(updatedEvents.getEventDate());
        this.eventRepository.save(oldEvent);
        return updatedEvents;
    }
    public Events updateEventsInfo(Integer id,String eventDetails){
        Events oldEvents = this.eventRepository.findById(id).get();
        oldEvents.setEventDetails(eventDetails);
        this.eventRepository.save(oldEvents);
        return oldEvents;
    }
}

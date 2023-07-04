package com.cityevents.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.xml.crypto.Data;
import java.util.Date;
@Entity
public class Events {
    @Id
    private int eventId;
    private String eventName;
    private String eventDetails;
    private Date eventDate;

    public Events(int eventId, String eventName, String eventDetails, Date eventDate) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDetails = eventDetails;
        this.eventDate = eventDate;
    }
    public Events() {

    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }


}
package com.example.sherlockholmes.events;

import java.util.Date;

public class Event {
    private String theme;
    private String date;
    private String place;
    
    public Event(String theme, String date, String place) {
            super();
            this.theme = theme;
            this.date = date;
            this.place = place;
    }
    
    // Getter and setter methods for all the fields.
    // Though you would not be using the setters for this example,
    // it might be useful later.
    public String getTheme() {
            return theme;
    }
    public void Theme(String theme) {
            this.theme = theme;
    }
    public String getDate() {
            return date;
    }
    public void setDate(String date) {
            this.date = date;
    }
    public String getPlace() {
            return place;
    }
    public void setPlace(String place) {
            this.place = place;
    }
}
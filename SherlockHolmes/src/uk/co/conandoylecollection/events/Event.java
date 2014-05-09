package uk.co.conandoylecollection.events;


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
package model;
import java.time.LocalDate;


public class Event {
    private LocalDate timestamp;
    private double duration;

//Constructor
public Event(LocalDate timestamp, double duration) {
        this.timestamp = timestamp;
        this.duration = duration;
    }

//Getters y Setters 

public LocalDate getTimestamp() {
    return timestamp;
}

public double getDuration() {
    return duration;
}

public void setTimestamp(LocalDate timestamp) {
    this.timestamp = timestamp;
}

public void setDuration(double duration) {
    this.duration = duration;
}
}
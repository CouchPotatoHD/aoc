package com.ismaylov.day3;

public class Event {
    int position;
    EventTypes type;
    String value;

    public Event(int position, EventTypes type) {
        this(position, type, null);
    }

    public Event(int position, EventTypes type, String value) {
        this.position = position;
        this.type = type;
        this.value = value;
    }
}

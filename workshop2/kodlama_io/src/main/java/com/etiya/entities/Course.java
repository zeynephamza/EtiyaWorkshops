package com.etiya.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String description;
    private String image;
    private double price;
    private Instructor instructor;
    private List<Attendee> attendees;
    private int count;
    public void enrollAttendee(Attendee attendee) {
        if (!attendees.contains(attendee)) {
            attendees.add(attendee);
            System.out.println(STR."\{attendee.getUsername()} has been successfully enrolled in the course.");
        } else {
            System.out.println(STR."\{attendee.getUsername()} is already enrolled.");
        }
    }

    public void unenrollAttendee(Attendee attendee) {
        if (attendees.remove(attendee)) {
            System.out.println(STR."\{attendee.getUsername()} has been successfully unenrolled from the course.");
        } else {
            System.out.println(STR."\{attendee.getUsername()} is not enrolled in the course.");
        }
    }

    public Course(String name, String description, String image, double price, Instructor instructor, List<Attendee> attendees) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.instructor = instructor;
        this.attendees = new ArrayList<>();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Attendee> attendees) {
        this.attendees = attendees;
    }
}

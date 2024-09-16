package com.etiya;

import com.etiya.business.CourseManager;
import com.etiya.dataAccess.CourseDao;
import com.etiya.dataAccess.MysqlCourseDao;
import com.etiya.entities.Attendee;
import com.etiya.entities.Course;
import com.etiya.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Instructor instructor = new Instructor("Engin Demirog");

            Attendee attendee1 = new Attendee("zeynepozcan", "1234");
            Attendee attendee2 = new Attendee("hellojava", "sifre");

            List<Attendee> attendees = new ArrayList<>();
            attendees.add(attendee1);
            attendees.add(attendee2);

            Course course = new Course("Java", "learn advanced java.", "java.jpg", 0.00, instructor, attendees);


            CourseDao courseDao = new MysqlCourseDao(); // Adding with mysql
            CourseManager courseManager = new CourseManager(courseDao);

            courseManager.add(course);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

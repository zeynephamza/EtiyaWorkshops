package com.etiya.dataAccess;

import com.etiya.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public boolean add(Course course) {
        System.out.println("Course added to database with jdbc.");
        return true;
    }
}

package com.etiya.dataAccess;

import com.etiya.entities.Course;

public class MysqlCourseDao implements CourseDao {
    @Override
    public boolean add(Course course) {
        System.out.println("Course added to database with mysql.");
        return true;
    }
}

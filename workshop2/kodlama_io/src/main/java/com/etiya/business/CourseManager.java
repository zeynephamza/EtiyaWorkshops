package com.etiya.business;

import com.etiya.dataAccess.CourseDao;
import com.etiya.entities.Course;

public class CourseManager { //service
    private CourseDao courseDao;

    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    public void add(Course course) throws Exception {
        // business rules
        if(course.getPrice()<0){
            throw new Exception("\n" + "Course price cannot be a negative number");
        }
        courseDao.add(course);
    }


}

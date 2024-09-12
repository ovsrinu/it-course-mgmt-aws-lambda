package com.ovsit.itcoursemgmt.service;

import com.ovsit.itcoursemgmt.entity.Course;
import com.ovsit.itcoursemgmt.model.CourseModel;
import com.ovsit.itcoursemgmt.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public void addCourse(CourseModel courseModel) {
        Course course = new Course();
        course.setName(courseModel.getName());
        course.setPrice(courseModel.getPrice());
        courseRepository.save(course);
    }

    public void removeCourse(Integer courseId) {
        courseRepository.deleteById(courseId);
    }
}

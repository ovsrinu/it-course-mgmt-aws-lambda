package com.ovsit.itcoursemgmt.controller;

import com.ovsit.itcoursemgmt.entity.Course;
import com.ovsit.itcoursemgmt.model.CourseModel;
import com.ovsit.itcoursemgmt.service.CourseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/course")
public class CourseController {
    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Course>> getCourses() {
        return ResponseEntity.ok(courseService.getCourses());
    }

    @PostMapping("/add")
    public ResponseEntity<String> addCourse(@RequestBody CourseModel courseModel) {
        courseService.addCourse(courseModel);
        return ResponseEntity.ok("Added course successfully");
    }

    @GetMapping("/remove")
    public ResponseEntity<String> removeCourse(@RequestParam Integer courseCode) {
        courseService.removeCourse(courseCode);
        return ResponseEntity.ok("Removed course successfully");
    }
}
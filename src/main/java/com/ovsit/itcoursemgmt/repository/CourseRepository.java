package com.ovsit.itcoursemgmt.repository;

import com.ovsit.itcoursemgmt.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}

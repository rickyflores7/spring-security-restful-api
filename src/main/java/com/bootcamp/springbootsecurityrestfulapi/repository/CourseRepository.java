package com.bootcamp.springbootsecurityrestfulapi.repository;


import com.bootcamp.springbootsecurityrestfulapi.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}

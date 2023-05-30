package com.bootcamp.springbootsecurityrestfulapi.service;

import com.bootcamp.springbootsecurityrestfulapi.course.Course;
import com.bootcamp.springbootsecurityrestfulapi.repository.StudentRepository;
import com.bootcamp.springbootsecurityrestfulapi.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final CourseService courseService;
    @Autowired
    public StudentService(StudentRepository studentRepository, CourseService courseService) {
        this.studentRepository = studentRepository;
        this.courseService = courseService;
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void enrollCourse(Student student, Course course) {
        student.setCourse(course);
        studentRepository.save(student);
    }

    public void dropCourse(Student student) {
        student.setCourse(null);
        studentRepository.save(student);
    }
}

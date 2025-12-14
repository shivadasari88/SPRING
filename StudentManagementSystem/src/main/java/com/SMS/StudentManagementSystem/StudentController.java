package com.SMS.StudentManagementSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

    // CREATE
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    // READ ALL
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Student not found with id " + id));
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable int id) {
        studentRepo.deleteById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id,
                                 @RequestBody Student updatedStudent) {

        Student student = getStudentById(id);

        student.setName(updatedStudent.getName());
        student.setEmail(updatedStudent.getEmail());
        student.setCourse(updatedStudent.getCourse());
        student.setEnrollmentDate(updatedStudent.getEnrollmentDate());

        return studentRepo.save(student);
    }

    // GET BY COURSE
    @GetMapping("/course/{course}")
    public List<Student> getStudentsByCourse(@PathVariable String course) {
        return studentRepo.findByCourse(course);
    }
    
    @GetMapping("/search")
    public List<Student> searchStudentsByName(@RequestParam String name) {
    	
        return studentRepo.findByNameContaining(name);
        
        
        //GET /api/students/search?name=ra
    }
    
    

}

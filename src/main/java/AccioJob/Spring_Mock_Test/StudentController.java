package AccioJob.Spring_Mock_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("New student added successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add-teacher")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher){
        studentService.addTeacher(teacher);
        return new ResponseEntity<>("New teacher added successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add-course")
    public ResponseEntity<String> addCourse(@RequestBody Course course){
        studentService.addCourse(course);
        return new ResponseEntity<>("New course added successfully", HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-student")
    public ResponseEntity<String> deleteStudent(@RequestParam String studentName){
        studentService.deleteStudent(studentName);
        return new ResponseEntity<>(studentName + "deleted successfully",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete-teacher")
    public ResponseEntity<String> deleteTeacher(@RequestParam String teacherName){
        studentService.deleteTeacher(teacherName);
        return new ResponseEntity<>(teacherName + "deleted successfully",HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete-course")
    public ResponseEntity<String> deleteCourse(@RequestParam String courseName){
        studentService.deleteCourse(courseName);
        return new ResponseEntity<>(courseName + "deleted successfully",HttpStatus.ACCEPTED);
    }
}

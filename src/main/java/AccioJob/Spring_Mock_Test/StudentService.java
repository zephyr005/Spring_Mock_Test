package AccioJob.Spring_Mock_Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepository.saveTeacher(teacher);
    }

    public void addCourse(Course course) {
        studentRepository.saveCourse(course);
    }

    public void deleteStudent(String studentName) {
        studentRepository.deleteStudent(studentName);
    }

    public void deleteTeacher(String teacherName) {
        studentRepository.deleteTeacher(teacherName);
    }

    public void deleteCourse(String courseName) {
        studentRepository.deleteCourse(courseName);
    }
}

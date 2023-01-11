package AccioJob.Spring_Mock_Test;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class StudentRepository {
    private HashMap<String, Student> studentDB;
    private HashMap<String, Teacher> teacherDB;
    private HashMap<String, Course> courseDB;

    public StudentRepository(){
        this.studentDB = new HashMap<>();
        this.teacherDB = new HashMap<>();
        this.courseDB = new HashMap<>();
    }

    public void saveStudent(Student student){
        studentDB.put(student.getName(), student);
    }

    public void saveTeacher(Teacher teacher){
        teacherDB.put(teacher.getName(), teacher);
    }

    public void saveCourse(Course course){
        courseDB.put(course.getCourseName(), course);
    }

    public void deleteStudent(String student){
        if(studentDB.containsKey(student)){
            studentDB.remove(student);
        }
    }

    public void deleteTeacher(String teacher){
        if(teacherDB.containsKey(teacher)){
            teacherDB.remove(teacher);
        }
    }

    public void deleteCourse(String course){
        if(courseDB.containsKey(course)){
            courseDB.remove(course);
        }
    }
}

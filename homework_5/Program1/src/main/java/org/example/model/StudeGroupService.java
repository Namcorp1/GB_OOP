package org.example.model;

import org.example.users.StudeGroup;
import org.example.users.Student;
import org.example.users.Teacher;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.List;

public interface StudeGroupService {

    public StudeGroup createStudeGroup(Teacher teacher, List<Student> students);
    public List<Teacher> getTeachers() throws IOException;
    public List<Student> getStudents() throws IOException;
    public Teacher getTeacher() throws IOException;


}

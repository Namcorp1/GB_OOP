package org.example.model;

import org.example.users.StudeGroup;
import org.example.users.Student;
import org.example.users.Teacher;
import org.example.view.View;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Model implements StudeGroupService{

    /**
     *
     * @param teacher выбранные преподаватель для учебной группы
     * @param students список студентов, входящих в учебную группу
     * @return учебная группа
     */
    @Override
    public StudeGroup createStudeGroup(Teacher teacher, List<Student> students) {
        StudeGroup studeGroup = new StudeGroup(new Random().nextInt(1,10),teacher,students);
        return studeGroup;
    }

    /**
     *
     * @return список преподавателей, сформированный из файла с именами преподавателей
     * @throws IOException
     */
    @Override
    public List<Teacher> getTeachers() throws IOException{
        List<Teacher> teachers = new ArrayList<>();
        List<String> subject = new ArrayList<>();
        subject.add("математика");
        subject.add("физика");
        subject.add("информатика");
        File file = new File("LFM_teachers.txt");
        Scanner scanner = new Scanner(Paths.get(file.getPath()), "UTF-8");
        int i = 1;
        while (scanner.hasNextLine()) {
            Teacher teacher = new Teacher(i,scanner.nextLine(),new Date(),subject);
            teachers.add(teacher);
            i++;
        }
        return teachers;
    }

    /**
     *
     * @return список студентов, сформированный из файла с именами студентов
     * @throws IOException
     */
    @Override
    public List<Student> getStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        File file = new File("LFM_students.txt");
        Scanner scanner = new Scanner(Paths.get(file.getPath()), "UTF-8");
        int i = 20;
        while (scanner.hasNextLine()) {
            Student student = new Student(i,scanner.nextLine(),new Date());
            students.add(student);
            i++;
        }
        return students;
    }

    /**
     *
     * @return преподаватель, под выбранным номером из списка преподавателей
     * @throws IOException
     */
    @Override
    public Teacher getTeacher() throws IOException {
        System.out.println("Выберите преподавателя для учебной группы:");
        List<Teacher> teachers = getTeachers();
        View view = new View();
        view.PrintTeachers(teachers);
        Scanner in = new Scanner(System.in);
        Teacher teacher = teachers.get(in.nextInt() - 1);
        return teacher;
    }

}

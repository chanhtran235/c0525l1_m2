package ss8_mvc.repository;

import ss8_mvc.entity.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private static List<Student> students = new LinkedList<>();
    static {
        students.add(new Student(1,"Chánh", 4.5f));
        students.add(new Student(2,"Nam", 8.5f));
    }

    @Override
    public List<Student> findAll() {
        // code đọc file
        return students;
    }

    @Override
    public boolean add(Student student) {
        // code ghi file
        students.add(student);
        return true;
    }
}

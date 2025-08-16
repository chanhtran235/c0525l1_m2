package ss8_mvc.repository;

import ss8_mvc.entity.Student;

public class StudentRepository implements IStudentRepository{
    private static Student[] students = new Student[100];
    static {
        students[0]= new Student(1,"Chánh", 4.5f);
        students[1]= new Student(2,"Nam", 8.5f);
    }
    @Override
    public Student[] findAll() {
        // code đọc file
        return students;
    }

    @Override
    public boolean add(Student student) {
        // code ghi file
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i]= student;
                break;
            }
        }
        return true;
    }
}

package ss4_object_class;

public class StudentManager {
    // class chức năng quản lý sinh viên
    // các phương thức CRUD
    private static Student[] studentList = new Student[100];
    static {
        studentList[0] = new Student(1,"chánh1");
        studentList[1] = new Student(2,"chánh2");
    }

    public Student[] getAll(){
        // đọc ghi file
        // kết nối đatabase
        return studentList;
    }
    public void add(Student student){
        for (int i = 0; i <studentList.length ; i++) {
            if (studentList[i]==null){
                studentList[i]= student;
                break;
            }
        }
    }

}

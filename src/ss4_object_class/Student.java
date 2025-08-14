package ss4_object_class;

public class Student {
    private int id;
     String name;
    public static String school = "Codegym";

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void setSchool(String school){
        Student.school = school;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school "+ school+
                '}';
    }

    public static void main(String[] args) {
        System.out.println(school);
        setSchool("Hello");
        System.out.println(school);
        Student student = new Student(1,"chánh1");
        student.setName("chánh 3");

    }
}

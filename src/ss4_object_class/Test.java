package ss4_object_class;

import ss5.Calculator;

public class Test {

    public static void main(String[] args) {
        System.out.println("hàm main bắt đầu chạy");
        Student student1 = new Student(1,"chánh1");
        Student student2 = new Student(1,"chánh2");
        System.out.println(student2.name);
//        Student.school ="BK";
        student1.school ="BK";
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(Calculator.sub(10,20));

    }
}

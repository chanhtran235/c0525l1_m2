package ss12_set_map;

import ss8_mvc.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Map<Student,Integer>  map = new TreeMap<>();
        Set<Student> studentSet = new LinkedHashSet<>();
        Student student1 = new Student(4,"chánh",5.0f);
        Student student2 = new Student(2,"Thái",7.0f);
        Student student3 = new Student(2,"Thái",7.0f);
        Student student4 = new Student(1,"Thái",7.0f);

        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);

//        for (Student s: studentSet) {
//            System.out.println(s.getId()+":" + s.getName());
//        }
        studentSet.forEach(System.out::println);
        System.out.println("--------------------------------");
        Map<Integer,Student> list = studentSet.stream().filter(s->s.getId()>=2).collect(Collectors.toMap(s->s.getId(),e->e));


    }
}

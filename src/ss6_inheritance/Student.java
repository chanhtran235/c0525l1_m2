package ss6_inheritance;

public class Student extends Person {
    private String school;

    public Student(){

    }
    public Student(int id, String name){
        super(id, name);
    }

    @Override
    public void hoToGo() {
        System.out.println(" sinh viên đi học bằng xe máy");
    }

    @Override
    public void doTask() {
        System.out.println("học viên phải học bài và làm bài tập");
    }

    public void study(String subject){
        System.out.println(this.getName() +" đang học môn "+subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                ", school='" + school + '\'' +
                '}';
    }
}

package ss6_inheritance;

public class Teacher  extends Employee implements ITraining{
    private double salary;

    @Override
    public void doTask() {
        System.out.println("Giảng viên sẽ dạy các học viên");
    }

    @Override
    public void attendance() {

    }
}

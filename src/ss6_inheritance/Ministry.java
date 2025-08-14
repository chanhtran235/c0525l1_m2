package ss6_inheritance;

public class Ministry extends Employee implements ITraining, IGame{
    @Override
    public void doTask() {
        System.out.println(" Giáo vụ chăm sóc học viên");
    }

    @Override
    public void attendance() {
        System.out.println("Giáo vụ có thể điểm danh");
    }

    @Override
    public void organizeGame() {
        System.out.println("Giáo vụ tổ");
    }
}

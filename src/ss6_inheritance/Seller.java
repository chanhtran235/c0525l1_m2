package ss6_inheritance;

public class Seller extends Employee{
    @Override
    public void doTask() {
        System.out.println("Tư vấn tuyển sinh cho trung tâm");
    }


    public void organizeGame() {
        System.out.println("TVTS tổ chức chơi game cho hv");
    }
}

package ss6_inheritance;

public abstract class Employee  extends Person{
    // cos thêm thuộc tính khác ...

    @Override
    public void hoToGo() {
        System.out.println("nhân viên đi làm bằng xe đạp");
    }
}

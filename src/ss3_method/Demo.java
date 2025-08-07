package ss3_method;

public class Demo {
    public static void main(String[] args) {
        // hàm main là hàm đặc biệt để bắt đầu chương trình
//        showMessage("Hello");
        double tong = sum(10.0, 20.0);
        System.out.println(tong);

    }

    public static void showMessage(String mess) {
        System.out.println(mess);
    }

    public static double sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, double b){
        return a+b+100;
    }

}

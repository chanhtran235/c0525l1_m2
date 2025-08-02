package ss1_tong_quan_java.bai_tap;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // bắt đầu chạy chương trình
        System.out.println("Hello");
        // khai báo biến kiểu int
        int i = 10;
        Integer a =20; // kiểu đối tượng
        float f =10.0f;
        Float f2 = 12.0f;
        double d = 10.0;
        char c ='c';
        String s = "hello";

        // nhập dữ liệu:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi của bạn:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập luong");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Tên của bạn là : "+ name);
        System.out.println("Tuổi của bạn là : "+ age);
        System.out.println("Địa chỉ của bạn là : "+ address);
        System.out.println("Lương của của bạn là : "+ salary);

        if (age<30){
            System.out.println("đủ tuổi");
        } else if (age<40) {
            System.out.println("hơi quá tuổi");
        }else {
            System.out.println("Quas lớn tuổi");
        }


    }
}

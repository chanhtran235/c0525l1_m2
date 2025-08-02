package ss2_loop.bai_tap;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
       while (flag){
           System.out.println("------------Quản lý sinh viên----------");
           System.out.println("Chức năng: " +
                   "\n 1. Danh sách" +
                   "\n 2. Thêm mới"+
                   "\n 3. Xoá"+
                   "\n 4. Tìm kiếm"+
                   "\n 5. Thoát"
           );
           System.out.println("Chọn chức năng");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
               case 1:
                   System.out.println("Danh sách");
                   // code mở rộng ở đây
                   break;
               case 2:
                   System.out.println("Thêm mới");
                   // code mở rộng ở đây
                   break;
               case 3:
                   System.out.println("Xoá");
                   // code mở rộng ở đây
                   break;
               case 4:
                   System.out.println("Tìm kiếm");
                   // code mở rộng ở đây
                   break;
               default:
                   System.out.println("Đã kết thúc chương trình");
                   flag = false;
                   break;
           }
       }

    }
}

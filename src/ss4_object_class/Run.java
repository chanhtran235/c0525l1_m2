package ss4_object_class;

import java.util.Scanner;

public class Run {
    // class chức năng không có thuộc tính chỉ method
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------Quản lý sinh viên----------");
            System.out.println("Chức năng: " +
                    "\n 1. Danh sách" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Thoát"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    // code mở rộng ở đây
                   Student[] studentList = studentManager.getAll();
                    for (Student student: studentList) {
                        if (student !=null){
                            System.out.println(student);
                        }else {
                            break;
                        }

                    }
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    // code mở rộng ở đây
                    System.out.println("Nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập tên");
                    String name = scanner.nextLine();
                    Student student = new Student(id,name);
                    studentManager.add(student);
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

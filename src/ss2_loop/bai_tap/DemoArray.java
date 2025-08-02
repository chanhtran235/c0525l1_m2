package ss2_loop.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray {
     static int age;
    public static void main(String[] args) {
//        int i;
//        i =10;
//        System.out.println(i);
//        System.out.println(age);

        int[] numbers = {10,20,30};
        String[] cars = new String[]{"Honda","Yamaha","VinFast"};

        String[] strings2 = new String[10];

//        for (int i = 0; i <cars.length ; i++) {
//           cars[i] +=" Hãng xe";
//        }
        for(String car : cars){
           car += " Hãng xe";
        }
        System.out.println("----- dùng for thường duyệt mảng------");
        for (int i = 0; i <cars.length ; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("-----dùng foreach duyệt mảng-----");
        for(String car : cars){
            System.out.println(car);
        }
        System.out.println("---dùng hàm toString của class Arrays chuyển đổi mảng thành chuỗi ------");
        System.out.println(Arrays.toString(strings2));

        int[][] array1 = {
                {10,20,56},
                {34,56,7}
        };
        int[][] array2 = new int[2][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <array2.length ; i++) {
            for (int j = 0; j <array2[i].length ; j++) {
                System.out.println("nhập phần tử thứ : "+ i + ": "+ j);
                array2[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i <array2.length ; i++) {
            for (int j = 0; j <array2[i].length ; j++) {
                System.out.print (array2[i][j]+",");
            }
            System.out.println("");
        }


    }
}

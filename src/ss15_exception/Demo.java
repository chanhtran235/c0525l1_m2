package ss15_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("----------begin----------");
//        int[] array = {10,23,45,67};
        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập  index cần lấy ra");
//        int index =-1;
//        try{
//            index= Integer.parseInt(scanner.nextLine());
//            System.out.println(array[index]);
//        }catch (NumberFormatException e){
//            System.out.println("lỗi nhập chuỗi");
//            index = 0;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("lỗi truy cập ngoài pt mảng");
//            index = array.length-1;
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("luôn luôn chạy cho dù exception có xả ra hay không xả ra");
//        }
//        System.out.println(array[index]);

        System.out.println("nhập tuổi");
        int age=0 ;
        try {
            age = Integer.parseInt(scanner.nextLine());
            checkAge(age);
            System.out.println(age+ " ok");
        } catch (AgeException e) {
            System.out.println(e.getMessage());;
            System.out.println(age + " không ok");
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("----------finish----------------");

    }

    public static void readFile(String filePath) throws IOException {
            FileWriter fileWriter = new FileWriter(filePath);
            System.out.println("dong tiếp theo");
    }

    public static boolean checkAge(int age) throws AgeException {
        if (age<0){
            throw new AgeException("tuổi nhỏ hơn không");
        }else if (age>200){
            throw new AgeException("tuối lớn hơn 200");
        }
        return true;
    }

}

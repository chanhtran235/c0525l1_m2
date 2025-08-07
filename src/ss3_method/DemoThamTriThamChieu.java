package ss3_method;

import java.util.Arrays;

public class DemoThamTriThamChieu {
    public static void main(String[] args) {
//        int y =1;
//        changValue(y);
//        System.out.println(" ngoài hàm "+ y);//1

        int[] array = {1,2};
        changeArray(array);
        System.out.println("Bên ngoài "+ Arrays.toString(array)); // 100,2
    }

    public static void changValue(int x){
        x++;
        System.out.println("giá tri trong method :"+ x); //2
    }

    public static void changeArray(int[] arr){
//        arr[0]=1000;
        arr = new int[]{100, 200};
        System.out.println(Arrays.toString(arr));// 1000,2
    }
}

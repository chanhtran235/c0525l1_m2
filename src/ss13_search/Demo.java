package ss13_search;

public class Demo {
    public static void main(String[] args) {
     int v = 100;
     int[] array = {10,3,4,6,2};
        System.out.println(linerSearch(array,v));
    }
    public static int linerSearch(int [] arr, int value){
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==value){
                return i;
            }
        }
        return -1;
    }
}

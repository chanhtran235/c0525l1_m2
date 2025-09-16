package ss19;

public class Demo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String ("hello");
        String str5 = str1;
        String str6 = str3;
        String str10 ="hellocodegym";
        str1 = str1 +"codegym"; // hellocodegym.
        System.out.println(str1==str10);// flase
        StringBuffer stringBuffer1 = new StringBuffer("hello");
        StringBuffer stringBuffer2 =stringBuffer1;
        stringBuffer1.append("codegym");
        System.out.println(stringBuffer2);



//        System.out.println(str1==str2); // true
//        System.out.println(str1==str3);// false
//        System.out.println(str3==str4);// false
//        System.out.println(str2==str5);// true
//        System.out.println(str3==str6); // true




    }
}

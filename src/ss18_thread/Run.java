package ss18_thread;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
     List<String> stringList =new ArrayList<>();
     stringList.add("abcf");
     stringList.add("eff");
     stringList.add("dhhh");

     stringList.stream().filter(e->e.endsWith("f")).forEach(System.out::println);

    }
}

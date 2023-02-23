package Class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
      //  LinkedList<String> numbers=new LinkedList<>();     Very fast
        ArrayList<String> numbers=new ArrayList<>();// very slow
        for (int i=0;i<1000000;i++){
            numbers.add(0,"Test Data");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}

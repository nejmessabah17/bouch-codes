package Class14;

import java.util.Scanner;

public class MethodDemo2 {
  void  printHello(){
      System.out.println("Hello world");
      System.out.println("Hello world");
      System.out.println("Hello world");

    }
    void printHelloManyTimes(int times){
      for (int i=0;i<times;i++){
          System.out.println("Hello world");
      }
    }
    void printManyTimes(int times,String word){
        for (int i=0;i<times;i++){
            System.out.println(word);
        }
    }
}

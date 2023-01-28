package Class0;

public class ClockTask {
    public static void main(String[] args) {
  /*      for (int h1 = 0; h1 <= 2; h1++) {
            for (int h2 = 0; h2 <= 3; h2++) {         // clock 23:59 code
                for (int c = 0; c <= 5; c++) {

                    for (int d = 0; d <= 9; d++) {
                        System.out.println(a + " " + b + ":" + c + " " + d);
                    }
                    System.out.println();
                }

            }


        }
    }

}*/

//method2

        for (int hours = 0; hours < 24; hours++) {
            for (int minutes = 0; minutes < 6; minutes++) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(hours + ":" + minutes + i);

                }
            }

        }
    }
}
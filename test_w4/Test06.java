package test_w4;

import java.util.ArrayList;

public class Test06 {

    public static void main(String[] args) {
        ArrayList myAL2 = new ArrayList();
        System.out.println("Addd number");

        myAL2.add("abc");
         myAL2.add("def");
          myAL2.add("xyz");

          for (Object value : myAL2) {
              System.out.println(value);
          }

         System.out.println("Insert number");
         myAL2.add(2, "bee");
         for (Object value  : myAL2) {
             System.out.println(value);
         }
         System.out.println("Delete Number");
         myAL2.remove(0);
         for (Object value : myAL2){
            System.out.println(value);
         }
    }
}

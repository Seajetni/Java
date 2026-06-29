package test_w4;


import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList myAL = new ArrayList();
        myAL.add(10);
        myAL.add(20);
        myAL.add(30);

          for (int i=0; i<myAL.size() ; i++){
            System.out.println(myAL.get(i));
          }

          int sum = 0;
          for (int i=0 ; i< myAL.size(); i++){
            sum += (int)myAL.get(i);
          }
          System.out.println("sum : " + sum);
          System.out.println("Num of Num : " + myAL.size());
    }
}

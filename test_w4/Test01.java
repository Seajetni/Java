package test_w4;

public class Test01 {
    public static void main(String[] args) {
        int[]intArray1;
        int[]intArray2 = { 1,2 ,3 } ;
        intArray1 = new int[5];

        intArray1[0] = 10;
        intArray1[1] = 20;
        intArray1[2] = 30;
        intArray1[3] = 40;
        intArray1[4] = 50;

        int i;
        int sum = 0;
        for (i = 0; i < 5 ; i++) {

            System.out.print(intArray1[i] + " ");  
            sum += intArray1[i] ;

        }
        System.out.println("Sum Arr1 : " + sum);

        sum = 0;

        for (int value : intArray2) {
            sum += value;

        }
        System.out.println("Sum Arr2 : " + sum);
        System.out.println("Num of number : " + intArray2.length);

        }
}

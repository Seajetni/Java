package test_w4;

public class Test02 {


    public static void main(String[] args) {
        String[] sArray1;
       String[] sArray2 = { "red", "blue" ,"grred" } ;

        sArray1 = new String[5];

        sArray1[0] = "chan";
        sArray1[1] = "tayoung";
        sArray1[2] = "tert";
        sArray1[3] = "eiei";
        sArray1[4] = "sea";

        for (int i=0 ; i< 5 ; i++){
            System.out.print(sArray1[i] + " ");
        }
        System.out.println(" ");
        for (String value : sArray2){
            System.out.print(value + " ");
        }
    }
       
}

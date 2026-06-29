
public class w7 {
    public static void main(String[] args) {
        
         double[][] n = {{10,20,25} , {50,30,10} , {25,40,75} , { 15,35,30}};
         int sum = 0 ;
         for (int i = 0 ; i < 4 ; i++){
            for (int j = 0 ; j < 3 ; j++){
    
               sum +=  n[i][j];
               
            }
         }

        System.out.print(sum + " ");
    }
}

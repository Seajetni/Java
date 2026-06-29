
import java.util.ArrayList;

public class w8 {

    public static void main(String[] args) {
        ArrayList Arr = new ArrayList();

        for (int i = 0 ; i<100 ; i++){
            Arr.add(i+1);
        }

        for (Object value : Arr){
            System.out.println(value);
         }
    }
}

import java.util.Scanner;

public class w1 {
    public static void main(String[] args) {
        int a , b, c , ans ;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        ans = ((a + 5 ) * (b *2 )) / (c - 3);

        System.out.println(ans);

        sc.close();
    }
}

import java.util.Scanner;
public class w4 {

    public static void main(String[] args) {
        int x, y;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int ans = 0;

        for (int i = min; i <= max; i++) {
            ans += i;
        }

        System.out.println(ans);
        sc.close();
    }


}

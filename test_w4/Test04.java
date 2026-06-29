package test_w4;

public class Test04 {

    public static void main(String[] args) {
        int[][] Num = {{10, 20}, {30, 40}, {50, 60}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(Num[i][j] + " ");
            }
        }

        String[][] City;
        City = new String[3][3];

        City[0][0] = "Thailand";
        City[0][1] = "Japan";
        City[0][2] = "South Korea";
        City[1][0] = "Vietnam";
        City[1][1] = "Laos";
        City[1][2] = "Cambodia";
        City[2][0] = "England";
        City[2][1] = "Germany";
        City[2][2] = "France";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(City[i][j] + " , ");
            }
        }
    }
}

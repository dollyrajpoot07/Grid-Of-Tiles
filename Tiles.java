
// Grid Of Tiles
// krishna is a civil engineer. his boss gave him a tile of size 1X4. krishna's task is to find that in how many ways he can construct a grid of size nx4
// (Java program to count of ways to place 1 x 4 tiles on n x 4 grid)

import java.util.*;

class GridOfTiles {
    static int count(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            // Base cases
            if (i >= 1 && i <= 3)
                dp[i] = 1;
            else if (i == 4)
                dp[i] = 2;

            else {
                dp[i] = dp[i - 1] + dp[i - 4];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(count(n));
        // System.out.println("Count of ways is: " + count(n));
        sc.close();
    }
}

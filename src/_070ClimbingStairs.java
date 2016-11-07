
public class _070ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 3) return n;
        int[] stairs = new int[n];
        stairs[0] = 1; stairs[1] = 2; stairs[2] = 3;
        for (int i = 3; i < n; i++) stairs[i] = stairs[i - 1] + stairs[i - 2];
        return stairs[n - 1];
    }
}

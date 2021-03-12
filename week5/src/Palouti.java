import java.util.Scanner;

public class Palouti {
    int []dp=new int[200];
    int n;
    int ans;
    void input()
    {
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
    }
    void  solve() {
        dp[1] = 1;
        dp[2] = 2;
        if (n <= 2) {
            ans = dp[n];
            return;
        }
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        ans = dp[n];
        return;
    }
    void output()
    {
        System.out.println("ans="+ans);
    }

    public static void main(String[] args) {
        Palouti p=new Palouti();
        p.input();
        p.solve();
        p.output();
    }

}

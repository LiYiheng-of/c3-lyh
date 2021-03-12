import java.util.Scanner;

public class ReverseInteger {
    long temp;
    long ans;
    Scanner in=new Scanner(System.in);
    void input()
    {
        System.out.println("Please a number:");
        temp=(long) in.nextInt();
    }
    void solve()
    {
        while(temp!=0)
        {
            ans=ans*10+temp%10;
            temp/=10;
        }
        if(ans<-2147483648||ans>2147483647) ans=-1;
    }
    void output()
    {
        System.out.println("ans="+ans);
    }

    public static void main(String[] args) {
        ReverseInteger ri=new ReverseInteger();
        ri.input();
        ri.solve();
        ri.output();
    }

}

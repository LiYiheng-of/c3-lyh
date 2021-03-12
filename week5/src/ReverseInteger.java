import java.util.Scanner;

public class ReverseInteger {
    long  temp;
    long  ans;
    Scanner in=new Scanner(System.in);
    void input()
    {
        System.out.println("Please a number:");
        temp=in.nextLong();
    }
    void solve()
    {
        while(temp!=0)
        {
            ans=ans*10+temp%10;
            temp/=10;
        }
        if(ans<-2147483648L||ans>2147483467L) ans=-1;//用long可以避免使用数组来存储值
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

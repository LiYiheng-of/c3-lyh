import java.util.Scanner;

public class TransNumber {
    Scanner in = new Scanner(System.in);
    float number;
    int on,down;
    public void input()
    {
        System.out.println("Please input a float number");
        number=in.nextFloat();
    }
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public void solve()
    {
        on=(int) (number*100000);
        down=100000;
        int temp=gcd(on,down);
        on/=temp;
        down/=temp;
    }

    public static void main(String[] args) {
        TransNumber tn=new TransNumber();
        tn.input();
        tn.solve();
        System.out.println(tn.number+"="+tn.on+"/"+tn.down);
    }
}

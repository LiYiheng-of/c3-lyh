
import java.util.Scanner;

public class StringCmp {
    String Org_str,find_str;
    Scanner in = new Scanner(System.in);
    public void input()
    {
     System.out.println("请输入被匹配的字符串A:");
     Org_str=in.nextLine();
     System.out.println("请输入要匹配的字符串B:");
     find_str=in.nextLine();
    }
    public void solve()
    {
        System.out.println(Org_str.indexOf(find_str));
    }

    public static void main(String[] args) {
        StringCmp temp=new StringCmp();
        temp.input();
        temp.solve();
    }
}

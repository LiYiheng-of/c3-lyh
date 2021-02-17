import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicaChars {
    Scanner in = new Scanner(System.in);
   Set<Character> set=new HashSet<>();
   String str;
   StringBuffer ans=new StringBuffer();
   public void input()
   {
       System.out.println("请输入要去重的字符串:");
       str=in.nextLine();
   }
   public void output()
   {
       System.out.println("处理后的字符串为:"+ans.toString());
   }

   public void solve()
   {
     for(int i=0;i<str.length();i++)
         set.add(str.charAt(i));
     for(Character i:set)
         ans.append(i.toString());
   }

    public static void main(String[] args) {
        RemoveDuplicaChars R=new RemoveDuplicaChars();
        R.input();
        R.solve();
        R.output();
   }

}

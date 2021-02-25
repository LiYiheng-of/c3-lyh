import java.util.Scanner;

public class FindFirstChar {
    Scanner in = new Scanner(System.in);
    String str;
    public void input()
    {
        System.out.println("Please input str:");
        str=in.nextLine();
    }
    public int solve()
    {
        int[] hash=new int[26];
        for(int i=0;i<str.length();i++)
            hash[str.charAt(i)-'a']++;
        for(int i=0;i<str.length();i++)
            if(hash[str.charAt(i)-'a']==1)
                return i;
            return  -1;

    }

    public static void main(String[] args) {
    FindFirstChar ff=new FindFirstChar();
    ff.input();
    System.out.println(ff.solve());
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeWord {
    ArrayList<String> strings=new ArrayList<>();
    ArrayList<ArrayList<String>> ans=new ArrayList<>();
    ArrayList<String> media=new ArrayList<>();
    Scanner in=new Scanner(System.in);
    void input()
    {
        System.out.println("Please input strings(-1 end)");
        String temp;
        while(true) {
            temp=in.next();
            if(temp.equals("-1")) break;
            strings.add(temp);
            String t2=new String(temp);
            media.add(t2);
        }
    }
    void solve() {
        for (int i = 0; i < strings.size(); i++) {
            char[] temp = strings.get(i).toCharArray();
            Arrays.sort(temp);
            strings.set(i,new String(temp));
        }
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).equals("-1")) continue;
            ArrayList<String> t=new ArrayList<>();
            t.add(strings.get(i));
            for (int j = i+1; j < strings.size(); j++)
                 if(strings.get(i).equals(strings.get(j))) {t.add(media.get(j)); strings.set(j,"-1");}
            ans.add(t);
        }
    }

    public static void main(String[] args) {
        MergeWord mw = new MergeWord();
        mw.input();
        mw.solve();
        for (int i = 0; i < mw.ans.size(); i++) {
            for (int j = 0; j < mw.ans.get(i).size(); j++)
                System.out.print(mw.ans.get(i).get(j)+" ");
            System.out.println();
        }
    }
}

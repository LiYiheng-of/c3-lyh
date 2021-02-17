import java.util.*;

public class WordCount {
    Scanner in = new Scanner(System.in);
    Map<Character,Integer> map=new HashMap<>();
    String str;
    public void input()
    {
        System.out.println("请输入需要统计的字符串:");
        str=in.nextLine();
    }
    public void output()
    {
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        Iterator<Map.Entry<Character,Integer>> iterator=set.iterator();
     while(iterator.hasNext())
     {
         Map.Entry<Character,Integer> temp=iterator.next();
         System.out.println(temp.getKey()+"="+temp.getValue());
     }
    }
    public  void  solve()
    {
        for(int i=0;i<str.length();i++)
            if(map.containsKey(str.charAt(i)))
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            else map.put(str.charAt(i),1);
    }
    public static void main(String[] args) {
       WordCount w=new WordCount();
       w.input();
       w.solve();
       w.output();
    }
}

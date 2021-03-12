import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Ziji {
    Vector<Vector<Integer>> ans= new Vector<Vector<Integer>> ();
    Vector<Integer> input=new Vector<>();
    void input()
    {
        Integer temp;
        Scanner in=new Scanner(System.in);
        while((temp=in.nextInt())!=-1) //输入-1结束
            input.add(temp);
    }

    void dfs(int now,Vector<Integer> path)  //暴力递归....想不到其他办法了
    {
        if(now==input.size())
        {
            ans.add((Vector<Integer>) path.clone());
            return;
        }
        dfs(now+1,path);
        path.add(input.get(now));
        dfs(now+1,path);
        path.remove(path.size()-1);
    }


    void solve()
    {
        dfs(0,new Vector<Integer>());
    }

    void output()
    {
        Iterator<Vector<Integer>> iterator1=ans.iterator();
        while(iterator1.hasNext())
        {
            Iterator<Integer> iterator2=iterator1.next().iterator();
            while (iterator2.hasNext())
            {
                System.out.print(iterator2.next());
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {

        Ziji ziji=new Ziji();
        ziji.input();
        ziji.solve();
        ziji.output();
    }
}

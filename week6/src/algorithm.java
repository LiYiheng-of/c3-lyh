import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class algorithm {
       public class solve{
        int n,m,x,y,l,r,u,d;
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> p=null;
        void  up()
        {
            x--;
            y++;
            if(ans.size()>=m*n) return;
            while(x>=u)
                ans.add(p.get(x--).get(y));
            l++;
            right();
        }
        void right()
        {
            if(ans.size()>=m*n) return;
            y++;
            x++;
            while(y <=r)
                ans.add(p.get(x).get(y++));
            u++;
            down();
        }
        void left()
        {
            x--;
            y--;
            if(ans.size()>=m*n) return;
            while(y>=l)
                ans.add(p.get(x).get(y--));
            d--;
            up();
        }
        void down()
        {
            x++;
            y--;
            if(ans.size()>=m*n) return;
            while(x<=d)
                ans.add(p.get(x++).get(y));
            r--;
            left();
        }
        ArrayList<Integer> sol(ArrayList<ArrayList<Integer>> matrix) {
            n=matrix.size();
            m=matrix.get(0).size();
            p=matrix;
            x=-1;y=-1;
            u=0;r=m-1;l=0;d=n-1;
            right();
            return ans;
        }
    }
    public static void main(String[] args) {
        algorithm alg=new algorithm();
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3));
        matrix.add(list);
        list=  new ArrayList<>(Arrays.asList(4,5,6));
        matrix.add(list);
        list = new ArrayList<>(Arrays.asList(7,8,9));
        matrix.add(list);
        solve solve= alg.new solve();
        ArrayList<Integer> ans =solve.sol(matrix);
        Iterator it=ans.iterator();
        while(it.hasNext())
        {
            Integer temp= (Integer) it.next();
            System.out.print(String.valueOf(temp)+" ");
        }
    }

}

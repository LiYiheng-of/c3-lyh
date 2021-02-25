import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FindKthMin {
    Scanner in=new Scanner(System.in);
    int K;
    ArrayList<Integer> list=new ArrayList<>();
    public void input()
    {
        System.out.println("Please input K");
        K=in.nextInt();
        int temp;
        System.out.println("Please input numbers(-1 end)");
        while((temp=in.nextInt())!=-1)
            list.add(temp);
    }
    public int solve()
    {
        list.sort(Comparator.naturalOrder());
        return list.get(K-1);
    }

    public static void main(String[] args) {
        FindKthMin fkm=new FindKthMin();
        fkm.input();
        System.out.println(fkm.solve());
    }
}

import java.util.*;

public class FindMainNumber {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> list=new ArrayList<>();
    Map<Integer,Integer> map=new HashMap<>();
    public void input()
    {
        int temp;
        System.out.println("Please input numbers(-1 end)");
        while((temp=in.nextInt())!=-1)
            list.add(temp);
    }
    public int solve() {
        int count = 0;
        for (int i : list)
            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            if (map.get(key) >= list.size()/2) return map.get(key);
        }
        return -1;
    }

    public static void main(String[] args) {
        FindMainNumber fmn=new FindMainNumber();
        fmn.input();
        System.out.println(fmn.solve());
    }
}

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class List1 {
    Scanner in = new Scanner(System.in);
    int n,arr[],target;
    LinkedList<int[]> ans=new LinkedList<>();
     void input()
     {
         System.out.println("请输入问题数组长度和target:");
         n=in.nextInt();
         target=in.nextInt();
         arr=new int[n];
         System.out.println("请输入问题数组:");
         for(int i=0;i<n;i++)
             arr[i]=in.nextInt();
     }
     void solve()
     {
         if(n < 3) return ;
         Arrays.sort(arr);
         for(int i = 0; i < n - 2; ++i)
                 {
                     if(arr[i] > target) break;
                     while(i > 0 && arr[i] == arr[i - 1]&&i<n-2)  i++;
                     int left = i + 1, right = n - 1;
                     while(left < right)
                     {
                         if(arr[i] + arr[left] + arr[right] == target)
                         {
                             ans.add(new int[]{arr[i], arr[left], arr[right]});
                             while(left < right && arr[left + 1] == arr[left++]);
                             while(left < right && arr[right - 1] == arr[right--]);
                         }
                         else if(arr[i] + arr[left] + arr[right] > target)
                             while(left < right && arr[right - 1] == arr[right--]);
                         else
                             while(left < right && arr[left + 1] == arr[left++]);
                     }
                 }
             }//排序加双指针,时间复杂度O(N方)
    public static void main(String []args)
    {
        List1 l=new List1();
      l.input();
      l.solve();
        Iterator iter = l.ans.iterator();
        while (iter.hasNext()) {
            int temp[]= (int[]) iter.next();
           System.out.println(Arrays.toString(temp));
        }
     }
}

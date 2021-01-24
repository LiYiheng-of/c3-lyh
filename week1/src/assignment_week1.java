import java.util.Scanner;
public class assignment_week1 {
    public static void BMI()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("请依次输入身高(m),体重(kg):");
        double height=in.nextDouble();
        double weight=in.nextDouble();
        double BMI=weight/(height*height);
        System.out.println("BMI="+BMI);
        if (BMI<18.5)
            System.out.println("过轻");
        else if(BMI<25)
            System.out.println("正常");
        else if(BMI<28)
            System.out.println("肥胖");
        else if(BMI<32)
            System.out.println("过于肥胖");
    }
    public static void Sxh_num_in_x(int x){
        int i,temp,sum;
        for(i=0;i<x;i++)
        {
            int j=i;
            sum=0;
            while(j!=0)
            {
                temp=j%10;
                sum+=temp*temp*temp;
                j/=10;
            }
            if(sum==i)
                System.out.println(i);
        }
    }
    public static String reverse(String str){
        String new_str="";
        for(int i=str.length()-1;i>=0;i--)
        {
            new_str+=str.charAt(i);
        }
        return new_str;
    }
    public static void move_x_to_end(int[] arr,int x)
    {
        int temp;
        for(int i=1;i<arr.length;i++)
            for(int j=0;j<arr.length-i;j++)
            if(arr[j]==x)
            {
                arr[j]=arr[j+1];
                arr[j+1]=x;
            }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        /////////////1
        System.out.println("////////////////\n作业1:BMI");
        BMI();

        //////////////2
        System.out.println("////////////////\n作业2:水仙花数");
        System.out.println("1000以内的水仙花数:");
        Sxh_num_in_x(1000);

        //////////////3
        System.out.println("////////////////\n作业3:字符串反转");
        System.out.println("请输入需要反转的字符串:");
        String str=in.nextLine();
        System.out.println(reverse(str));

        //////////////4
        System.out.println("////////////////\n作业4:移动0");
        int[]arr={0,1,0,3,12};
        move_x_to_end(arr,0);
        for(int i:arr)
            System.out.print(i+" ");
    }
}

import java.util.Objects;
import java.util.Scanner;

public class assignment_week1_5to8 {
//    public static class Circle
//    {
//        private double radius;
//        Circle(double r)
//        {
//           radius=r;
//        }
//        void SetRadius(double r)
//        {
//            radius=r;
//        }
//        double getArea()
//        {
//            return 3.14*radius*radius;
//        }
//        double getPerimeter()
//        {
//            return 2*3.14*radius;
//        }
//    }
//    public static class Ban_Account
//    {
//        private double balance;
//        private String name;
//        Ban_Account(double b,String na)
//        {
//            balance=b;
//            name=na;
//        }
//        double check_balance()
//        {
//            return balance;
//        }
//        String getName()
//        {
//            return name;
//        }
//    }
//    public static class ComplexNumber
//    {
//        private double shi,xu;
//        ComplexNumber(double shi,double xu)
//        {
//            this.shi=shi;
//            this.xu=xu;
//        }
//        public ComplexNumber add(ComplexNumber another)
//        {
//          return new ComplexNumber(shi+another.shi,xu+another.xu);
//        }
//        public ComplexNumber reduce(ComplexNumber another)
//        {
//
//            return new ComplexNumber(shi-another.shi,xu-another.xu);
//        }
//        public ComplexNumber multiply(ComplexNumber another)
//        {
//            return new ComplexNumber(shi * another.shi-xu* another.xu,xu*another.shi+shi*another.xu);
//        }
//        public void print()
//        {
//            System.out.println(shi+"+"+xu+"i");
//        }
//    }
    public  class Animal{
        double height,weight;
        String name;

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Animal animal = (Animal) o;
//        return Double.compare(animal.height, height) == 0 && Double.compare(animal.weight, weight) == 0 && Objects.equals(name, animal.name);
//    }

    Animal()
    {
        height=5;
        weight=5;
        name="dd";
    }
    public void sleep()
        {
            System.out.println(name+"正在睡觉中,请勿打扰");
        }
        public void eat()
        {
            System.out.println(name+"正在进食中~~ 体重++");
            weight+=2;
        }
        public void show_info()
        {

            System.out.println(name+"体重:"+weight+"身高:"+height);
        }
    }
    public class Tiger extends Animal{
        Tiger()
        {
            name="老虎";
            height=1.6;
            weight=200;
        }
        public void eat(){
            System.out.println(name+"正在进食中~~ 体重++");
            weight+=2;
        }
    }
    public class Rabbit extends Animal{
        Rabbit()
        {
            name="兔子";
            height=0.2;
            weight=15;
        }
        public void eat(){
            System.out.println(name+"正在进食中~~体重++");
            weight+=0.5;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        assignment_week1_5to8 assignment=new assignment_week1_5to8();

        Animal an=assignment.new Animal();
        System.out.println(an);
//        Object o=new Object();
//        System.out.println(o.toString());
//        /////////////////5
//        System.out.println("////////////////\n作业5:圆类");
//        Circle cir=new Circle(1.5);
//        System.out.println(cir.getArea()+"  "+cir.getPerimeter()+'\n'+"请输入新的半径:");
//        double new_radius=in.nextDouble();
//        cir.SetRadius(new_radius);
//        System.out.println(cir.getArea()+"  "+cir.getPerimeter());
//
//        ////////////////6
//        in.nextLine();
//        System.out.println("////////////////\n作业6:账户类");
//        System.out.println("请输入账户名称和余额(账户名称切记后加回车):");
//        String name=in.nextLine();
//        double balance=in.nextDouble();
//        Ban_Account act=new Ban_Account(20,name);
//        System.out.println(act.getName()+" 您的余额为:"+act.check_balance());
//
//        ///////////////7
//        System.out.println("////////////////\n作业7:复数类");
//        ComplexNumber comp1=new ComplexNumber(2,3);
//        ComplexNumber comp2=new ComplexNumber(1,2);
//        ComplexNumber ans=comp1.add(comp2);
//        ans.print();
//        ans=comp1.reduce(comp2);
//        ans.print();
//        ans=comp1.multiply(comp2);
//        ans.print();
        //////////////////8
//        System.out.println("////////////////\n作业8:动物类");
//        Tiger T=assignment.new Tiger();
//        Rabbit R=assignment.new Rabbit();
//        T.show_info();
//        T.sleep();
//        T.eat();
//        T.show_info();
//        R.show_info();
//        R.sleep();
//        R.eat();
//        R.show_info();
    }
}

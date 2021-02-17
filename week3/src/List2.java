import java.util.*;

public class List2 {
    Scanner in = new Scanner(System.in);
    public class People{
        int Id,Salary;
        String name;
        Integer ManagerID;

        @Override
        public String toString() {
            return "People{" +
                    "Id=" + Id +
                    ", Salary=" + Salary +
                    ", name='" + name + '\'' +
                    ", ManagerID=" + ManagerID +
                    '}';
        }

        public People(int id, int salary, String name, Integer managerID) {
            Id = id;
            Salary = salary;
            this.name = name;
            ManagerID = managerID;
        }
    }
    public static void main(String[] args) {
        LinkedList<People> peopleList=new LinkedList<>();
        List2 l=new List2();
        peopleList.add(l.new People(1,70000,"Joe",3));
        peopleList.add(l.new People(2,80000,"Henry",4));
        peopleList.add(l.new People(3,60000,"Sam",null));
        peopleList.add(l.new People(4,90000,"Max",null));
        Iterator iter=peopleList.iterator();
        while(iter.hasNext())
            System.out.println((iter.next().toString()));
    }
}

import java.util.Scanner;
import java.util.Stack;

public class MatchBrackets {
    String s;
    Scanner in=new Scanner(System.in);
    Stack<Character> stack=new Stack<>();
    public void input()
    {
        System.out.println("Please input a string");
        s=in.nextLine();
    }
    boolean check(char a)
    {
        if(a==')'&&stack.peek()=='(') return true;
        if(a==']'&&stack.peek()=='[') return true;
        if(a=='}'&&stack.peek()=='{') return true;
        return false;
    }
    public boolean solve()
    {
        for(int i=0;i<s.length();i++)
            if(stack.empty()||s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') stack.push(s.charAt(i));
            else if(check(s.charAt(i))) stack.pop();
            else return false;
            return stack.empty();
    }

    public static void main(String[] args) {
        MatchBrackets mb=new MatchBrackets();
        mb.input();
        System.out.println(mb.solve());
    }

}

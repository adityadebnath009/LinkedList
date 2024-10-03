//  Given a list of integers in Java, the task is to reverse the given list of integers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Stack01 {
    public static ArrayList<?> reverseList(ArrayList<Integer> ll,Stack<Integer> s)
    {
        for(int i = 0;i<ll.size();i++)
        {
            ll.set(i,s.pop());
        }
        return ll;

    }

    public static void main(String[] arr)
    {
        ArrayList<Integer> ll = new ArrayList<Integer>(Arrays.asList(2,4,7,8,9));
        Stack<Integer> s = new Stack<>();
        for(Integer x:ll)
        {
            s.push(x);

        }
        System.out.println("The reverse list---");
        System.out.println(reverseList(ll,s));
        



    }
    
}

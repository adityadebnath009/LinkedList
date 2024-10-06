// Problem: Given prices of a Stock for N consecutive days, the task is to find the span for every day. The span of a stock for a day i is defined as the number of consecutive days before it with price less than the price on i-th day including the i-th day. 


import java.util.Arrays;

public class Stack02
{
    public static void span(ArrayList<Integer> ll)
    {
        for(int i = 0;i<ll.size();i++)
        {
            int count  = 0;
            for(int j=0;j<=i;j++)
            {
                if(ll.get(j)<=ll.get(i))
                {
                    count++;
                }


            }
            System.out.print(count+" ");
        }

    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list  = new ArrayList<>(Arrays.asList(13,15,12,14,16,8,6,4,10,30));
        span(list);




    }
}
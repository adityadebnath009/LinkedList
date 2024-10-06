// Problem: Given an array of integers, the task is to find the closest previous greater element for every element of the given array.

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Stack03 {
    public static void GreatestPrevElem(ArrayList<Integer> arr)
    {
         for(int i=0;i<arr.size();i++)
        {
            int pg = -1;
            for(int j = i;j>=0;j--)
            {
                if(arr.get(i)<arr.get(j))
                {
                    pg = arr.get(j);
                    break;
                }
            }
            System.out.print(pg +" ");



        }

        

    }
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(8,12,10));
        
        GreatestPrevElem(arr);


    }
    
}

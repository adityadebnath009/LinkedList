//Problem--Stock Span problem in Java

public class Stack04 {
    public static void Span(int[] arr)
    {
        for(int i = 0;i<arr.length;i++)
        {
            int count = 0;
            for(int j =i;j>=0;j--)
            {
                if(arr[i]>=arr[j])
                {
                    count++;
                }

            }
            System.out.print(count+" ");
        }

    }
    public static void main(String[] args)
    {
        int arr[] = {18,12,13,14,11,16};
        Span(arr);

    }
    
}

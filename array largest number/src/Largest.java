import java.util.Scanner;
public class Largest
{
    public static void main(String[] args)
    {
        int n;
        int Large;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        Large = a[0];
        for(int i = 0; i < n; i++)
        {
            if(Large < a[i])
            {
                Large = a[i];
            }
        }
        System.out.println("Maximum value in the array is:"+Large);
    }
}
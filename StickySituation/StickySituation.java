import java.util.Arrays;
import java.util.Scanner;

public class StickySituation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int amountOfSticks = scanner.nextInt();
        long[] sticks = new long[amountOfSticks];


        for(int i = 0; i < amountOfSticks; i++)
        {
            sticks[i] = scanner.nextLong();

        }

        if (isPossibleTriangle(sticks, amountOfSticks))
        {
            System.out.println("possible");
        }
        else
        {
            System.out.println("impossible");
        }
    }
    static boolean isPossibleTriangle(long [] arr, int n)
    {
        Arrays.sort(arr);

        for(int i = 0; i < n -2; i++)
        {
            if (arr[i] + arr[i+1] > arr[i+2])
                return true;
        }
        return false;
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pet
{
    public static void main(String[] args)
    {
        Scanner lineScanner = new Scanner(System.in);
        int maxSum = 0;
        int maxIdx = 0;

        for(int i = 0; i < 5; i++)
        {
            int sum = 0;

            String num = lineScanner.nextLine();
            Scanner numberScanner = new Scanner(num);

            for (int j = 0; j < 4; j++)
            {
                sum = numberScanner.nextInt() + sum;
            }

            if (sum > maxSum)
            {
                maxSum = sum;
                maxIdx = i;
            }
        }
        System.out.println(maxIdx+1 +" " + maxSum);

    }
}

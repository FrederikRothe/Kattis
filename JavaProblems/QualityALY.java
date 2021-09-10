import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class QualityALY
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        int numberOfLQ = scanner.nextInt();
        double sum = 0;

        double[] numbers = new double[numberOfLQ*2];

       for(int j = 0; j < numbers.length; j++)
       {
           numbers[j] = scanner.nextDouble();
       }

        for(int i = 0; i < numbers.length - 1; i += 2)
        {
            sum = sum + (numbers[i+1] * numbers[i]);
        }

        System.out.println(sum);
    }
}

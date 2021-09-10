import java.util.Scanner;
import java.util.*;

public class Coldputer
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int amountOfT;
        amountOfT = scanner.nextInt();
        int[] temps = new int[amountOfT];
        int negativeCounter = 0;

        for(int i = 0; i < temps.length; i++)
        {
            temps[i] = scanner.nextInt();
        }


        for(int i = 0; i < temps.length; i++) {
            if (temps[i] < 0)
            {
                negativeCounter++;
            }

        }

        System.out.println(negativeCounter);

        scanner.close();


    }
}

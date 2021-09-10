import java.util.Scanner;

public class Tarifa
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int webPerMonth = scanner.nextInt();
        int[] months = new int[scanner.nextInt()];
        int remainingData = 0;
        int usableData = 0;

        for (int i = 0; i < months.length; i++)
        {
            months[i] = scanner.nextInt();
        }

        for (int i = 0; i < months.length; i++)
        {
            remainingData = (webPerMonth - months[i]) + remainingData;
        }

        usableData = remainingData + webPerMonth;

        System.out.println(usableData);



    }
}

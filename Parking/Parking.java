import java.util.Scanner;

public class Parking
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int cost[] = new int[] {0, scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int truckOne[] = new int[] {scanner.nextInt(), scanner.nextInt()};
        int truckTwo[] = new int[] {scanner.nextInt(), scanner.nextInt()};
        int truckThree[] = new int[] {scanner.nextInt(), scanner.nextInt()};

        int sum = 0;
        int trucks = 0;

        for (int i = 0; i < 100; i++)
        {
            if(i == truckOne[0])
            {
                trucks++;
            }
            if(i == truckOne[1])
            {
                trucks--;
            }
            if(i == truckTwo[0])
            {
                trucks++;
            }
            if(i == truckTwo[1])
            {
                trucks--;
            }
            if(i == truckThree[0])
            {
                trucks++;
            }
            if(i == truckThree[1])
            {
                trucks--;
            }

            sum += trucks * cost[trucks];

        }

        System.out.println(sum);

    }
}

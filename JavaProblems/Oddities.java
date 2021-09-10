import java.util.Scanner;

public class Oddities
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int amountOfNumbers = scanner.nextInt();

        for(int i = 0; i < amountOfNumbers; i++)
        {
            int number = scanner.nextInt();
            if(Math.abs(number) % 2 == 1)
            {
                System.out.println(number + " is odd");
            }
            else
            {
                System.out.println(number + " is even");
            }
        }

    }
}

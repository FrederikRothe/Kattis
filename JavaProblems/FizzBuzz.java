import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] numbers = new int[scanner.nextInt()];
        int previousNumber = 0;

        //Fill Array.
        for (int i = 0; i < numbers.length; i++)
        {
            previousNumber += 1;
            numbers[i] += previousNumber;
        }

        // If x mod number == 0, then Fizz, If Y mod number == 0 then Buzz, if both FizzBuzz

        for (int j = 0; j < numbers.length; j++)
        {
            if (numbers[j] % x == 0 && numbers[j] % y == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if (numbers[j] % x == 0)
            {
                System.out.println("Fizz");
            }
            else if (numbers[j] % y == 0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(numbers[j]);
            }
        }
    }
}

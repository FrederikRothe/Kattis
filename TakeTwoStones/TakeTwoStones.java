import java.util.Scanner;

public class TakeTwoStones
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if(input % 2 == 1)
        {
            System.out.println("Alice");
        }
        else
        {
            System.out.println("Bob");
        }
    }
}

import java.util.Scanner;

public class NastyHacks
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] cases = new int[scanner.nextInt() * 3];

        for (int i = 0; i < cases.length; i++)
        {
            cases[i] = scanner.nextInt();
        }

        for (int j = 0; j < cases.length - 2; j+=3)
        {
            if (cases[j] < cases[j+1] - cases[j+2])
            {
                System.out.println("advertise");
            }
            else if (cases[j] > cases[j+1] - cases[j+2])
            {
                System.out.println("do not advertise");
            }
            else if (cases[j] == cases[j+1] - cases[j+2])
            {
                System.out.println("does not matter");
            }
            else
            {
                System.out.println("invalid input");
            }
        }

    }
}


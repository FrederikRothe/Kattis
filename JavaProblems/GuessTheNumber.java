import java.util.Scanner;

public class GuessTheNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean answer = false;

        int min = 1;
        int max = 1000;



        while(answer == false)
        {
            int guess = (min + max) / 2;
            System.out.println(guess);
            switch (scanner.next())
            {
                case "lower":
                    max = guess -1;
                    break;

                case "higher":
                    min = guess +1;
                    break;

                case "correct":
                        answer = true;
                        break;
            }

        }




    }

}

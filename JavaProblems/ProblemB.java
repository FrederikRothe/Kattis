import java.util.Scanner;

public class ProblemB
{

    public static int hours;
    public static int minutes;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        minutes = scanner.nextInt();

        sub45();

        System.out.print(hours +" "+ minutes);

    }

    public static void sub45()
    {

        if(minutes >= 45)
        {
            minutes = minutes - 45;
        }
        else
        {
            if(0 > hours)
            {
                System.out.println("Error");
            }
            else if(23 < hours)
            {
                hours = 0;
            }


            hours = hours - 1;
            minutes = (minutes + 60) - 45;
        }


    }
}

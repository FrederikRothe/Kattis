import java.util.Scanner;

public class Tri
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();


        if( x + y == z)
        {
            System.out.println(x + "+" + y + "=" + z);
        }
        else if ( x / y == z)
        {
            System.out.println(x + "/" + y + "=" + z);
        }

        {

        }

    }
}

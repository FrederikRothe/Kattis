import java.util.Scanner;
import java.util.ArrayList;

public class DigitProduct
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if(x >= 10 && x <= 1000)
        {
            String xString = String.valueOf(x);
            //System.out.println(xString);
            xString = xString.replace("0", "");
            //System.out.println(xString);

            ArrayList<String> array = new ArrayList<String>();

            String newString = "";

            int newX = 1;

            while(x > 9)
            {
                for(int j = 0; j < xString.length(); j++)
                {
                    array.add(xString.substring(j, j+1));


                }
            }
        }

        System.out.println(x);
    }
}
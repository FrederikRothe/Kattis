import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SFC
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] numberInput = new int[2];

        for(int i = 0; i < numberInput.length; i++)
            numberInput[i] = scanner.nextInt();


        System.out.println(numberInput[1]);

    }

}

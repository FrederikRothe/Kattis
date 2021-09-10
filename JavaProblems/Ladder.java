import java.util.Scanner;
import java.math.*;
import java.util.*;

public class Ladder {

    public static void main(String[] args)
    {
        int height;
        double v;
        int length;

        Scanner scanner = new Scanner(System.in);
        height = scanner.nextInt();
        v = scanner.nextInt();

        length = (int)Math.ceil(height / (Math.sin(Math.toRadians(v))));

        System.out.println(length);

    }


}

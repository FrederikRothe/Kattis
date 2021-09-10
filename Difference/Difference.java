import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Long> input = new ArrayList<>();

        while (scanner.hasNext())
        { //Filling list as long as input is present
            long x = scanner.nextLong();
            long y = scanner.nextLong();

            long difference = Math.abs(x - y);

            System.out.println(difference);


        }
    }
}
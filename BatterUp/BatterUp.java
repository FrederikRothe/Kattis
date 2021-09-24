import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.nextLine();
        String bats = sc.nextLine();
        String[] numberArr = bats.split(" ");
        float count = 0;
        float total = 0;
        

        for (int i = 0; i < number; i++) {
            var currentNumber = Integer.parseInt(numberArr[i]);
            if(currentNumber != -1)
            {
                count++;
                total+=currentNumber;
            }
        }

        float result = total/count;

        System.out.println(result);

        sc.close();

    }
}

import java.util.Scanner;

public class Chanukah {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amountOfCases = sc.nextInt(); 
        int sum;

        for(int i = 0; i < amountOfCases; i++){
            sum = 0;
            int caseNumber = sc.nextInt();
            int amountOfDays = sc.nextInt();

            for(int j = 1; j < amountOfDays+1; j++){
                sum += j + 1;
                }
            System.out.println(caseNumber + " " + sum);
        }

    }
}
import java.util.Scanner;

public class HuskeseddelJ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt() + 1 ;
        String sInput = input + "";
        System.out.println(new StringBuilder(sInput).reverse().toString());
    }
}
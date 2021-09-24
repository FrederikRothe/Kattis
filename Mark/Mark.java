import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int maxY = 0;
        int maxX = 0;
        int minY = 10000;
        int minX = 10000;

        for (int i = 0; i < amount; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x > maxX) maxX = x;
            if(x < minX) minX = x;
            if(y > maxY) maxY = y;
            if(y < minY) minY = y;            
        }
        System.out.println((maxX-minX)*(maxY-minY));
    }
}
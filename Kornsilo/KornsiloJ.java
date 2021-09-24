import java.util.*;

public class KornsiloJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int h = sc.nextInt();

        //Givet at H == 1, behøves *h ikke. 
        if(n-(k*h) > 0) System.out.println(n-(k*h));
        else System.out.println(0);
        
    }
}
import java.util.*;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total =0, height = 0;
        
        for(int i = 1; ; i++) {
            int cubesNeeded = i * (i + 1) / 2;
            if(total + cubesNeeded > n) {
                break;
            }
            total += cubesNeeded;
            height++;
        }
        System.out.println(height);
    }
}
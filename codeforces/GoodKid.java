import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        while (t-- > 0) {
            
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            

            long max = Long.MIN_VALUE;

            for(int i = 0; i < n; i++) {
                arr[i]++;

                long mul = 1;
                for(int x : arr) mul *= x;

                max = Math.max(max, mul);

                arr[i]--;
            }
            System.out.println(max);
        }
    }
}

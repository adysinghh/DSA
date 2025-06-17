//A. Way Too Long Words
// https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            String word = sc.next();
            if(word.length() > 10) {
                String shortened = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(shortened);
            } else {
                System.out.println(word);
            }
        }
    }
}
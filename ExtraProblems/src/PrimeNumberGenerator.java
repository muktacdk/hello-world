/**
 * Created by kulkarmu on 7/16/2017.
 */

import java.util.Scanner;
public class PrimeNumberGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number : ");
        int n = sc.nextInt();

        boolean[] primrArray = new boolean[n];
        for (int i = 2; i <= n / 2; i++) {
            if(primrArray[i] == false)
                for(int j = 2 * i; j <= n; j += i) {
                    primrArray[j] = true;
                }
        }

        for (int i = 0; i < n; i++) {
            if (primrArray[i] == false)
                System.out.println(i);
        }
       /* if(n >= 2)
            System.out.println("2");

        else
            return;

        for (int j = 3; j < n; j = j + 2) {
            for (int i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
                System.out.println(j);
            else
                flag = false;
        }*/
    }
}

package Java101.section5.practice8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        System.out.println("*** Üçgen ***\n");

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n*** Elmas ***");

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i>= 1; i--) {
            for(int l = n-i; l>=1; l--){
                System.out.print(" ");
            }
            for(int m = (2*i)-1; m>=1; m--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}

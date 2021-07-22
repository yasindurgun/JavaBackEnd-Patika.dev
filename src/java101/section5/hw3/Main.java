package java101.section5.hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.print("Sayi giriniz: ");
        sayi = scan.nextInt();

        for(int i=sayi; i>= 1; i--){
            //System.out.print("a");
            for(int j = sayi; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=2*i-1; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

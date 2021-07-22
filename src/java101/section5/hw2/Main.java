package java101.section5.hw2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n, bolenToplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        n = scan.nextInt();

        for(int i =1; i<n; i++){
            if( n % i == 0) {
                bolenToplam += i;
            }
        }
        if(bolenToplam == n){
            System.out.println(n+" Mükemmel sayıdır.");
        }else {
            System.out.println(n+" Mükemmel sayı değildir.");
        }
    }
}

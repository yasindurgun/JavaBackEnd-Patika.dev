package java101.section5.practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int number, sayac=0, ortalama=0,toplam=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = scan.nextInt();

        for(int i=1; i<=number; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sayac++;
                //System.out.println("sayac"+sayac);
                toplam+=i;
                //System.out.println("toplam"+toplam);
            }
        }

        ortalama = toplam / sayac;
        System.out.println("Ortalama: " +ortalama);
    }
}

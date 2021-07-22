package java101.section5.hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int val=0, sayi,max=-2147483648,min=2147483647;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayi = scan.nextInt();

        for(int i = 1; i<=sayi; i++){
            System.out.print(i+". sayıyı giriniz:");
            val = scan.nextInt();
            if(val > max){
                max = val;
            }
            if(val < min){
                min = val;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);

    }
}

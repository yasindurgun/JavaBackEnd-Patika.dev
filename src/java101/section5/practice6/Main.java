package java101.section5.practice6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int number, basValueTotal=0;
        int basamakSayisi = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = scan.nextInt();
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        //Basamak sayısı bulma
        while(tempNumber != 0){
            tempNumber/=10;
            basamakSayisi++;
        }

        tempNumber = number;
        while(tempNumber != 0){
            basValue = tempNumber % 10;
            basValueTotal+=basValue;
            basPow = 1;
            //System.out.println(basValue);
            for(int i = 1; i<=basamakSayisi; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10 ;
        }

        //System.out.println("Basamak Sayısı: "+basamakSayisi);
        if(number == result){
            System.out.println("Armstrong sayısıdır: "+result);
        }else{
            System.out.println("Armstrong sayı değildir");
        }
        System.out.println("Sayının basamak sayıları toplamı: "+basValueTotal);
    }
}

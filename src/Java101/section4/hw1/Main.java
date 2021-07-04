package Java101.section4.hw1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int km,age,type,carpan = 1;
        double total , discount = 0.0, typeDiscount=0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        type = input.nextInt();

        if(km >0 && age >0 && (type == 1 || type == 2)){
            if(type == 2){
                typeDiscount = 0.2;
                carpan = 2;
            }
            if(age<12){
                discount=0.5;
            }
            else if(age <24) {
                discount = 0.1;
            }
            else if(age>65){
                discount=0.3;
            }

            total = km * 0.10;
            total = total - total*discount;
            total = total - total*typeDiscount;
            total = total * carpan;
            System.out.println("Total: "+total);

        }else {
            System.out.println("Hatalı veri girdiniz.");
        }

    }
}

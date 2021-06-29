package Java101.section3.hw2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armutKgTutar = 2.14, elmaKgTutar = 3.67, domatesKgTutar = 1.11, muzKgTutar = 0.95, patlicanKgTutar=5.0;
        double toplamTutar;

        System.out.print("Armut kaç kg? :");
        armutKg = input.nextDouble();

        System.out.print("Elma kaç kg? :");
        elmaKg = input.nextDouble();

        System.out.print("Domates kaç kg? :");
        domatesKg = input.nextDouble();

        System.out.print("Muz kaç kg? :");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kg? :");
        patlicanKg = input.nextDouble();

        toplamTutar = (armutKg*armutKgTutar) + (elmaKg*elmaKgTutar) + (domatesKg*domatesKgTutar) + (muzKg*muzKgTutar) + (patlicanKg*patlicanKgTutar);
        System.out.println("Toplam Tutar: "+toplamTutar+" TL");
    }
}

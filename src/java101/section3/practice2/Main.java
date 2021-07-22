package java101.section3.practice2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        //ternary
        kdvOran = tutar > 1000 ? 0.08 : 0.18;

        kdvTutar = tutar*kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " +tutar);
        System.out.println("KDV Oranı : "+kdvOran);
        System.out.println("KDV Tutar :"+ kdvTutar);
        System.out.println("KDV'li Tutarı : "+kdvliTutar);
    }
}

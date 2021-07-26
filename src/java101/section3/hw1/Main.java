package java101.section3.hw1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,indeks;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz:");
        kilo = input.nextDouble();

        indeks = kilo / (boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+ indeks);
    }
}

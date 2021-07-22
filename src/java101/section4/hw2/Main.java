package java101.section4.hw2;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int year, kalan;
        String burc="";
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();

        kalan = year %12;

        switch (kalan) {
            case 0 -> burc = "Maymun";
            case 1 -> burc = "Horoz";
            case 2 -> burc = "Köpek";
            case 3 -> burc = "Domuz";
            case 4 -> burc = "Fare";
            case 5 -> burc = "Öküz";
            case 6 -> burc = "Kaplan";
            case 7 -> burc = "Tavşan";
            case 8 -> burc = "Ejderha";
            case 9 -> burc = "Yılan";
            case 10 -> burc = "At";
            case 11 -> burc = "Koyun";
            default -> System.out.print("Hata");
        }

        System.out.println("Burcunuz: " + burc);
    }
}

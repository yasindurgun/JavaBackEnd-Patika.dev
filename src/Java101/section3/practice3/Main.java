package Java101.section3.practice3;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int a,b;
        double c,cevre,alan,u;

        Scanner input = new Scanner(System.in);
        System.out.println("1. Kenarı Giriniz: ");
        a = input.nextInt();

        System.out.println("2. Kenarı Giriniz: ");
        b=input.nextInt();

        //c= (a*a) + (b*b);
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: "+c);

        //3.kenar olarak c yani hipotenüs sü alıyorum.
        cevre = a+b+c;
        u = cevre / 2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Alanı: "+alan);
    }
}

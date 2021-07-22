package java101.section3.practice5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int r,a;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.println("Dairenin merkez açısını giriniz:");
        a = input.nextInt();

        double daireDilimialan = (pi*(r*r)*a)/360;
        double alan = pi*r*r;
        double cevre = 2*pi*r;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Daire diliminin alanı: "+ daireDilimialan);
    }
}

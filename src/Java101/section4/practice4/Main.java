package Java101.section4.practice4;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if(heat < 5) {
            System.out.println("Kayak yapabilirsiniz");
        }
        else if(heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if(heat >= 10 && heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        }
        else if(heat >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}

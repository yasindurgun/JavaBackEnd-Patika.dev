package java101.section10.practice1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        System.out.println(number);

        int right = 0;
        while(right < 5) {
            System.out.println("Lütfen tahminizi giriniz: ");
            selected = input.nextInt();

            if(selected <0 || selected >99){
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                continue;
            }

            if(number == selected){
                System.out.println("Tebrikler, doğru tahmin!");
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz.");
                if(selected > number){
                    System.out.println("Daha küçük bir say giriniz.");
                } else {
                    System.out.println("Daha büyük bir sayı giriniz.");
                }
                wrong[right] = selected;
                right++;
                System.out.println("Kalan hakkınız: " + (5-right));
            }
        }
        if(!isWin){
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
    }
}

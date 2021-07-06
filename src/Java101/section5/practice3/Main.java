package Java101.section5.practice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = scan.nextInt();

        for(int i =1; i<=number; i++){
            if(i % 4 == 0){
                System.out.println(i+" 4 ün kuvvetidir.");
            }
            if(i % 5 == 0){
                System.out.println(i+ " 5 in kuvvetidir.");
            }
        }

    }
}

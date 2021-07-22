package java101.section5.practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n, total=0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Lütfen sayı giriniz: ");
            n = scan.nextInt();

            if(n % 2 == 0 && n % 4== 0 ){
                total+=n;
            }
        }while(n % 2 == 0);

        System.out.println("Toplam: "+total);
    }
}

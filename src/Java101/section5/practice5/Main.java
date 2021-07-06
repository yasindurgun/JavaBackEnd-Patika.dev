package Java101.section5.practice5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n,k,total=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı: ");
        n = scan.nextInt();

        System.out.print("Üs: ");
        k = scan.nextInt();

        for(int i =1; i<=k; i++){
            total*=n;
        }
        System.out.println(total);
    }
}

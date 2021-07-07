package Java101.section6.hw1;

import java.util.Scanner;

public class Main {
    static int recursiveUs(int taban, int us) {

        if(us == 0){
            return 1;
        }
        else if(taban == 1){
            return 1;
        }else{
            return taban * recursiveUs(taban, us-1);
        }

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int taban, us;
        System.out.print("Taban değerini giriniz: ");
        taban = scan.nextInt();

        System.out.print("Üs değerini giriniz: ");
        us = scan.nextInt();

        System.out.println(recursiveUs(taban,us));


    }
}

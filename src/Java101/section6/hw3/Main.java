package Java101.section6.hw3;

import java.util.Scanner;

public class Main {
    static int temp2 =-1;
    static int desen(int sayi){
        int temp1 = sayi;

        int temp3;
        if(temp1 > 0 && temp2<0){
            System.out.print(temp1+ " ");
            int baskı = desen(temp1-5);
            return baskı;
        }
         if(temp1<=0 && temp2<0){
            System.out.print(temp1+ " ");
            int baskı = desen(sayi+5);
            temp2 = baskı;
            return baskı;
        }
         /*
        else{
            System.out.print(temp1+ " ");
            int baskı = desen(sayi+5);
            temp3 = baskı;
            return baskı;
        }*/
    return 159;
    }
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.print("Bir sayı girin: ");
       int sayi = scan.nextInt();
       desen(sayi);
   }
}

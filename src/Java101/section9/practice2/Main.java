package Java101.section9.practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {56,34,1,8,101,-2,-33};
        int min = list[0];
        int max = list[0];
        int sayi;
        System.out.print("Bir sayı girin: ");
        sayi = scan.nextInt();
        Arrays.sort(list);

        for(int i : list){
            if (i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        int j=0;
        while(list[j]<sayi){
            //System.out.println(list[j]);
            j++;
        }
        j--;

        int k= list.length-1;
        while(sayi<list[k]){
         k--;
        }
        k++;
        System.out.println("Girilen sayıdan küçük en yakın sayı: "+list[j]);
        System.out.println("Girilen sayıdan üyük en yakın sayı: "+list[k]);
        System.out.println("Minimum Değer: "+min);
        System.out.println("Maksimum Değer: "+max);
    }
}

package Java101.section9.hw1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int index;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        index = scan.nextInt();
        int[] arr = new int[index];
        int i=0;
        while(i<index){
            System.out.print("Dizinin "+(i+1)+". elemanını giriniz: ");
            arr[i] = scan.nextInt();
            i++;
        }
        Arrays.sort(arr);
        System.out.print("Sıralama: ");
        for(int j=0; j<index; j++){
            System.out.print(arr[j]+ " ");
        }

    }

}

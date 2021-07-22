package java101.section5.practice10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n1, n2, minN, maxN, ebob=1,ekok=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        n1 = scan.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        n2 = scan.nextInt();

        if(n1 < n2){
            minN = n1;
            maxN = n2;
        }else {
            minN = n2;
            maxN = n1;
        }

        /*
        for(int i=1; i<=minN; i++) {
            if(minN % i == 0 && maxN % i == 0) {
                ebob = i;
            }
        } */

        for(int k = minN; k>=1; k--){
            if(minN % k == 0 && maxN % k == 0){
            ebob = k;
            break;
            }
        }
        System.out.println("Ebob: "+ebob);

        for(int i = 1; i<= (minN*maxN); i++){
            if(i % minN == 0 && i % maxN == 0){
                ekok = i;
                break;
            }
        }
        System.out.println("Ekok: "+ekok);
    }
}

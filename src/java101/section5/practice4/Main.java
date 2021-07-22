package java101.section5.practice4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n, r, nfac=1, rfac=1,n_rfac=1,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Kombinasyon hesabı C(n,r)");

        System.out.print("n i giriniz:");
        n = scan.nextInt();

        System.out.print("r yi giriniz: ");
        r = scan.nextInt();

        for(int i=1; i<=n; i++){
            nfac*=i;
        }
        for(int i=1; i<=r; i++){
            rfac*=i;
        }
        for(int i=1; i<=n-r; i++){
            n_rfac*=i;
        }
        result = nfac / (rfac * n_rfac);
        System.out.println(result);
    }
}

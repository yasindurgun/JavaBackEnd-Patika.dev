package java101.section5.hw5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n1=0,n2=1,n3,i,count;
        Scanner scan = new Scanner(System.in);
        System.out.print("Elaman sayısını giriniz: ");
        count = scan.nextInt();

        System.out.print(n1+" "+n2);

        for(i=2;i<=count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}

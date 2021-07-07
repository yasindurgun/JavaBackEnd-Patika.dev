package Java101.section6.hw2;

import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int i)
    {
        if (number <= 2)
            return (number == 2) ? true : false;
        if (number % i == 0)
            return false;
        if (i * i > number)
            return true;

        // Check for next divisor
        return isPrime(number, i + 1);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scan.nextInt();
        System.out.println(isPrime(number,2));
    }
}

package Java101.section4.practice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        if(mat<0 || mat>100) {
            average = (fizik+kimya+muzik+turkce) / 4.0;
        }
        else if(fizik <0 || fizik >100) {
            average = (mat+kimya+muzik+turkce) / 4.0;
        }
        else if(kimya <0 || kimya >100) {
            average = (mat+fizik+muzik+turkce) / 4.0;
        }
        else if(muzik <0 || muzik >100) {
            average = (mat+kimya+fizik+turkce) / 4.0;
        }
        else if(turkce <0 || turkce >100) {
            average = (mat+kimya+muzik+fizik) / 4.0;
        }
        else {
            average = (mat+fizik+kimya+muzik+turkce) / 5.0;
        }
        if(average <= 55) {
            System.out.println("Kaldınız");
            //System.out.println("Ortalamanız: " + average);
        }
        else {
            System.out.println("Geçtiniz");
            //System.out.println("Ortalamanız: " + average);
        }
        System.out.println("Ortalamanız: " + average);
    }
}

package java101.section5.practice9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner scan = new Scanner(System.in);

        while(right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = scan.nextLine();

            System.out.print("Şifreniz: ");
            password = scan.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz.");
               do {

                   System.out.println("1- Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                   System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                   select = scan.nextInt();

                   switch (select) {
                       case 1:
                           System.out.print("Para Miktarı: ");
                           int price = scan.nextInt();
                           balance+= price;
                           break;
                       case 2:
                           System.out.print("Para Miktarı: ");
                           int price2 = scan.nextInt();
                           if(price2 > balance){
                               System.out.println("Bakiye yetersiz");
                           }else {
                               balance-= price2;
                           }
                           break;
                       case 3:
                           System.out.println("Bakiyeniz: "+balance);
                           break;
                   }
                    /*
                   if(select == 1) {
                       System.out.print("Para Miktarı: ");
                       int price = scan.nextInt();
                       balance+= price;
                   }
                   else if(select == 2){
                       System.out.print("Para Miktarı: ");
                       int price = scan.nextInt();
                       if(price > balance){
                           System.out.println("Bakiye yetersiz");
                       }else {
                           balance-= price;
                       }
                   }
                   else if(select == 3) {
                       System.out.println("Bakiyeniz: "+balance);
                   }
                   */
               }while(select != 4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar Deneyiniz");
                if(right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız: "+right);
                }
            }
        }
    }
}

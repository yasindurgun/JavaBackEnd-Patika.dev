package java101.section4.practice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password, yOrn, newPassword;

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Sisteme giriş yaptınız");
        }
        else {
            System.out.println("Hatalı kullanıcı adı veya şifre");
            System.out.println("Şifrenizi sıfırlamak ister misiniz(y/n)");
            yOrn = input.nextLine();

            //System.out.println(yOrn);

            if(yOrn.equals("y") || yOrn.equals("Y")) {
                System.out.print("Lütfen yeni şifrenizi girin: ");
                newPassword = input.nextLine();

                if(newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı lütfen yeni şifre belirleyiniz..");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
            }

        }
    }
}

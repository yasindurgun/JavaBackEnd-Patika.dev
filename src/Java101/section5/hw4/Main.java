package Java101.section5.hw4;

public class Main {
    public static void main(String[] args){

        for(int sayi=2;sayi<=100;sayi++)
        {
            boolean kontrol = false;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = true;
                    break;
                }
            }
            if(kontrol==false)
            {
                System.out.print(sayi+" ");
            }
        }
    }
}


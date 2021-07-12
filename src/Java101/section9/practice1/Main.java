package Java101.section9.practice1;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double avarage = 0.0;
        double sum = 0;
        double harmonik = 0.0;
        double avarageH = 0.0;
        for(int i = 0; i<list.length; i++){
            sum += list[i];
            harmonik += 1/list[i];
        }

        avarage = sum / list.length;
        avarageH = list.length / harmonik;
        System.out.println("Ortalama: " + avarage);
        System.out.println("Harmonik ortalama: "+ avarageH);
    }
}

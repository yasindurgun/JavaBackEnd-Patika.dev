package java101.section9.hw2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,20,20,10,10,20,5,20};
        int sayac;
        for(int i =0; i<arr.length; i++){
            sayac = 0;
            for(int j=0 ; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    sayac++;
                }
            }
                System.out.println(arr[i] + " sayısı " + sayac + " kere tekrar edildi.");
        }
    }
}

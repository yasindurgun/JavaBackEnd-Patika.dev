package java101.section9.hw3;

public class Main {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3}, {4,5,6}, {7,8,9}};
        int satır = matris.length;
        int sutun = matris[0].length;

        for(int i=0; i<sutun; i++){
            for(int j=0; j<satır; j++){
                System.out.print(matris[j][i]+ " ");
            }
            System.out.println();
        }
    }
}

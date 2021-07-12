package Java101.section9.practice3;

public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];
        for(int i = 0; i< letter.length; i++){
            for(int j = 0; j< letter[i].length; j++){
                if(i==0 || i==2){
                    letter[i][j] = " * ";
                }
                else if(j==0 || j==3){
                    letter[i][j] = " * ";
                }
                else {
                    letter[i][j] = "   ";
                }
            }
        }
        for(String[] row: letter){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }

        System.out.println("------------");

        String[][] b = new String[7][4];
        for(int i=0; i<b.length; i++){
            for(int j=0; j<b[i].length; j++){
                if(i==0 || i==3 || i==6){
                    b[i][j] = " * ";
                }
                else if(j==0 || j==3){
                    b[i][j] = " * ";
                }else{
                    b[i][j] = "   ";
                }
            }
        }

        for(String[] row: b){
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

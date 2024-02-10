package matrix;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[][] chessTable=new String[10][10];
        for (int i = 0; i < chessTable.length ; i++) {
            for (int j = 0; j < chessTable[i].length; j++) {
                chessTable[i][j]=" ";
                if(i>0 && j>0&& (j%2==0 &&i%2!=0||j%2!=0 &&i%2==0 )){
                    chessTable[i][j]="#";
                }
                if(i==0 || i==chessTable.length-1){
                    if(j>0 && j< chessTable[i].length-1){
                        if(j==1){
                            chessTable[i][j]="A";
                        }
                        else{
                            chessTable[i][j]= ""+(char)(chessTable[i][j-1].hashCode()+1);
                        }
                    }
                }
                if((i>0 && i< chessTable.length-1)&& (j==0 || j== chessTable[i].length-1)){
                    chessTable[i][j]=""+(i);
                }
            }
        }
        for (int i = 0; i < chessTable.length ; i++) {
            System.out.println(Arrays.toString(chessTable[i]));
        }
    }
}

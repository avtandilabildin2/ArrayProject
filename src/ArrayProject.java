import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran = new Random();
        int[] rastoianie=new int[3];
        for (int i = 0; i <rastoianie.length ; i++) {
            rastoianie[i]=1+ ran.nextInt(6);

            if(i==1 && rastoianie[i]==rastoianie[i-1]){
                while(rastoianie[i]==rastoianie[i-1]){
                rastoianie[i]=1+ran.nextInt(6);
                }
            }
            if(i==2 && (rastoianie[i]==rastoianie[i-1] || rastoianie[i]==rastoianie[i-2]) ){
                while(rastoianie[i]==rastoianie[i-1]|| rastoianie[i]==rastoianie[i-2]){
                rastoianie[i]=1+ ran.nextInt(6);
                }
            }
        }
        int count=0;
        int popytka=0;
        int[] vvody=new int[3];

        while(popytka<5){
            for (int i = 0; i <3 ; i++) {
                vvody[i]=sc.nextInt();
                if(i==1 &&vvody[i]==vvody[i-1]){
                    while(vvody[i]==vvody[i-1]){
                        System.out.print("You shouldn't repeat numbers,print second number again: ");
                        vvody[i]=sc.nextInt();
                    }
                }
                if(i==2 && ( vvody[i]==vvody[i-1] || vvody[i]==vvody[i-2]) ){
                    while(vvody[i]==vvody[i-1] || vvody[i]==vvody[i-2]){
                        System.out.print("You shouldn't repeat numbers,print  third number again: ");
                        vvody[i]=sc.nextInt();
                    }
                }
            }
            for (int i = 0; i <vvody.length ; i++) {
                for (int j = 0; j < rastoianie.length; j++) {
                    if(rastoianie[i]==vvody[j]){
                        count++;
                    }
                }
            }
            if(count==3){
                System.out.println("All boxes were found!");
                break;
            }
            popytka++;
            System.out.println(count);
            count=0;
        }
    }
}

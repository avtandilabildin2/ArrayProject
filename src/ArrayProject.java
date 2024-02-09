import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//vyzyvaiu scanner chtoby ispolzovat
        Random ran = new Random();//vyzyvaiu random chtoby ispolzovat
        int[] rastoianie=new int[3];//zadaiu razmer massiva ,randomnoe rastoianie
        for (int i = 0; i <rastoianie.length ; i++) {//vyzyvaiu tsikl dlya perebora massiva
            rastoianie[i]=1+ ran.nextInt(6);//zadaiu randomnoe chislo

            if(i==1 && rastoianie[i]==rastoianie[i-1]){//esli vtoroi element raven pervomu,to nado zadavat ego snova
                while(rastoianie[i]==rastoianie[i-1]){//do teh por poka vtoroi element ne ravnaietsa pervomu
                rastoianie[i]=1+ran.nextInt(6);//zadaiu vtoroe chislo snova
                }
            }
            if(i==2 && (rastoianie[i]==rastoianie[i-1] || rastoianie[i]==rastoianie[i-2]) ){//esli tretiy element raven pervomu ili vtoromu,to nado
                while(rastoianie[i]==rastoianie[i-1]|| rastoianie[i]==rastoianie[i-2]){//zadavat snova  do teh por poka tretiy razlichen ot 1go i 2go
                rastoianie[i]=1+ ran.nextInt(6);//elementa,randomnoe chislo ot 1 do 6
                }
            }
        }
        int count=0;//schetchik pravilnyh otvetov
        int popytka=0;//schetchik popytok
        int[] vvody=new int[3];//razmer massiva vvodnyh chisel

        while(popytka<5){//daetsya 5 popytok
            for (int i = 0; i <3 ; i++) {//perebor massiva
                vvody[i]=sc.nextInt();//vvod chisla
                if(i==1 &&vvody[i]==vvody[i-1]){//esli vtoroe chislo raven pervomu to nado zadavat snova
                    while(vvody[i]==vvody[i-1]){//do teh por poka 2 element ne raven pervomu
                        System.out.print("You shouldn't repeat numbers,print second number again: ");
                        vvody[i]=sc.nextInt();//vvodim vtoroi element snova
                    }
                }
                if(i==2 && ( vvody[i]==vvody[i-1] || vvody[i]==vvody[i-2]) ){//esli 3tiy element raven pervomu ili vtoromu to nado zadavat snova
                    while(vvody[i]==vvody[i-1] || vvody[i]==vvody[i-2]){//do teh por poka 3tiy element ne raven i pervomu i vtoromu
                        System.out.print("You shouldn't repeat numbers,print  third number again: ");
                        vvody[i]=sc.nextInt();//vvodim 3tiy element snova
                    }
                }
            }
            for (int i = 0; i <vvody.length ; i++) {//perebor vvodov
                for (int j = 0; j < rastoianie.length; j++) {//perebor randomnyh rastoianiy
                    if(rastoianie[i]==vvody[j]){//esli randomnoe chislo raven odnomu iz vvodov to
                        count++;//to schetchik pravilnyh otvetov eto schitaet
                    }
                }
            }
            if(count==3){//esli vse sovpadaiut
                System.out.println("All boxes were found!");//to vyvesti vse korobki nashlis
                break;//programma zavershaet rabotu
            }
            popytka++;//schetchik popytok do piati
            System.out.println(count);//vyvod pravilnyh otvetov
            count=0;//schetchik raven nuliu tak kak nachinaetsya sleduishaia popytka i snova schitat pravilnye otvety
        }
    }
}

import java.util.Scanner;
public class İndeks {
    public static void main (String [] args){
        double kilo,boy,indeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kilonuzu girin:");
        kilo = input.nextDouble();
        System.out.print("Lütfen boyunuzu (metre cinsinden) girin:");
        boy = input.nextDouble();
        indeks = kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz:" + indeks);


    }

}
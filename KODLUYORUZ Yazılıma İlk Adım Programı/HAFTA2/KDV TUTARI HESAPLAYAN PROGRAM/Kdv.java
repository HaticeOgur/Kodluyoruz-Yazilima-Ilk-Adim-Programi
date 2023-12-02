import java.util.Scanner;
public class Kdv {
    public static void main (String[] args){
        double fiyat;
        Scanner input = new Scanner (System.in);
        System.out.print ("Ürünün fiyatını giriniz:");
        fiyat = input.nextDouble();
        double kdv = (fiyat/100)*18;
        System.out.println("KDV Tutarı:" + kdv);
        double kdvliFiyat= (fiyat+kdv);
        System.out.println("Ürünün KDV'li fiyatı:" + kdvliFiyat);

    }
}
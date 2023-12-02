import java.util.Scanner;

public class Kıyas {
    public static void main(String[] args) {
        int i = 1;
        int sayi;
        int enBuyuk;
        int enKucuk;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        sayi = input.nextInt();

        System.out.print(i + ". Sayıyı girin: ");
        int girilenSayi = input.nextInt();

        enBuyuk = girilenSayi;
        enKucuk = girilenSayi;

        i++;

        while (i <= sayi) {
            System.out.print(i + ". Sayıyı girin: ");
            girilenSayi = input.nextInt();

            if (girilenSayi > enBuyuk) {
                enBuyuk = girilenSayi;
            }

            if (girilenSayi < enKucuk) {
                enKucuk = girilenSayi;
            }

            i++;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);

        input.close();
    }
}

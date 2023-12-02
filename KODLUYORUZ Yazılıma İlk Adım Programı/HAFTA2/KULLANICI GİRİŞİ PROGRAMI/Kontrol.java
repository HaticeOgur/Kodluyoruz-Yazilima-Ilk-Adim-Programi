import java.util.Scanner;
public class Kontrol{
    public static void main (String[]args){
    String kullaniciAdi,sifre;
    Scanner input = new Scanner(System.in);
    System.out.print ("Kullanıcı Adınızı girin:");
    kullaniciAdi= input.nextLine();
    System.out.print ("Şifrenizi girin:");
    sifre= input.nextLine();
    if (kullaniciAdi.equals("Hatice") && sifre.equals("123")){
        System.out.println("Sisteme hoş geldiniz");

    }else{
        System.out.println("Hatalı giriş yaptınız.");
    }

    }
    

}
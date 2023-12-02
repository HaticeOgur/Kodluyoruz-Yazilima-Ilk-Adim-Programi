//Döngüleri kullanarak ATM
import java.util.Scanner;
public class Atm{
    public static void main (String[]args){
        String kullaniciAdi,sifre;
        Scanner input = new Scanner(System.in);
        int deneme=3;
        int bakiye=3000;
        int secim;
        while (deneme>0){
            System.out.print("Kullanıcı adınızı girin:");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifrenizi girin:");
            sifre = input.nextLine();
            if(kullaniciAdi.equals("Hatice")&& sifre.equals("12345")){
                System.out.println("ATM'YE HOŞ GELDİNİZ.");
                do{
                System.out.print("1-Para yatırma\n"+
                "2-Para Çekme\n"+
                "3-Bakiye Sorgulama\n"+
                "4-Çıkış yap\n");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                secim=input.nextInt();
                if(secim==1){
                    System.out.println("Yatırmak istediğiniz tutar:");
                    int tutar=input.nextInt();
                    bakiye+=tutar;
                }else if(secim==2){
                    System.out.println("Çekmek istediğiniz tutar:");
                    int tutar=input.nextInt();
                    if(tutar>bakiye){
                        System.out.println("Bakiye yetersiz.");
                    }else{
                        bakiye-=tutar;
                    }

                }else if(secim==3){
                    System.out.println("Bakiyeniz:" + bakiye);
                }
                }while(secim!=4);
                System.out.println("Çıkış yaptınız.");
                break;

            }else{
                deneme --;
                System.out.println("Kullanıcı adınızı veya şifrenizi hatalı girdiniz.Tekrar deneyiniz.");
                System.out.println("Kalan hakkınız :"+ deneme );
                if(deneme==0){
                    System.out.println("Hesabınız bloke olmuştur. Bankanızla iletişime geçiniz.");
                }
            }



        }

    }
}
import java.util.Scanner;
public class Tarife{
    public static void main (String[]args){
        int yas,yolculukTipi;
        double mesafe,tutar,yasİndirimi,tipİndirim,indirimliTutar,toplamTutar;
        Scanner input = new Scanner (System.in);
        System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz:");
        mesafe= input.nextDouble();
        System.out.print("Yolculuk tipinizi (1:Tek yön, 2: Gidiş-dönüş) girin:");
            yolculukTipi= input.nextInt();
        if (mesafe > 0 && (yolculukTipi > 0 && yolculukTipi < 3)){
            System.out.print("Yaşınızı girin:");
            yas= input.nextInt();
            tutar = mesafe * 0.10;
            indirimliTutar= tutar;
            switch(yolculukTipi){
                case 1:
                if (yas < 12) {
                    yasİndirimi= tutar * 0.5;
                    indirimliTutar= tutar-yasİndirimi;
                } else if (yas >= 12 && yas <= 24) {
                    yasİndirimi= tutar * 0.1;
                    indirimliTutar= tutar-yasİndirimi;
                } else if (yas >= 65) {
                    yasİndirimi= tutar * 0.3;
                    indirimliTutar= tutar-yasİndirimi;
                }else {
                    indirimliTutar = tutar;
                }
                System.out.println("Ödemeniz gereken toplam tutar: " + indirimliTutar + " TL");
            
                break;
                case 2:
                 if (yas < 12) {
                    yasİndirimi= tutar * 0.5;
                    indirimliTutar= tutar-yasİndirimi;
                    

                } else if (yas >= 12 && yas <= 24) {
                    yasİndirimi= tutar * 0.1;
                    indirimliTutar= tutar-yasİndirimi;
                    
                } else if (yas >= 65) {
                    yasİndirimi= tutar * 0.3;
                    indirimliTutar= tutar-yasİndirimi;
                    
                }else {
                    indirimliTutar = tutar;
                }
                tipİndirim = indirimliTutar * 0.2;
                toplamTutar = (indirimliTutar - tipİndirim) * 2;
                System.out.println("Ödemeniz gereken toplam tutar: " + toplamTutar + " TL");
                break;

            }
        }else{
            System.out.print("Hatalı veri girdiniz:");
        }

    }
}
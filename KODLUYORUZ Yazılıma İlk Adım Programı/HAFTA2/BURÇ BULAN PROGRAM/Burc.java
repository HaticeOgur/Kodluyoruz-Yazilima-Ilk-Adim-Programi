import java.util.Scanner;
public class Burc{
    public static void main (String[]args){
        int ay,gun;
        Scanner input= new Scanner(System.in);
        System.out.println("Sırasıyla doğdunuz ay ve günü giriniz:");
        ay= input.nextInt();
        gun= input.nextInt();
        switch (ay) {
            case 1:
            if ((gun>=1)&&(gun<=31)){
                if(gun<22){
                    System.out.print("Burcunuz:OĞLAK");
                }else{
                    System.out.print("Burcunuz:KOVA");
                }
            }break;
            case 2:
             if ((gun>=1)&&(gun<=31)){
                if(gun<20){
                    System.out.print("Burcunuz:KOVA");
                }else{
                    System.out.print("Burcunuz:BALIK");
                }
            }break;
            case 3:
             if ((gun>=1)&&(gun<=31)){
                if(gun<21){
                    System.out.print("Burcunuz:BALIK");
                }else{
                    System.out.print("Burcunuz:KOÇ");
                }
            }break;
             case 4:
             if ((gun>=1)&&(gun<=31)){
                if(gun<21){
                    System.out.print("Burcunuz:KOÇ");
                }else{
                    System.out.print("Burcunuz:BOĞA");
                }
            }break;
            case 5:
             if ((gun>=1)&&(gun<=31)){
                if(gun<22){
                    System.out.print("Burcunuz:BOĞA");
                }else{
                    System.out.print("Burcunuz:İKİZLER");
                }
            }break;
            case 6:
             if ((gun>=1)&&(gun<=31)){
                if(gun<23){
                    System.out.print("Burcunuz:İKİZLER");
                }else{
                    System.out.print("Burcunuz:YENGEÇ");
                }
            }break;
            case 7:
             if ((gun>=1)&&(gun<=31)){
                if(gun<23){
                    System.out.print("Burcunuz:YENGEÇ");
                }else{
                    System.out.print("Burcunuz:ASLAN");
                }
            }break;
            case 8:
             if ((gun>=1)&&(gun<=31)){
                if(gun<23){
                    System.out.print("Burcunuz:ASLAN");
                }else{
                    System.out.print("Burcunuz:BAŞAK");
                }
            }break;
              case 9:
             if ((gun>=1)&&(gun<=31)){
                if(gun<23){
                    System.out.print("Burcunuz:BAŞAK");
                }else{
                    System.out.print("Burcunuz:TERAZİ");
                }
            }break;
             case 10:
             if ((gun>=1)&&(gun<=31)){
                if(gun<22){
                    System.out.print("Burcunuz:TERAZİ");
                }else{
                    System.out.print("Burcunuz:AKREP");
                }
            }break;
             case 11:
             if ((gun>=1)&&(gun<=31)){
                if(gun<22){
                    System.out.print("Burcunuz:AKREP");
                }else{
                    System.out.print("Burcunuz:YAY");
                }
            }break;
              case 12:
             if ((gun>=1)&&(gun<=31)){
                if(gun<22){
                    System.out.print("Burcunuz:YAY");
                }else{
                    System.out.print("Burcunuz:OĞLAK");
                }
            }break;
            default:
            System.out.print("Hatalı bir ay girdiniz.");

        }
    }
}

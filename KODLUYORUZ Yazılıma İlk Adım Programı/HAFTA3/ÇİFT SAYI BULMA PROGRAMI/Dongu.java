import java.util.Scanner;
public class Dongu{
    public static void main(String[]args){
        int i=1,sayi;
        Scanner input= new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        sayi=input.nextInt();
        for(i=1;i<sayi;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindromik sayıdır.");
        } else {
            System.out.println(sayi + " bir palindromik sayı değildir.");
        }

        input.close();
    }

   
    static boolean isPalindrom(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int kalan = num % 10;
            reversedNum = reversedNum * 10 + kalan;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}


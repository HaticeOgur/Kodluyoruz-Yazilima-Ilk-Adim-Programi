import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " asal bir sayı değildir.");
        } else {
            if (isAsal(sayi, sayi / 2)) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }

        input.close();
    }

    static boolean isAsal(int num, int i) {
        if (i == 1) {
            return true;
        } else {
            if (num % i == 0) {
                return false;
            } else {
                return isAsal(num, i - 1);
            }
        }
    }
}

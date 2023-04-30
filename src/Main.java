// Girilen sayının basamak değerlerini toplayan program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, k;  // basamak değerleri -> k
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        num = input.nextInt();

        while (num != 0) {
            k = num % 10;
            sum = sum + k;
            num /= 10;
        }
        System.out.println(sum);
    }
}
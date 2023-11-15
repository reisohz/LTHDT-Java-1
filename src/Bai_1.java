/**
 * @(#)Bai_tap.java
 *
 * Bai_tap application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
import java.util.Scanner;
public class Bai_1 {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = ip.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tong cua day so S = 1 + 2 + 3 + ... + " + n + " la: " + sum);
    }
}

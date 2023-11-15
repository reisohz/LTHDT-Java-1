/**
 * @(#)Bai_3.java
 *
 * Bai_3 application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
 
import java.util.Scanner;
import java.util.Locale;
public class Bai_3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nhap so thuc a: ");
        double a = ip.nextDouble();
        System.out.print("Nhap so thuc b: ");
        double b = ip.nextDouble();
        System.out.print("Nhap so thuc c: ");
        double c = ip.nextDouble();

        if (laTamGiac(a, b, c)) {
            System.out.println("Ba so a, b, c co the lap thanh mot tam giac.");
            System.out.println("Loai tam giac: " + loaiTamGiac(a, b, c));
        } else {
            System.out.println("Ba so a, b, c khong the lap thanh tam giac.");
        }

 
    }

    public static boolean laTamGiac(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String loaiTamGiac(double a, double b, double c) {
        if (a == b && b == c) {
            return "Tam giac deu";
        } else if (a == b || b == c || a == c) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return "Tam giac vuong can";
            } else {
                return "Tam giac can";
            }
        } else {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return "Tam giac vuong";
            } else {
                return "Tam giac thuong";
            }
        }
    }
}

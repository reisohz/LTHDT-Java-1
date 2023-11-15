/**
 * @(#)Ptbac2.java
 *
 * Ptbac2 application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
 
import java.util.Scanner;

public class Ptbac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap he so b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap he so c: ");
        double c = scanner.nextDouble();

        delta(a, b, c);

        scanner.close();
    }

    public static void delta(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }
    }
}

/**
 * @(#)timUocChung.java
 *
 * timUocChung application
 *
 * @author Tram Khoi Nguyen
 * @version 1.00 2023/11/15
 */
 

 
import java.util.Scanner;

public class timUocChung {
   
    static int uocChungLonNhat(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void kiemTraSoNguyenTo(int number) {
        if (number <= 1) {
            System.out.println(number + " khong phai la so nguyen to.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " la so nguyen to.");
        } else {
            System.out.println(number + " khong phai la so nguyen to.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhap so thu nhat: ");
        int soThuNhat = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int soThuHai = scanner.nextInt();

       
        int ucln = uocChungLonNhat(soThuNhat, soThuHai);
        System.out.println("Uoc chung lon nhat cua " + soThuNhat + " va " + soThuHai + " la: " + ucln);

   System.out.println("Nhap so can kiem tra la so nguyen to: ");
        int number = scanner.nextInt();
        kiemTraSoNguyenTo(number);
    }
}



import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhap so nguyen duong thu nhat: ");
        int so1 = ip.nextInt();
        System.out.print("Nhap so nguyen duong thu hai: ");
        int so2 = ip.nextInt();
        System.out.print("Nhap so nguyen duong thu ba: ");
        int so3 = ip.nextInt();
        System.out.print("Nhap so nguyen duong thu tu: ");
        int so4 = ip.nextInt();

        int max = timMax(so1, so2, so3, so4);

        System.out.println("So lon nhat trong 4 so la: " + max);

    }

    public static int timMax(int so1, int so2, int so3, int so4) {
        int max = so1;

        if (so2 > max) {
            max = so2;
        }

        if (so3 > max) {
            max = so3;
        }

        if (so4 > max) {
            max = so4;
        }

        return max;
    }
}
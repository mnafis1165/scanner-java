import java.util.Scanner;

public class Input03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double bil1,bil2,hasil;

        System.out.print("Bilangan 1: ");
        bil1 = input.nextDouble();

        System.out.print("Bilangan 2: ");
        bil2 = input.nextDouble();

        hasil = bil1 / bil2;

        System.out.println();
        System.out.println("Hasil pembagian: " + hasil);
    }
}

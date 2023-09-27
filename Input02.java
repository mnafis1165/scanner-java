import java.util.Scanner;


public class Input02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM : ");
        String NIM = input.nextLine();

        System.out.println();
        System.out.println("Hello " + nama + " (" + NIM + ")");

        
    }
}

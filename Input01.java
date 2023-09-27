import java.util.Scanner;

public class Input01 {
    public static void main(String[] args) {

        //membuat objek input
        Scanner input = new Scanner(System.in);
        System.out.print("Nama: ");

        //menerima input kemudian disimpan dalam variable
        String nama = input.nextLine();
        System.out.println("Hello " + nama);

        

    }
}

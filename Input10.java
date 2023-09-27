import java.util.Scanner;

public class Input10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int bil;

        System.out.print("Bilangan: ");
        bil = input.nextInt();

        if(bil % 2 == 0) {
            System.out.println(bil+" adalah bilangan genap");
        }
        else{
            System.out.println(bil+" adalah bilangan ganjil");
        }
    }
}

import java.util.Scanner;

public class Input06 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai;
        

        System.out.println("Masukkan Nilai : ");
        nilai = input.nextInt();

        if( nilai <= 100 && nilai >= 80) {
            System.out.println("A");
        }
        else if( nilai < 80  && nilai >= 60) {
            System.out.println("B");
        }
        else if( nilai < 60 && nilai >= 50) {
            System.out.println("C");
        }
        else if( nilai < 50 && nilai >= 40) {
            System.out.println("D");
        }
        else if( nilai < 40 && nilai >= 0) {
            System.out.println("E");
        }


    }
}

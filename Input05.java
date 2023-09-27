import java.util.Scanner;

public class Input05 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int nilai;

    System.out.println("Masukkan Nilai : ");
    nilai = input.nextInt();

    if(nilai <= 100 && nilai >= 60){
        System.out.println("LULUS");
    }
        else if(nilai > 100){
            System.out.println("NILAI TIDAK VALID");
         }
    
    else {
        System.out.println("TIDAK LULUS");
    }
 }
}

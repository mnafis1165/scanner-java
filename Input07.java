import java.util.Scanner;

public class Input07 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nilai;
        char index = '?';

        System.out.println("Masukkan Nilai : ");
        nilai = input.nextInt();

        if( nilai <= 100 && nilai >= 80) {
            index='A';
        }
        else if( nilai < 80  && nilai >= 60) {
            index='B';
        }
        else if( nilai < 60 && nilai >= 50) {
            index='C';
        }
        else if( nilai < 50 && nilai >= 40) {
            index='D';
        }
        else if( nilai < 40 && nilai >= 0) {
            index='E';
        }
        else if( nilai > 100 && nilai < 0) {
            index='?';
        }


        if(index == 'A' || index == 'B' || index == 'C'){
            System.out.println(index);
            System.out.println("LULUS");
        }
        else if(index == '?' ) {
            System.out.println(index);
            System.out.println("NILAI TIDAK VALID");
        }
        else {
            System.out.println(index);
            System.out.println("TIDAK LULUS");
        }





    }

}
    


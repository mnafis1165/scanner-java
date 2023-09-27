import java.util.Scanner;

public class Input08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;

        System.out.print("Masukkan Angka 1-7 : ");
        nilai = input.nextInt();

        switch(nilai) {
            case 1 :
                System.out.println("Senin");
                break;
            case 2 : 
                System.out.println("Selasa");
                break;
            case 3 : 
                System.out.println("Rabu");
                break;
            case 4 : 
                System.out.println("Kamis");
                break;
            case 5 : 
                System.out.println("Jum'at");
                break;
            case 6 : 
                System.out.println("Sabtu");
                break;
            case 7 : 
                System.out.println("Minggu");
                break;
        }
    }
}

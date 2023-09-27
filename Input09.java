import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Input09 {
    public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    
    int bilangan;
    System.out.println("Masukkan angka");bilangan=input.nextInt();
    int penentu_Genap = bilangan % 2;
    
   
    String kondisi = penentu_Genap==0? "Genap" : "Ganjil";
    
    //output
    System.out.println();
    System.err.println("Merupakan bilangan "+ kondisi);
    }
    
}
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Input04 {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner (System.in);

        System.out.print("Username: ");
        username = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if(username.equals("root") && password.equals("rahasia")) {
            System.out.println("Login Berhasil");
        }
        else {
            System.out.println("Login Gagal");
        }

        
    }
    
}


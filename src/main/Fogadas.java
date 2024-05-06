package main;

import java.util.Scanner;
/**
 *
 * @author zsigm
 */
public class Fogadas {
    char fogadott;
    
    public void fogad() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Fogadjon valamelyik csigara (P/Z/K) :");
        String beolvas = scanner.nextLine();
        
        fogadott = beolvas.charAt(0);
    }
    
    public void nyert(char nyero) {
        if(nyero == 'p') {
            if(fogadott == 'p' || fogadott == 'P'){
                System.out.println("=============   Nyert!   =============" );
            }
            else {
                System.out.println("============= Veszitett! =============" );
            }
        }
        else if(nyero == 'z') {
            if(fogadott == 'z' || fogadott == 'Z'){
                System.out.println("=============   Nyert!   =============" );
            }
            else {
                System.out.println("============= Veszitett! =============" );
            }
        }
        else if(nyero == 'k') {
            if(fogadott == 'k' || fogadott == 'K'){
                System.out.println("=============   Nyert!   =============" );
            }
            else {
                System.out.println("============= Veszitett! =============" );
            }
        }
        else {
            System.out.println("============= Dontetlen! =============" );
        }
    }
}

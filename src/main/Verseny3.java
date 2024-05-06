package main;

import java.util.Random;

/**
 *
 * @author zsigm
 */
public class Verseny3 {
    private Csiga piros = new Csiga();
    private Csiga zold = new Csiga();
    private Csiga kek = new Csiga();
    
    public char versenyezz() {
        return versenyezz(5);
    }

    public char versenyezz(int korok) {
        for (int i = 1; i <= korok; i++) {
            System.out.println("----------- " + i + ". kor -----------");
            
            piros.lep();
            zold.lep();
            kek.lep();
            
            //gyorsito1();
            gyorsito2();
            
            System.out.println("Piros: " + piros.utolsoLepes());
            System.out.println(" Zold: " + zold.utolsoLepes());
            System.out.println("  Kek: " + kek.utolsoLepes());  
        }
        
        System.out.println("------- vegso eredmeny -------");
        System.out.println("Piros: " + piros.pozicio());
        System.out.println(" Zold: " + zold.pozicio());
        System.out.println("  Kek: " + kek.pozicio());
        
        if(piros.pozicio() > zold.pozicio() && piros.pozicio() > kek.pozicio()) //piros gyoz
            return 'p';
        else if(zold.pozicio() > piros.pozicio() && zold.pozicio() > kek.pozicio()) //zold gyoz
            return 'z';
        else if(kek.pozicio() > piros.pozicio() && kek.pozicio() > zold.pozicio()) //kek gyoz
            return 'k';
        else return 'e'; //egyenloseg

    }
    
    public void gyorsito1() {
        
        //20% eselye van minden csiganak
        
        Random random = new Random();
        int esely = random.nextInt(10);
        if(esely < 2) {
            piros.gyorsit();
        }
        else if(esely < 4) {
            zold.gyorsit();
        }
        else if(esely < 6) {
            zold.gyorsit();
        }
    }
    
    public void gyorsito2() {
        
        //20% esellyel valasztunk random csigat
        
        Random random = new Random();
        int esely = random.nextInt(10);
        if(esely < 2) {
            int esely2 = random.nextInt(3);
            if(esely2 == 0) {
                piros.gyorsit();
            }
            else if(esely2 == 1) {
                zold.gyorsit();
            }
            else if(esely2 == 2) {
                zold.gyorsit();
            }
        }
    }
    
}

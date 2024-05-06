package main;

/**
 *
 * @author zsigm
 */
public class EloalkCsigas {

    public static void main(String[] args) {
        Verseny3 v = new Verseny3();
        Fogadas fog = new Fogadas();
        fog.fogad();
        fog.nyert(v.versenyezz());
        
    }
    
}

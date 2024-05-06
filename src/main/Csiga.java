package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author zsigm
 */
public class Csiga {
    private final List<Integer> lepesek;
    private Integer pozicio = 0;
    
    public Csiga() {
        lepesek = new ArrayList<>();
    }
    
    public void Lep() {
        Random random = new Random();
        int randomSzam = random.nextInt(4);
        lepesek.add(randomSzam);
        pozicio += randomSzam;
    }
    
    public void Gyorsito() {
        int utolsoIndex = lepesek.size() - 1;
        int utolsoLepes = lepesek.get(utolsoIndex);
        int utolsoLepesGyorsitoval = utolsoLepes * 2;
        lepesek.set(utolsoIndex, utolsoLepesGyorsitoval);
        pozicio += utolsoLepes;
    }
    
    public Integer Pozicio() {
        return pozicio;
    }
    
    public Integer UtolsoLepes() {
        return lepesek.get(lepesek.size() - 1);
    }
}

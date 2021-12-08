package memo.carte;

import java.util.ArrayList;
import java.util.List;


public class PaquetCartes {

    private static final int NB_CARTES = 20;
    private List<Carte> cartes = new ArrayList<Carte>();
    
    public PaquetCartes() {
        super();
        Carte c = null;
        for(int motif = 1; motif <= PaquetCartes.NB_CARTES/2; motif++) {
            c = new Carte(Symbole.DOS, motif, false);
            cartes.add(c);
            c = new Carte(Symbole.DOS, motif, false);
            cartes.add(c);
            System.out.println(c);
        }
    }
    
}

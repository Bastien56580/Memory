package memo.carte;

public enum Symbole {
	SOLEIL("sole"), CHAT("chat"), MAISON("mais"), OURS("ours"), CHIEN("dogo"), ETOILE("etoil"), NEIGE("neij"), GRAINE("grai"), LAC("lakk"),
	ARBRE("arbe"), DOS("daux");
	 
	    
	    @Override
	    public String toString() {
	        String texte="";
	        switch (this) {
	        case ARBRE: texte="arbe"; break;
	        case SOLEIL: texte="sole"; break;
	        case ETOILE: texte="etoil"; break;
	        case CHAT: texte="chat"; break;
	        case MAISON: texte="mais"; break;
	        case DOS: texte="daux"; break;
	        case OURS: texte="ours"; break;
	        case NEIGE: texte="neij"; break;
	        case GRAINE: texte="grain"; break;
	        case LAC: texte="lakk"; break;
	        case CHIEN: texte="dogo"; break;
	        default:
	            texte= " VIDE ";
	            break;
	        }
	        return texte;
	    
	    }

	    
	    private static final Symbole[] LES_SYMBOLES = Symbole.values();
	    public static final int NBR_SYMBOLES = LES_SYMBOLES.length;
	    
	    private String texte;
	    
	    private Symbole(String texte) {
	    	this.texte = texte;
	    }
	    
	    public static Symbole get1(int motif) {
	    	return LES_SYMBOLES[motif];
	    }
}
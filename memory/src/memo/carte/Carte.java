package memo.carte;

public class Carte {

	public static final int NBR_MOTIFS=10;
	private Symbole motifDos = Symbole.DOS;
	private Symbole motif;
	private boolean visible;



	public Carte(Symbole motifDos, int motif , boolean visible) {
		super();
		this.motifDos = motifDos;
		this.motif= Symbole.get1(motif);
		this.visible = visible;

	}







}

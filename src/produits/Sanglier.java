package produits;

import personnages.Gaulois;

public class Sanglier extends Produit{
	private int poids;
	Gaulois gaulois;

	public Sanglier(int poids, Gaulois gaulois) {
		super("sanglier", Unite.kilogramme);
		this.poids = poids;
		this.gaulois = gaulois;
	}


	@Override
	public String descriptionProduit() {
		return this.getNom()+" de "+poids+" chassé par "+gaulois.getNom();
	}
}

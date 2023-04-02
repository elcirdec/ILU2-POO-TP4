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
		return this.getNom()+" de "+poids+" kg chassé par "+gaulois.getNom();
	}


	@Override
	public double calculerPrix(int prixProduit) {
		return prixProduit*poids;
	}
}

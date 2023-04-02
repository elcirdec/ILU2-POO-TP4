package produits;

public class Poisson extends Produit{
	private String date;
	public Poisson(String date) {
		super("poisson", Unite.parPiece);
		this.date=date;
	}


	@Override
	public String descriptionProduit() {
		return this.getNom()+" p�ch�s "+date;
	}


	@Override
	public double calculerPrix(int prixProduit) {
		return prixProduit;
	}
}

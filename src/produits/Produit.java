package produits;

public abstract class Produit implements IProduit {
	private String nom;
	Unite unite;
	
	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}

	@Override
	public abstract String descriptionProduit();
	
	@Override
	public String getNom() {
		return nom;
	}
	
}

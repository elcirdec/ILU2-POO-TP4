package produits;

public abstract class Produit {
	private String nom;
	Unite unite;
	
	public Produit(String nom, Unite unite) {
		this.nom = nom;
		this.unite = unite;
	}

	public abstract String descriptionProduit();
	
	public String getNom() {
		return nom;
	}
	
}

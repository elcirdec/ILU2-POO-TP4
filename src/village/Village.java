package village;

import personnages.Gaulois;
import produits.Produit;
import villagegaulois.Etal;
import villagegauloisold.DepenseMarchand;

public class Village<P> implements IVillage {	
	@Override
	public <P extends Produit> boolean installerVendeur(Etal<P> etal, Gaulois vendeur, P[] produit, int prix) {
		return installerVendeur(etal,vendeur, produit,prix);
	}

	@Override
	public DepenseMarchand[] acheterProduit(String produit, int quantiteSouhaitee) {
		// TODO Auto-generated method stub
		return null;
	}

}

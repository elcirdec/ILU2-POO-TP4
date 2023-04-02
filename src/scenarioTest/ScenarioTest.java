package scenarioTest;

import personnages.Gaulois;
import produits.*;
//import villagegauloisold.Etal;
//import villagegauloisold.IEtal;
import villagegaulois.Etal;

public class ScenarioTest {
	public static void main(String[] args) {
		//		IEtal[] etals = new IEtal[3];
		//		Etal<Sanglier> etalSanglier = new Etal<>();
		//		etals[0] = etalSanglier;
		//		etals[0].occuperEtal(new Gaulois("Ordralfabétix", 12), new Poisson("lundi"), 10);

		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);

		Sanglier sanglier1 = new Sanglier(2000, obelix);
		Sanglier sanglier2 = new Sanglier(1500, obelix);
		Sanglier sanglier3 = new Sanglier(1000, asterix);
		Sanglier sanglier4 = new Sanglier(500, asterix);
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		Poisson poisson1 = new Poisson("lundi");
		Poisson[] poissons = {poisson1};

		Etal[] marche = new Etal[3];
		Etal<Sanglier> etalSanglier = new Etal<>();
		Etal<Sanglier> etalSanglier2 = new Etal<>();
		Etal<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalSanglier2;
		marche[2] = etalPoisson;

		marche[0].installerVendeur(asterix, sangliersAsterix, 10);
		marche[1].installerVendeur(obelix, sangliersObelix, 8);		
		marche[2].installerVendeur(ordralfabetix, poissons, 7);

		for(int i=0;i<marche.length;i++)
			System.out.println(marche[i].etatEtal());

		String produit="sanglier";
		int quantiteVoulut=3; 
		int quantiteRestante=quantiteVoulut;
		int quantiteDisponible=0;
		int quantiteAcheteTotal=0;
		double prixPayer=0.0;
		for(int i=0;i<marche.length || quantiteRestante!=0;i++) {
			quantiteDisponible=marche[i].contientProduit(produit, quantiteRestante);
			quantiteAcheteTotal+=quantiteDisponible;
			if(quantiteDisponible>0) {
				prixPayer=marche[i].acheterProduit(quantiteDisponible);
				quantiteRestante-=quantiteDisponible;
				System.out.println("A l'etal "+ i + " je paye " +prixPayer +" sous" );
			}
		}
		System.out.println("Je voulais "+quantiteVoulut+" "+produit+", j'en ai acheté "+quantiteAcheteTotal+"\n");

		for(int i=0;i<marche.length;i++)
			System.out.println(marche[i].etatEtal());
	}

}

package tn.esprit.rh.achat.services;

import tn.esprit.rh.achat.entities.Facture;

import java.util.Date;
import java.util.List;

public interface IFactureService {
	List<Facture> retrieveAllFactures();

	//List<Facture> getFacturesByFournisseur(Long idFournisseur);

	Facture addFacture(Facture f);

	//void cancelFacture(Long id);

	/*
	 * calculer les montants remise et le montant total d'un détail facture
	 * ainsi que les montants d'une facture
	 */
	//private Facture addDetailsFacture(Facture f, Set<DetailFacture> detailsFacture) {
		//float montantFacture = 0;
		//float montantRemise = 0;
		//for (DetailFacture detail : detailsFacture) {
			///Récuperer le produit
			//Produit produit = produitRepository.findById(detail.getProduit().getIdProduit()).get();
			//Calculer le montant total pour chaque détail Facture
			//float prixTotalDetail = detail.getQteCommandee() * produit.getPrix();
			//Calculer le montant remise pour chaque détail Facture
			//float montantRemiseDetail = (prixTotalDetail * detail.getPourcentageRemise()) / 100;
			//float prixTotalDetailRemise = prixTotalDetail - montantRemiseDetail;
			//detail.setMontantRemise(montantRemiseDetail);
			//detail.setPrixTotalDetail(prixTotalDetailRemise);
			//Calculer le montant total pour la facture
			//montantFacture = montantFacture + prixTotalDetailRemise;
			//Calculer le montant remise pour la facture
			//montantRemise = montantRemise + montantRemiseDetail;
			//detailFactureRepository.save(detail);
		//}
		//f.setMontantFacture(montantFacture);
		//f.setMontantRemise(montantRemise);
		//return f;
	//}
	//void deleteFacture(Long produitId);

	Facture retrieveFacture(Long id);
	
	//void assignOperateurToFacture(Long idOperateur, Long idFacture);

	//float pourcentageRecouvrement(Date startDate, Date endDate);

}
